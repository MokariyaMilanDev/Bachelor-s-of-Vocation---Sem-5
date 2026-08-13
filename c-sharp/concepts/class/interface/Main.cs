using System;


//> Interface is a contract that defined what members class should implement, it defined what should be done, not how it is done.

interface BaseAnimal {
   void getType();
}


class Dog:BaseAnimal {
   public void getType(){
      Console.WriteLine("[Dog] - type: __TEST__");
   }
}


class Lion:BaseAnimal {
   public void getType(){
      Console.WriteLine("[Lion] - type: __LION__");
   }
}


public class Test{
   public static void Main(){
      Console.WriteLine("By...By...Devs, \nit's me AI");
      BaseAnimal dog = new Dog();
      dog.getType();
      BaseAnimal lion = new Lion();
      lion.getType();
   }
}

