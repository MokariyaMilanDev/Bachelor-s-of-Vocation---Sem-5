
// class Shape {

// }

interface Shape {
   abstract double getArea();

}

class Rectangle implements Shape {
   public double width;
   public double height;

   Rectangle(double width, double height) {
      this.width = width;
      this.height = height;
   }

   public double getArea() {
      return this.width * this.height;
   }
}

class Circle implements Shape {
   private double _radius;

   Circle(double radius) {
      this._radius = radius;
   }

   public double getArea() {
      return Math.PI * (Math.pow(this._radius, 2));
   }
}

public class Main {
   public static void main(String[] args) {
      Rectangle rectangle = new Rectangle(10, 20);
      System.out
            .println("Rectangle[" + rectangle.height + " and " + rectangle.width + "] Area: " + rectangle.getArea());
      Circle circleOne = new Circle(10);
      System.out.println("Circle Area: " + circleOne.getArea());
   }
}
