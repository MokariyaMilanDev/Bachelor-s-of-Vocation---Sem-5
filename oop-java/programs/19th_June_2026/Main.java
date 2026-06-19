import java.util.ArrayList;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      write_a_program_two_enter_string_and_compare();
      // check_vote_eligibilty();
      // check_number_status();
      // print_n_number_via_loop(10);
      // calcFactorial(10);

      // ArrayList<String> fruits = new ArrayList<>();
      // fruits.add("Apple");
      // fruits.add("Banana");
      // fruits.add("Cherry");
      // print_array_list_via_for_each(fruits);

      // ArrayList<Integer> numbers = new ArrayList<>();
      // numbers.add(1);
      // numbers.add(2);
      // numbers.add(3);
      // print_only_even_number_from_array(numbers);

      // print_sunday_monday(3);
   }

   static void check_vote_eligibilty() {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter your age: ");
      int age = scanner.nextInt();
      if (age > 18) {
         System.err.println("You are eligible to vote");
      } else {
         System.err.println("You aren't eligible for vote.");
      }
   }

   static void check_number_status() {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter your an number: ");
      int number = scanner.nextInt();
      if (number < 0) {
         System.err.println("Number is Negative");
      } else if (number > 0) {
         System.err.println("Number is Positive");
      } else {
         System.err.println("Number is Zero");
      }
   }

   static void print_n_number_via_loop(int n) {
      int i = 0;
      while (i < n) {
         System.err.println("i = " + i);
         i++;
      }
   }

   static double calcFactorial(int number) {
      if (number == 0 || number == 1)
         return 0;

      int factorial = 1;
      while (number > 0) {
         factorial *= number;
         number--;
      }
      return factorial;
   }

   static void print_array_list_via_for_each(ArrayList<String> arr) {
      arr.forEach(item -> System.out.println("item = " + item));
   }

   static void print_only_even_number_from_array(ArrayList<Integer> arr) {
      arr.forEach(number -> {
         if (number % 2 == 0) {
            System.out.println("number = " + number);
         }
      });
   }

   static void print_sunday_monday(int dayOfWeek) {
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

   static void write_a_program_two_enter_string_and_compare() {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter first string: ");
      String v1 = scanner.next();
      System.out.print("Enter two string: ");
      String v2 = scanner.next();
      int isEqual = v1.compareTo(v2);
      System.out.println("isEqual : " + isEqual);
      if (isEqual == 0) {
         System.out.println("Yes");
      } else {
         System.out.println("No");
      }
   }
}
