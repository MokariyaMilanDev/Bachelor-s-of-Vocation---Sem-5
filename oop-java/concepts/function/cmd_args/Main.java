
public class Main {
   String name;

   public Main(String name) {
      this.name = name;
   }

   public static void main(String[] args) {
      // System.err.println("args 1 : " + args[0]);
      Main a = new Main("TEST");
      System.err.println("Car : " + a.name);
   }

   @Override
   public String toString() {
      return "A " + name;
   }
}
