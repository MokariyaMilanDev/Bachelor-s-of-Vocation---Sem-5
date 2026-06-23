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