public class Main {
   public static void main(String[] args) {
      int number = 10;

      // If-else statement
      if (number > 0) {
         System.out.println("The number is positive.");
      } else if (number < 0) {
         System.out.println("The number is negative.");
      } else {
         System.out.println("The number is zero.");
      }

      // Nested If
      int a = 10, b = 50, c = 30;
      if (a > b) {
         if (a > c) {
            System.out.println("A > B & C");
         } else {
            System.out.println("C > A & B");
         }
      } else {
         if (b > c) {
            System.out.println("B > A & C");
         } else {
            System.out.println("C > A & B");
         }
      }

      // Switch statement
      int dayOfWeek = 3;
      switch (dayOfWeek) {
         case 1:
            System.out.println("Monday");
            break;
         case 2:
            System.out.println("Tuesday");
            break;
         case 3:
            System.out.println("Wednesday");
            break;
         case 4:
            System.out.println("Thursday");
            break;
         case 5:
            System.out.println("Friday");
            break;
         case 6:
            System.out.println("Saturday");
            break;
         case 7:
            System.out.println("Sunday");
            break;
         default:
            System.out.println("Invalid day of the week.");
      }
   }
}

class Calculator {
   String _for = "+";

   Calculator(String _for) {
      this._for = _for;
   }

   double calc(double numberOne, double numberTwo) {
      switch (_for) {
         case "+":
            return numberOne + numberTwo;
         case "-":
            return numberOne - numberTwo;
         case "*":
            return numberOne * numberTwo;
         case "/":
            return numberOne / numberTwo;
         case "%":
            return numberOne % numberTwo;
         default:
            System.err.println("__X_Error__ Operator doesn't support");
            return 0.0;
      }
   }
}
