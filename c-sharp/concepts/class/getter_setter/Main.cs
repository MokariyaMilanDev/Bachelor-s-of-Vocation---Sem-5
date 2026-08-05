using System;


class Student {
   public string name;
   // public string name{
   //    get {
   //       return name
   //    }
   //    set {
   //       name = value;
   //    }
   // }

   public int age;
   // public int age{
   //    get {
   //       return age
   //    }
   //    set {
   //       age = value;
   //    }
   // }
}


class StudentTwo{
   private string name;
   private int age;

   public void setName(string name){
      this.name = name;
   }

   public string getName(){
      return this.name;
   }


   public void setAge(int age){
      this.age = age;
   }

   public int getAge(){
      return this.age;
   }

   public string Name{
      set {
         name = value;
      }
      get{
         return name;
      }
   }

   public int Age {
      set {
         age = value;
      }
      get {
         return age;
      }
   }
}

public class GetterSetter{
   public static void Main(string[] agrs){
      // Console.WriteLine("...");
      // Student student = new Student();
      // student.name = Console.ReadLine();
      // while(student.age){
      //    try{
      //       Console.WriteLine("Enter your age: ");
      //       student.age = int.Parse(Console.ReadLine());
      //    }catch{
      //       Console.WriteLine("Please enter validate number input!");
      //    }
      // }
      // Console.WriteLine("Student Name: " + student.name);
      // Console.WriteLine("Student Age: " + student.age);


      StudentTwo student = new StudentTwo();
      student.setName("Test");
      student.setAge(19);
      Console.WriteLine(student.getName());
      Console.WriteLine(student.getAge());

      student.Name = "__TEST__";
      student.Age = 20;
      Console.WriteLine(student.Name);
      Console.WriteLine(student.Age);
   }
}


