using Microsoft.Data.SqlClient;
using DotNetEnv;

Env.Load();

var builder = WebApplication.CreateBuilder(args);
var app = builder.Build();

app.MapGet("/", async () =>
{
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

    return "Connected successfully!";
});

app.Run();
