import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      ATM hdfcATM = new ATM("HDFC");
      boolean isProcessRunnig = true;

      while (isProcessRunnig) {
         int pin = hdfcATM.requestToPin();
         System.out.println("pin : " + pin);
         System.out.println("hdfcATM.attemptsCount : " + hdfcATM.attemptsCount);
      }
   }
}

class ATM {
   int MAX_ATTEMPT = 3;
   String name;
   int attemptsCount = 0;

   ATM(String name) {
      this.name = name;
   }

   int requestToPin() {
      System.out.print("Enter you ATM pin: ");
      Scanner scanner = new Scanner(System.in);
      int pin = scanner.nextInt();

      // ? min 6 and max 6
      if (pin != 6) {

      }
      // ? check attempts
      if (this.attemptsCount >= this.MAX_ATTEMPT) {
         throw new Error("Max attempt limit reached!");
      }

      this.attemptsCount++;
      return pin;
   }
}
