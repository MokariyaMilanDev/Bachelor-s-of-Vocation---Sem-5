
public class Main {
   // > Q.1
   static Integer findSum(int[] numbers) {
      System.out.println("[findSum](" + numbers.toString() + ")");
      Integer sum = 0;
      for (int num : numbers) {
         System.out.println("[findSum]{int num : numbers}" + " | num:" + num + " sum:" + sum);
         sum += num;
      }
      System.out.println("[findSum]{sum} " + sum);
      return sum;
   }

   // > Q.2 - Write a program to calculate an array and print max element
   static int findMax(int[] numbers) {
      int max = numbers[0];
      for (int i = 0; i < numbers.length - 1; i++) {
         int nextNum = numbers[i + 1];
         // System.err.println("max " + max);
         // System.err.println("nextNum " + nextNum);
         if (max < nextNum) {
            // System.err.println("max > nextNum " + max + " | " + nextNum);
            max = nextNum;
         }
      }
      return max;
   }

   // > Q.3 - Write a program to create an array and sort their elements (ASC and
   // > DESC)
   // ! Not Completed
   static int[] sort(int[] numbers) {
      int first = numbers[0];
      System.err.println("first " + first);
      int[] sorted = new int[numbers.length];
      for (int i = 0; i < numbers.length - 1; i++) {
         int nextIndex = i + 1;
         int nextNum = numbers[nextIndex];
         System.err.println("nextIndex " + nextIndex);
         System.err.println("nextNum " + nextNum);
         // num = 1 and max = 1
         if (first < nextNum) {
            // System.err.println("max > nextNum " + max + " | " + nextNum);
            sorted[nextIndex] = nextNum;
         }
      }
      return sorted;
   }

   // > Q.4 - Write a programe to create an arrat and check enter element present
   // > inside array or not (searching)
   static boolean doesExists(int target, int[] numbers) {
      for (int number : numbers) {
         if (number == target) {
            return true;
         }
      }
      return false;
   }

   // > Q.5 - Row major array with example
   static void printTwoDArray(int[][] numbers) {
      for (int[] array : numbers) {
         for (int number : array) {
            System.err.print(number + ", ");
         }
      }
   }

   public static void main(String[] args) {
      // int numbers[] = { 1, 2, 9, 4, 5 };
      // findSum(numbers);
      // for (Object elem : sort(numbers)) {
      // System.err.println(" > " + elem);
      // }
      // findSum(sort(numbers));
      // System.err.println(findMax(numbers));
      // System.err.println(sort(numbers));
      // System.err.println("" + doesExists(5, numbers));

      int numbers[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
      printTwoDArray(numbers);
   }
}
