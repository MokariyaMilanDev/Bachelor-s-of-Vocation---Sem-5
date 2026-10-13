using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Microsoft.Data.SqlClient;
using DotNetEnv;

Env.Load();

namespace razor_page_database_app.Pages;

public class UsersModel : PageModel
{
   public string message = "";

    public void OnGet()
    {
      try{
         var connectionString = new SqlConnectionStringBuilder
         {
            DataSource = Environment.GetEnvironmentVariable("DB_SERVER"),
            InitialCatalog = Environment.GetEnvironmentVariable("DB_NAME"),
            UserID = Environment.GetEnvironmentVariable("DB_USER"),
            Password = Environment.GetEnvironmentVariable("DB_PASSWORD"),
            TrustServerCertificate = true
         }.ConnectionString;

         await using var connection = new SqlConnection(connectionString);
         await connection.OpenAsync();
         massage = "DB connected sucessfully";
      }catch {
         massage = "Failed to connect with DB";
      }
    }
}

