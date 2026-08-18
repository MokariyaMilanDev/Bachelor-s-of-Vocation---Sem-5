using System;


//? Single
class Animal{
   public void sound(){
      Console.WriteLine("Sound from Animal");
   }
}

class Dog : Animal{
   public void sound(){
      Console.WriteLine("Sound from Dog");
   }
}


//? Multiple
class Cat : Animal {
   public void sound(){
      Console.WriteLine("Sound from Cat");
   }
}


//? Multi-level
class MaleDog: Dog{
   public void sound(){
      Console.WriteLine("Sound from Male Dog");
   }
}



public class Inheritance{
   public static void Main(){
      Animal animal =  new Animal();
      Dog dog =  new Dog();
      MaleDog maleDog = new MaleDog();
      Cat cat =  new Cat();
      animal.sound();
      dog.sound();
      maleDog.sound();
      cat.sound();
   }
}


