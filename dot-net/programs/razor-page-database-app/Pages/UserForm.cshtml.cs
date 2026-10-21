using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Npgsql;
using DotNetEnv;

namespace razorpagedatabase_app.Pages;

public class UserFormModel : PageModel
{
    public int? TotalUsersCount { get; set; } 

    [BindProperty]
    public string Name { get; set; } = string.Empty;

    [BindProperty]
    public string Email { get; set; } = string.Empty;

    public string Message { get; set; } = string.Empty;

    private string GetConnectionString()
    {
        Env.Load();

        return new NpgsqlConnectionStringBuilder
        {
            Host = Environment.GetEnvironmentVariable("DB_SERVER"),
            Port = int.TryParse(
                Environment.GetEnvironmentVariable("DB_PORT"),
                out var port) ? port : 5432,
            Database = Environment.GetEnvironmentVariable("DB_NAME"),
            Username = Environment.GetEnvironmentVariable("DB_USER"),
            Password = Environment.GetEnvironmentVariable("DB_PASSWORD")
        }.ConnectionString;
    }

    private async Task<int> GetTotalUsersCountAsync(
    NpgsqlConnection connection)
{
    const string query = "SELECT COUNT(*) FROM users;";

    await using var command = new NpgsqlCommand(query, connection);

    return Convert.ToInt32(await command.ExecuteScalarAsync());
}

    public async Task OnGetAsync()
   {
      try
      {
         await using var connection =
               new NpgsqlConnection(GetConnectionString());

         await connection.OpenAsync();

         TotalUsersCount = await GetTotalUsersCountAsync(connection);

         Message = $"Database connected successfully. Total users: {TotalUsersCount}";
      }
      catch (Exception ex)
      {
         Message = "Database connection failed: " + ex.Message;
      }
   }

    public async Task<IActionResult> OnPostAsync()
{
    if (string.IsNullOrWhiteSpace(Name) ||
        string.IsNullOrWhiteSpace(Email))
    {
        Message = "Name and email are required.";
        return Page();
    }

    try
    {
        await using var connection =
            new NpgsqlConnection(GetConnectionString());

        await connection.OpenAsync();

        int totalUsersCount =
            await GetTotalUsersCountAsync(connection);

        const string query = """
            INSERT INTO users (index, name, email)
            VALUES (@index, @name, @email);
            """;

        await using var command =
            new NpgsqlCommand(query, connection);

        command.Parameters.AddWithValue(
            "index", totalUsersCount + 1);

        command.Parameters.AddWithValue("name", Name.Trim());
        command.Parameters.AddWithValue("email", Email.Trim());

        await command.ExecuteNonQueryAsync();

        Message = "User inserted successfully!";

        ModelState.Clear();
        Name = string.Empty;
        Email = string.Empty;

        TotalUsersCount = totalUsersCount + 1;
    }
    catch (Exception ex)
    {
        Message = "Failed to insert user: " + ex.Message;
    }

    return Page();
}
}
