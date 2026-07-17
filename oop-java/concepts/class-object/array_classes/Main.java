import java.util.ArrayList;

class A {
   void printFromA() {
      System.out.println("Print From A! and Love from devs");
   }
}

class B extends A {
   void printFromB() {
      System.out.println("Print From B! and Love from devs");
   }
}

public class Main {
   public static void main(String[] args) {
      A a = new A();
      B b = new B();
      ArrayList<B> classes = new ArrayList<B>();
      classes.add(new B());
      classes.add(b);
   }
}
