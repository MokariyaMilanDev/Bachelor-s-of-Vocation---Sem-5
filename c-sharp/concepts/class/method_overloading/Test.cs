using System;

class Test{
   static int add(int a, int b){
      return a + b;
   }

   static int add(int a, int b, int c){
      return a + b + c;
   }

   static int add(int a, int b, int c, int d){
      return a + b + c + d;
   }

   public static void Main(string[] args){
      Console.WriteLine("Hello from Developer!");
      Console.WriteLine(add(1, 2));
      Console.WriteLine(add(1, 2, 3));
      Console.WriteLine(add(1, 2, 3, 4));
   }
}

