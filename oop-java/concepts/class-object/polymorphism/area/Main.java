
class Square {
   Square() {
   }

   void area(double h) {
      System.out.println("Area: " + h * 4);
   }
}

class Rectangle {
   Rectangle() {
   }

   void area(double h, double w) {
      System.out.println("Area: " + (h + w) * 2);
   }
}

public class Main {
   public static void main(String[] args) {
      Square square = new Square();
      square.area(8);
      Rectangle rectangle = new Rectangle();
      rectangle.area(10, 12);
   }
}
