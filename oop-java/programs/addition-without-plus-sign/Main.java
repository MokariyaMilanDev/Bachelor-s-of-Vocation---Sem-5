
public class Main {
   public static void main(String[] args) {
      int a = 5;
      int b = 10;
      int sum = addWithoutPlus(a, b);
      System.out.println("The sum of " + a + " and " + b + " is: " + sum);
   }

   //? 1. Using Bitwise Operators
   // public static int addWithoutPlus(int a, int b) {
   //    while (b != 0) {
   //       int carry = a & b;
   //       a = a ^ b;
   //       b = carry << 1;
   //    }
   //    return a;
   // }

   //? 2. Using Arithmetic Operators
   public static int addWithoutPlus(int a, int b) {
      return a - (-b);
   }
}  
