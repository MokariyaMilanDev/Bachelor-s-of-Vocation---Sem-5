
import java.util.Scanner;

public class Main {
   public static void main() {
      Scanner sc = new Scanner(System.in);

      int[][] nums = {
            {
                  0, 0, 0
            },
            {
                  0, 0, 0
            },
            {
                  0, 0, 0
            }
      };

      boolean isPlaying = true;
      String player = "X";

      System.err.println("i for row and j for column, {ROW} {COLUMN}. Example: 1 2");

      while (isPlaying) {
         System.err.println(player + " enter your move: ");
         String value = sc.toString();
         String rawRow = value.split(" ")[0];
         String rawColumn = value.split(" ")[1];
         int row = int(rawRow);
         int column = int(rawColumn);

         nums[row][column] = player;

         if(player == "X"){
            player = "O";
         }else{
            player = "X";
         }
      }
   }
}