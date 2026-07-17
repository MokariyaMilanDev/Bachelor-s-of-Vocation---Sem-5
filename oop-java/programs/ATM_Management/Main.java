import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      ATM hdfcATM = new ATM("HDFC", "PASS");
      boolean isProcessRunnig = true;

      System.out.println("ATM Balance: ");

      while (isProcessRunnig) {
         int pin = hdfcATM.requestToPin();
         System.out.println("pin : " + pin);
         System.out.println("hdfcATM.attemptsCount : " + hdfcATM.attemptsCount);
      }
   }
}

class ATM {
   String SECRET_KEY;
   int MAX_ATTEMPT = 3;
   String name;
   int attemptsCount = 1;
   int balance = 100;

   ATM(String name, String SECRET_KEY) {
      this.name = name;
      this.SECRET_KEY = SECRET_KEY;
   }

   int requestToPin() {
      System.out.print("Enter you ATM pin: ");
      Scanner scanner = new Scanner(System.in);
      int pin = scanner.nextInt();

      int pinLength = String.valueOf(pin).length();
      // ? min 6 and max 6
      if (pinLength != 6) {
         throw new Error("Entered ATM pin is not 6 digit");
      }
      // ? check attempts
      if (this.attemptsCount >= this.MAX_ATTEMPT) {
         throw new Error("Max attempt limit reached!");
      }

      this.attemptsCount++;
      return pin;
   }

   int checkBalance(String SECRET_KEY) {
      if (SECRET_KEY == this.SECRET_KEY) {
         return this.balance;
      }

      throw new Error("Unauthorized person");
   }

   boolean withdraw() {
      return true;
   }

   boolean deposite() {
      return true;
   }

   boolean changePin() {
      return true;
   }
}
