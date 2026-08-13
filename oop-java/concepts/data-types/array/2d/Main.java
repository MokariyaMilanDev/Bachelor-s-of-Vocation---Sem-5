
public class Main {
   public static void main(String[] args) {
      TimetableManager timetable_manager = new TimetableManager();
      timetable_manager.printSchedules();
      // for (int argIndex = 0; argIndex < args.length; argIndex++) {
      // String elem = args[argIndex];
      // System.err.println("arg " + elem);
      // }

      // int[][] two_d = {
      // {
      // 1, 2, 3
      // },
      // {
      // 4, 5, 6
      // },
      // {
      // 7, 8, 9
      // }
      // };

      // for (int rowIndex = 0; rowIndex < two_d.length; rowIndex++) {
      // int[] row = two_d[rowIndex];
      // for (int colIndex = 0; colIndex < two_d.length; colIndex++) {
      // int number = row[colIndex];
      // System.err.println("number : " + rowIndex + " | " + colIndex + " | " +
      // number);
      // }
      // }
   }
}

class TimetableManager {
   private String[] sunday_monday = { "Sunday", "Monday", "Tuesday" };
   private String[][] schedules = {
         {
               "Maths",
               "Science",
               "English",
         },
         {
               "Science",
               "English",
               "Maths",
         },
         {
               "English",
               "Maths",
               "Science",
         },
   };

   public void printSchedules() {
      for (int rowIndex = 0; rowIndex < this.schedules.length; rowIndex++) {
         String[] row = this.schedules[rowIndex];
         for (int colIndex = 0; colIndex < this.schedules.length; colIndex++) {
            String number = row[colIndex];
            System.err.println(
                  "Lecture: " + colIndex + " for " + this.sunday_monday[rowIndex] + " | " + number);
         }
      }
   }
}
