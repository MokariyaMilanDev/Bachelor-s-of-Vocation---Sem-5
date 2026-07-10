
class Max {
   int numberOne;
   int numberTwo;

   Max(int numberOne, int numberTwo) {
      this.numberOne = numberOne;
      this.numberTwo = numberTwo;
   }

   int max() {
      if (numberOne > numberTwo) {
         return numberOne;
      } else {
         return numberTwo;
      }
   }
}

class _Number {
   int number;

   _Number(int number) {
      this.number = number;
   }

   int max(int number) {
      Max max = new Max(this.number, number);
      return max.max();
   }

   int add(int numberTwo) {
      return this.number + numberTwo;
   }

   int substract(int numberTwo) {
      return this.number + numberTwo;
   }
}

class Add extends _Number {
   int numberOne;
   int numberTwo;

   Add(int numberOne, int numberTwo) {
      super(numberOne);
      this.numberOne = numberOne;
      this.numberTwo = numberTwo;
   }

   int get() {
      return add(this.numberTwo);
   }
}

class Substract extends _Number {
   int numberOne;
   int numberTwo;

   Substract(int numberOne, int numberTwo) {
      super(numberOne);
      this.numberOne = numberOne;
      this.numberTwo = numberTwo;
   }

   int get() {
      return substract(this.numberTwo);
   }
}

public class Number {
   public static void main(String[] args) {
      _Number number = new _Number(10);
      System.out.println("Max: " + number.max(39));
      System.out.println("Add: " + number.add(39));
      System.out.println("Add: " + new Add(10, 39).get());
      System.out.println("Substract: " + number.substract(39));
      System.out.println("Substract: " + new Substract(10, 39).get());
   }
}
