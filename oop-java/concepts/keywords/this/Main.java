
public class Main {
   final private String name;

   private String getName() {
      return this.name;
   }

   public Main(String name) {
      this.name = name;
   }

   public static void main(String[] args) {
      Main main = new Main("TEST");
      System.err.println("Name: " + main.getName());
   }
}
