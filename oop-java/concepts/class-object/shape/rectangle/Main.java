
public class Main {
   public static void main(String[] args) {
      Rectangle rectangle = new Rectangle(10, 20);
      System.out.println("Rectangle[" + rectangle.height + " and " + rectangle.width + "] Area: " + rectangle.getArea()
            + " | Perimeter: "
            + rectangle.getPerimeter());
   }
}

class Rectangle {
   public double width;
   public double height;

   Rectangle(double width, double height) {
      this.width = width;
      this.height = height;
   }

   Rectangle() {
      this.width = 10;
      this.height = 10;
   }

   double getArea() {
      return this.width * this.height;
   }

   double getPerimeter() {
      return 2 * (this.height + this.width);
   }
}