public class Main {
      public static void main(String[] args) {
            int age = 10;
            adultOrNot(age);

            int num1 = 5;
            int num2 = 10;
            compareNumbers(num1, num2);

            int number = 7;
            checkOddEven(number);

            int divisor = 3;
            int dividend = 9;
            canDivisibleBy(divisor, dividend);

            double workingHours = 50;
            double pricePerHour = 100;
            double requiredWorkingHours = 40;
            calculateEarnings(workingHours, pricePerHour, requiredWorkingHours);

            int x = -5;
            int y = 10;
            checkWhichQuadrant(x, y);
      }

      // ? Method to check if a person is an adult or not based on their age
      static void adultOrNot(int age) {
            if (age > 18) {
                  System.out.println("You are an adult.");
            } else {
                  System.out.println("You are not an adult.");
            }
      }

      // ? Method to compare two numbers and print the result
      static void compareNumbers(int num1, int num2) {
            if (num1 > num2) {
                  System.out.println(num1 + " is greater than " + num2);
            } else if (num1 < num2) {
                  System.out.println(num1 + " is less than " + num2);
            } else {
                  System.out.println(num1 + " is equal to " + num2);
            }
      }

      // ? Method to check if a number is odd or even
      static void checkOddEven(int number) {
            if (number % 2 == 0) {
                  System.out.println(number + " is an even number.");
            } else {
                  System.out.println(number + " is an odd number.");
            }
      }

      // ? Method to check if a number is divisible by another number
      static void canDivisibleBy(int divisor, int dividend) {
            if (dividend % divisor == 0) {
                  System.out.println(dividend + " is divisible by " + divisor);
            } else {
                  System.out.println(dividend + " is not divisible by " + divisor);
            }
      }

      // ? Method to calculate total earnings based on working hours and hourly rate
      static void calculateEarnings(double workingHours, double pricePerHour, double requiredWorkingHours) {
            double totalEarnings = workingHours * pricePerHour;
            double overtimeEarnings = 0;
            if (workingHours > requiredWorkingHours) {
                  double overtimeHours = workingHours - requiredWorkingHours;
                  overtimeEarnings = overtimeHours * pricePerHour * 2; // Overtime pay is 2 times the regular rate
            }
            totalEarnings += overtimeEarnings;
            System.out.println("Total earnings: " + totalEarnings + " (including overtime earnings: " + overtimeEarnings
                        + ")");
      }

      static void checkWhichQuadrant(int x, int y) {
            if (x > 0 && y > 0) {
                  System.out.println("The point (" + x + ", " + y + ") is in the first quadrant.");
            } else if (x < 0 && y > 0) {
                  System.out.println("The point (" + x + ", " + y + ") is in the second quadrant.");
            } else if (x < 0 && y < 0) {
                  System.out.println("The point (" + x + ", " + y + ") is in the third quadrant.");
            } else if (x > 0 && y < 0) {
                  System.out.println("The point (" + x + ", " + y + ") is in the fourth quadrant.");
            } else if (x == 0 && y == 0) {
                  System.out.println("The point (" + x + ", " + y + ") is at the origin.");
            } else if (x == 0) {
                  System.out.println("The point (" + x + ", " + y + ") is on the Y-axis.");
            } else if (y == 0) {
                  System.out.println("The point (" + x + ", " + y + ") is on the X-axis.");
            }
      }
}
