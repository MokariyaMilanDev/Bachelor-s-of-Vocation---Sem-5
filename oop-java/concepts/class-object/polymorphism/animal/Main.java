
class Animal {
   void bark(String name) {
      System.out.println("{String} Animal " + name + " is barking...");
   }
}

class Dog extends Animal {
   void bark(int name) {
      System.out.println("{int} Dog " + name + " is barking...");
   }
}

public class Main {
   public static void main(String[] args) {
      Animal animal = new Animal();
      animal.bark("Test");
      Dog dog = new Dog();
      dog.bark("fdf");
      dog.bark(1);
   }
}
