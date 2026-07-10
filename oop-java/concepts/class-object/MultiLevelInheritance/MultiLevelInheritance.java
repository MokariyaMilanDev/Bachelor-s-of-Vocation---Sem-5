
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

class C extends B {
   void printFromC() {
      System.out.println("Print From C! and Love from devs");
   }
}

public class MultiLevelInheritance {
   public static void main(String[] args) {
      C c = new C();
      c.printFromA();
      c.printFromB();
      c.printFromC();
   }
}
