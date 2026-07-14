using System;


class UserDefinedFunctions {

   internal class methods {
      static void simpleFunc(){
         Console.WriteLine("called simpleFunc()");
      }

      static void logSystemTime(){
         string log = $"system time {DateTime.Now}";
         System.IO.File.AppendAllText("log.txt", log + Environment.NewLine);
         Console.WriteLine("[Log] Stored");
      }

      static int returnType(){
         return 1;
      }

      static void argType(int number){
         Console.WriteLine($"arg type: {number}");
      }

      static int argWithReturnType(int number){
         return number * 2;
      }

      static void Main(string[] args){
         simpleFunc();
         logSystemTime();
         Console.WriteLine($"> {returnType()}");
         argType(100);
         Console.WriteLine($"> {argWithReturnType(100)}");
      }
   }
}

