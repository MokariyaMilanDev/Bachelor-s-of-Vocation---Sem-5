using System;

class Employee{
   public string id { get; set; }
   public string name { get; set; }

   public void Login(){
      Console.WriteLine("Login");
   }

   public void Logout(){
      Console.WriteLine("Logout");
   }
}


interface IDeveloper {
   void Developer();
}

interface ITester {
   void Tester();
}

interface IManager {
   void Manager();
}


class TeamLeader : Employee, IDeveloper, IManager, ITester {
   public void Developer(){
      Console.WriteLine("Developer!");
   }

   public void Tester(){
      Console.WriteLine("Tester!");
   }

   public void Manager(){
      Console.WriteLine("Manager!");
   }
}


public class Inheritance{
   public static void Main(){
      TeamLeader collegeLeader = new TeamLeader{ id = "1", name = "TEST" };
      Console.WriteLine(collegeLeader.id + " | " + collegeLeader.name);
   }
}




