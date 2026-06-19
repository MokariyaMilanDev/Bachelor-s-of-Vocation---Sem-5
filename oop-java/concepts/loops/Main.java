public class Main {
   public static void main(String[] args) {
      for (int i = 0; i < 10; i++) {
         System.err.println("i : " + i);
      }

      int i = 0;
      while (i < 10) {
         System.err.println("i : " + i);
         i++;
      }

      System.err.println("sum: " + calcSumTill(10));
      System.err.println("Harmonic sum: " + calcHarmonicSumTill(10));
      System.err.println("Factorial : " + calcFactoial(10));
   }

   private static int calcSumTill(int number) {
      int sum = 0;
      while (number > 0) {
         sum += number;
         number--;
      }
      return sum;
   }

   private static double calcHarmonicSumTill(double number) {
      double sum = 0;
      while (number > 0) {
         sum += (1 / number);
         number--;
      }
      return sum;
   }

   private static double calcFactorial(int number) {
      if (number == 0 || number == 1)
         return 0;

      int factorial = 1;
      while (number > 0) {
         factorial *= number;
         number--;
      }
      return factorial;
   }

}
