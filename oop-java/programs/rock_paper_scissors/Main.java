
import java.security.SecureRandom;
import java.util.Scanner;

class RPS {
   Scanner scanner = new Scanner(System.in);
   SecureRandom secure_random = new SecureRandom();

   public void play() {
      System.err.println("For: ");
      System.err.println("1 for ROCK");
      System.err.println("2 for PAPER");
      System.err.println("3 for SCISSOR");
      System.err.print("Enter your choice : ");
   }

   public int take_user_choice() {
      int choice = scanner.nextInt();
      return choice;
   }

   public void evalute_result(int user_choice) {
      int ai_choice = secure_random.nextInt(3) + 1;
      System.err.println("Your's choice " + user_choice);
      System.err.println("AI's choice " + ai_choice);
   }
}

public class Main {

   public static void main(String[] args) {
      RPS rps = new RPS();
      while (true) {
         rps.play();
         int user_choice = rps.take_user_choice();
         if (user_choice != 1 || user_choice != 2 || user_choice != 3) {
            throw new Error("Stop...");
         }
         rps.evalute_result(user_choice);
      }
   }
}
