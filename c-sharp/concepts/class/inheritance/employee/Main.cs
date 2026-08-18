using System;


class Employee {
   public string name;

   public Employee(string name){
      Console.WriteLine("Employee...");
      this.name = name;
   }

   public void print(){
      Console.WriteLine($"Details of {this.name} Employee");
   }
}


class Developer : Employee {
   public string language;

   public Developer(string name, string language): base(name){
      this.language = language;
      Console.WriteLine("Developer:Employee...");
   }

   public void print(){
      Console.WriteLine($"Details of {this.name} Developer:Employee which know {this.language}");
   }
}



public class Inheritance{
   public static void Main(){
      Employee employee = new Employee("1");
      Developer developer = new Developer("1", "C#");
      employee.print();
      developer.print();
   }
}

