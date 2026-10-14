using Microsoft.AspNetCore.Mvc; 
using Microsoft.AspNetCore.Mvc.RazorPages; 
using Npgsql;
using DotNetEnv;

namespace razorpagedatabase_app.Pages;

public class UsersModel : PageModel { 
   public string connectionString;

   public string message = "";

   public List<User> users = new List<User>();

   public async Task OnGetAsync() { 
      try { 
         Env.Load();

         connectionString = new NpgsqlConnectionStringBuilder { 
            Host = Environment.GetEnvironmentVariable("DB_SERVER"), 
            Port = int.TryParse( Environment.GetEnvironmentVariable("DB_PORT"), out var port) ? port : 5432, 
            Database = Environment.GetEnvironmentVariable("DB_NAME"), 
            Username = Environment.GetEnvironmentVariable("DB_USER"), 
            Password = Environment.GetEnvironmentVariable("DB_PASSWORD")
         }.ConnectionString;

         await using var connection = new NpgsqlConnection(connectionString); 
         await connection.OpenAsync();

         message = "Database connected successfully"; 

         string query = "select * from users;";

         await using var command = new NpgsqlCommand(query, connection);

         await using var reader = await command.ExecuteReaderAsync();

         while (await reader.ReadAsync()) { 
            users.Add(
               new User { 
                  Index = reader.GetInt32(reader.GetOrdinal("index")), 
                  Name = reader.GetString(reader.GetOrdinal("name")), 
                  Email = reader.GetString(reader.GetOrdinal("email")) 
               }
            ); 
         } 
      } catch (Exception ex) { 
         message = "Failed to connect with DB: " + ex.Message; 
      } 
   } 
}

public class User { 
   public int Index { get; set; } 
   public string Name { get; set; } = string.Empty; 
   public string Email { get; set; } = string.Empty; 
}