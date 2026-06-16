int int_number = 10;
double double_number = int_number;
Console.WriteLine("double_number: " + double_number);

double double_number_two = 10.00;
int int_number_two = (int)double_number_two;
Console.WriteLine("int_number_two: " + int_number_two);


string string_one = "10";
int int_number_three = int.Parse(string_one);
Console.WriteLine("int_number_three: " + int_number_three);

string string_two =  "true";
bool bool_one = Convert.ToBoolean(string_two);
Console.WriteLine("bool_one: " + bool_one);