
public class MyNumber {
   private int numberOne;
   private int numberTwo;

   MyNumber(int numberOne, int numberTwo) {
      this.numberOne = numberOne;
      this.numberTwo = numberTwo;
   }

   public static void main(String[] args) {
      MyNumber number = new MyNumber(0, 0);
      System.out.println("[number]{number.add()}: " + number.add());
   }

   int add() {
      return this.numberOne + this.numberTwo;
   }
}
