// See https://aka.ms/new-console-template for more information
Console.WriteLine("Hello, World!");
Console.WriteLine("Enter Your Name: ");
string name = Console.ReadLine();
Console.WriteLine("Hello, " + name + "!");

//? date & time
DateTime today = System.DateTime.Now;
Console.WriteLine("Today's date is: " + today);

//? int
Console.WriteLine("Test for int: ");
int number = int.Parse(Console.ReadLine());
Console.WriteLine("You entered: " + number);

//? double
Console.WriteLine("Test for double: ");
double decimalNumber = double.Parse(Console.ReadLine());
Console.WriteLine("You entered: " + decimalNumber);

//? bool
Console.WriteLine("Test for bool: ");
bool isTrue = bool.Parse(Console.ReadLine());
Console.WriteLine("You entered: " + isTrue);

//? char
Console.WriteLine("Test for char: ");
char character = char.Parse(Console.ReadLine());
Console.WriteLine("You entered: " + character);


//? dynamic
dynamic isBorder = "true";
isBorder.lenght; //> This will throw a runtime error because 'lenght' is not a valid property of a string.

//? object
object isBorderObject = "true";
isBorderObject.lenght; //> This will also throw a runtime error because 'lenght' is not a valid property of an object.