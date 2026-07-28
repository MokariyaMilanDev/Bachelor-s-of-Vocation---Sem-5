using System;

class Lambda{

   public static void Main(String[] args){
      Console.WriteLine("Hello from RKU's Devs!");
      Func<int, int, int> sum = (a, b) => a + b;
      Func<double, double, double> sub = (a, b) => a - b;
      Console.WriteLine(sum(1, 1));
      Console.WriteLine(sub(1.0, 1.0));
   }
}
