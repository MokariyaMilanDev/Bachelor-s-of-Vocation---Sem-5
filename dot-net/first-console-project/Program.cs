// // See https://aka.ms/new-console-template for more information
// Console.WriteLine("Hello, World!");
// Console.WriteLine("Enter Your Name: ");
// string name = Console.ReadLine();
// Console.WriteLine("Hello, " + name + "!");

// //? date & time
// DateTime today = System.DateTime.Now;
// Console.WriteLine("Today's date is: " + today);

// //? int
// Console.WriteLine("Test for int: ");
// int number = int.Parse(Console.ReadLine());
// Console.WriteLine("You entered: " + number);

// //? double
// Console.WriteLine("Test for double: ");
// double decimalNumber = double.Parse(Console.ReadLine());
// Console.WriteLine("You entered: " + decimalNumber);

// //? bool
// Console.WriteLine("Test for bool: ");
// bool isTrue = bool.Parse(Console.ReadLine());
// Console.WriteLine("You entered: " + isTrue);

// //? char
// Console.WriteLine("Test for char: ");
// char character = char.Parse(Console.ReadLine());
// Console.WriteLine("You entered: " + character);


// //? dynamic
// dynamic isBorder = "true";
// isBorder.lenght; //> This will throw a runtime error because 'lenght' is not a valid property of a string.

// //? object
// object isBorderObject = "true";
// isBorderObject.lenght; //> This will also throw a runtime error because 'lenght' is not a valid property of an object.



//> --- --- ---

Console.WriteLine("Hello, Developer World!");
Console.WriteLine("Love from C#!");

//? Int
Console.WriteLine("Enter Your Age: ");
int age = int.Parse(Console.ReadLine());
Console.WriteLine("Your age(int.Parse()): " + age);
Console.WriteLine("Your age(ToString()): " + age.ToString());
Console.WriteLine("Your age(GetType()): " + age.GetType());
Console.WriteLine("Your age(CompareTo(int Number)): " + age.CompareTo(19));
Console.WriteLine("Your age(Equals(int Number)): " + age.Equals(19));

//> Currency
Console.WriteLine("Your age(ToString('C')): " + age.ToString("C"));
//> Display number with commas
Console.WriteLine("Your age(ToString('N')): " + age.ToString("N"));
//> Hexadecimal
Console.WriteLine("Your age(ToString('X')): " + age.ToString("X"));
//> Binary
//> 8 
//? 8 % 2 = 0 (4)
//? 4 % 2 = 0 (2)
//? 2 % 2 = 0 (1)
//? 1 % 2 = 1 (0.5)
//! 8 (Number) = 1000 (Binary)
Console.WriteLine("Your age(Convert.ToString(x Number, 2)): " + Convert.ToString(age, 2));

//> Positive (1), Nagative (-1) and Zero (0)
Console.WriteLine("Your age(Math.Sign(x Number)): " + Math.Sign(age));
Console.WriteLine("Your age(Math.Abs(x Number)): " + Math.Abs(age));
Console.WriteLine("Your age(Math.Max(x Number, y Number)): " + Math.Max(age, 100));
Console.WriteLine("Your age(Math.Min(x Number, y Number)): " + Math.Min(age, 0));
Console.WriteLine("Your age(Math.Pow(base Number, exponent Number)): " + Math.Pow(age, 2));
Console.WriteLine("Your age(Math.Sqrt(x Number)): " + Math.Sqrt(age));

//> Double
double doubleAge = 9.95634;
Console.WriteLine("Your age(Math.Round(x Double)): " + Math.Round(doubleAge));
Console.WriteLine("Your age(Math.Ceiling(x Double)): " + Math.Ceiling(doubleAge));
Console.WriteLine("Your age(Math.Floor(x Double)): " + Math.Floor(doubleAge));
Console.WriteLine("Your age(Math.Truncate(x Double)): " + Math.Truncate(doubleAge));



//? String
// Console.WriteLine("Enter Your Name: ");
// string name = Console.ReadLine();
// Console.WriteLine("Your Name (Length): " + name.Length);
// Console.WriteLine("Your Name (ToUpper()): " + name.ToUpper());
// Console.WriteLine("Your Name (ToLower()): " + name.ToLower());
// Console.WriteLine("Your Name (Trim()): " + name.Trim());
// Console.WriteLine("Your Name (Substring(index, len)): " + name.Substring(0, 3));
// Console.WriteLine("Your Name (Replace(old, new)): " + name.Replace("Test", "__Test__"));
// Console.WriteLine("Your Name (Contains(value)): " + name.Contains("__Test__"));
// Console.WriteLine("Your Name (StartsWith(value)): " + name.StartsWith("__Test__"));
// Console.WriteLine("Your Name (EndsWith(value)): " + name.EndsWith("__Test__"));
// Console.WriteLine("Your Name (GetType().Name): " + name.GetType().Name);

// Console.WriteLine("Your Name (string.Concat(String stringOne, String stringTwo)): " + string.Concat(name, "!"));
// Console.WriteLine("Your Name (string.Join(String separator, String[] value)): " + string.Join("!", name, " Dev"));