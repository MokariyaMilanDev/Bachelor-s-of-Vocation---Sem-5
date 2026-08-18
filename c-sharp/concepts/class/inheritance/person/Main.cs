using System;


class Person {
   public string name;

   public Person(string name){
      Console.WriteLine($"Person()");
      this.name = name;
   }
   
   public void display(){
      Console.WriteLine($"Person - {this.name}");
   }
}

class Employee : Person {
   public Employee(string name): base(name){
      Console.WriteLine($"Employee:Person()");
   }

   public void display(){
      Console.WriteLine($"Employee:Person - {this.name}");
   }
}

class Manager : Employee {
   public Manager(string name): base(name){
      Console.WriteLine($"Manager:Employee()");
   }

   public void display(){
      Console.WriteLine($"Manager:Employee - {this.name}");
   }
}


public class Inheritance{
   public static void Main(){
      Person person = new Person("P1");
      Employee employee = new Employee("E1");
      Manager manager = new Manager("M1");
      person.display();
      employee.display();
      manager.display();
   }
}
