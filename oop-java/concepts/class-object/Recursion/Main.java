public class Main {

   // Recursive method to calculate factorial
   static int factorial(int n) {
      if (n == 0 || n == 1) {
         return 1;
      }
      return n * factorial(n - 1);
   }

   public static void main(String[] args) {
      int number = 5; // Change this value as needed

      int result = factorial(number);

      System.out.println("Factorial of " + number + " is " + result);
   }
}