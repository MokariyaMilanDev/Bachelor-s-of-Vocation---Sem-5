using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;

namespace webapp.Pages;

public class ProductModel : PageModel
{
    private readonly ILogger<ProductModel> _logger;

    public ProductModel(ILogger<ProductModel> logger)
    {
        _logger = logger;
    }

    public List<Product> Products { get; set; } = new()
    {
        new Product
        {
            Id = 1,
            Name = "Laptop",
            Description = "15-inch business laptop",
            Price = 75000,
            Category = "Electronics"
        },
        new Product
        {
            Id = 2,
            Name = "Wireless Mouse",
            Description = "Ergonomic wireless mouse",
            Price = 1200,
            Category = "Accessories"
        },
        new Product
        {
            Id = 3,
            Name = "Mechanical Keyboard",
            Description = "RGB mechanical keyboard",
            Price = 3500,
            Category = "Accessories"
        }
    };

    [BindProperty]
    public Product Product { get; set; } = new();

    public void OnGet()
    {
    }

    public IActionResult OnPostSave()
    {
        if (Product.Id == 0)
        {
            // Add
            var newId = Products.Count == 0
                ? 1
                : Products.Max(x => x.Id) + 1;

            Product.Id = newId;

            Products.Add(Product);
        }
        else
        {
            // Update
            var existingProduct = Products
                .FirstOrDefault(x => x.Id == Product.Id);

            if (existingProduct != null)
            {
                existingProduct.Name = Product.Name;
                existingProduct.Description = Product.Description;
                existingProduct.Price = Product.Price;
                existingProduct.Category = Product.Category;
            }
        }

        return Page();
    }

    public IActionResult OnPostDelete(int id)
    {
        var product = Products.FirstOrDefault(x => x.Id == id);

        if (product != null)
        {
            Products.Remove(product);
        }

        return Page();
    }
}

public class Product
{
    public int Id { get; set; }

    public string Name { get; set; } = string.Empty;

    public string Description { get; set; } = string.Empty;

    public decimal Price { get; set; }

    public string Category { get; set; } = string.Empty;
}
