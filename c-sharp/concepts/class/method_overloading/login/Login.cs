using System;

class Login{
   static void login(
      string email,
      string password
   ){
      Console.WriteLine("Init auth uing email & password...");
   }

   static void login(
      string token
   ){
      Console.WriteLine("Init auth using token...");
   }

   static void login(
      long mobile,
      long otp
   ){
      Console.WriteLine("Init auth using mobile & otp...");
   }

   public static void Main(string[] args){
      login("m@m.com", "pass");
      login("TOKEN");
      login(9106854230, 123123);
   }
}

