
class A {
   void print() {
      System.out.println("[A] Love from Skill College & RK University");
   }
}

class B extends A {
   void print() {
      System.out.println("[B] Love from Skill College & RK University");
   }
}

public class Main {
   public static void main(String[] args) {
      A a = new A();
      a.print();
      A b = new B();
      b.print();
   }
}
