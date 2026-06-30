import java.util.ArrayList;

public class Main {
   public static void main(String[] args) {
      Integer number = 6;
      ArrayList<Integer> factors = findFactors(number);
      Integer factorsSum = findSum(factors);

      if (isPerfect(number, factorsSum)) {
         System.out.println("Number: " + number + " is perfect number");
      } else {
         System.out.println("Number: " + number + " isn't perfect numer");
      }
   }

   static ArrayList<Integer> findFactors(Integer number) {
      System.out.println("[findFactors](" + number + ")");
      ArrayList<Integer> factors = new ArrayList<>();
      for (Integer i = 1; i < number; i++) {
         if (number % i == 0) {
            System.out.println("[findFactors]{number % i == 0}" + " | Number:" + number + " i:" + i);
            factors.add(i);
         }
      }
      return factors;
   }

   static Integer findSum(ArrayList<Integer> numbers) {
      System.out.println("[findSum](" + numbers + ")");
      Integer sum = 0;
      for (int num : numbers) {
         System.out.println("[findSum]{int num : numbers}" + " | num:" + num + " sum:" + sum);
         sum += num;
      }
      System.out.println("[findSum]{sum} " + sum);
      return sum;
   }

   static boolean isPerfect(Integer number, Integer factorsSum) {
      System.out.println("[isPerfect](" + number + ", " + factorsSum + ")");
      System.out.println("[isPerfect]{number == factorsSum}" + (number == factorsSum));
      return number == factorsSum;
   }
}
