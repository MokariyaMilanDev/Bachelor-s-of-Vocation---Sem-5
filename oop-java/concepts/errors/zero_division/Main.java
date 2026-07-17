
public class Main {
   public static void main(String[] args) {
      try {
         System.out.println(8 / 0);
      } catch (Exception e) {
         System.err.println(e);
         System.err.println("Something went wrong...!");
      } finally {
         System.out.println("Shutting down system...");
      }
   }
}
