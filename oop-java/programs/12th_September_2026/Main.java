public class Main {

   // > Write a program to calculate simple interest.
   public double calcSimpleInterest(double p, double r, int n) {
      return (p * r * n) / 100;
   }

   // > Write a program to check you are eligible or not for vote casting.
   public boolean isEligibleForVote(int age) {
      return age >= 18;
   }

   // > Write a program to enter co-ordination point and check point lies
   // > on which quadrant.
   public int getQudrantByCords(int x, int y) {
      if (x > 0 && y > 0) {
         return 1; // First quadrant
      } else if (x < 0 && y > 0) {
         return 2; // Second quadrant
      } else if (x < 0 && y < 0) {
         return 3; // Third quadrant
      } else if (x > 0 && y < 0) {
         return 4; // Fourth quadrant
      } else {
         return 0; // On X-axis, Y-axis, or origin
      }
   }

   // > Write a program to make simple calculator using switch case.
   public double calculate(int type, double valueOne, double valueTwo) {
      // Type Mapping:
      // 1: Addition
      // 2: Subtraction
      // 3: Multiplication
      // 4: Division

      switch (type) {
         case 1:
            return valueOne + valueTwo;

         case 2:
            return valueOne - valueTwo;

         case 3:
            return valueOne * valueTwo;

         case 4:
            if (valueTwo == 0) {
               throw new ArithmeticException("Cannot divide by zero");
            }
            return valueOne / valueTwo;

         default:
            throw new IllegalArgumentException("Invalid calculator type");
      }
   }

   // > Write a program to print sum 1 to 10
   public int calcSumTill(int number) {
      int sum = 0;
      while (number > 0) {
         sum += number;
         number--;
      }
      return sum;
   }

   // > Write a program to print only even numbers between from and to using while
   // loop
   public void printEvenNumber(int from, int to) {

      while (from <= to) {
         if (from % 2 == 0) {
            System.out.println(from);
         }
         from++;
      }
   }

   // > Write a program to check number is perfect or not
   public boolean isNumberPerfect(int number) {

      if (number <= 0) {
         return false;
      }

      int sum = 0;
      int i = 1;

      while (i < number) {
         if (number % i == 0) {
            sum += i;
         }
         i++;
      }

      return sum == number;
   }

   // > Prime Number
   public boolean isPrimeNumber(int target, int primeNumber) {
      for (int i = 2; i < target; i++) {
         if (target % i == 0 && i == primeNumber) {
            return true;
         }
      }
      return false;
   }

   public static void main(String[] args) {
      Main obj = new Main();

      System.out.println("Simple Interest: "
            + obj.calcSimpleInterest(10000, 5, 2));

      System.out.println("Eligible for Vote: "
            + obj.isEligibleForVote(20));

      System.out.println("Quadrant: "
            + obj.getQudrantByCords(-5, 3));

      System.out.println("Addition: "
            + obj.calculate(1, 10, 5));

      System.out.println("Subtraction: "
            + obj.calculate(2, 10, 5));

      System.out.println("Multiplication: "
            + obj.calculate(3, 10, 5));

      System.out.println("Division: "
            + obj.calculate(4, 10, 5));

      System.out.println("Calculate Sum: "
            + obj.calcSumTill(10));

      obj.printEvenNumber(1, 10);

      System.out.println("Is 10 perfect: " + obj.isNumberPerfect(10));

      System.out.println("" + obj.isPrimeNumber(9, 4));
   }
}
