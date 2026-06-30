
public class Main {
   public static void main(String[] args) {
      Circle circleOne = new Circle(10);
      System.out.println("Circle[" + circleOne.getRadius() + "] Area: " + circleOne.calArea());
   }
}

class Circle {
   private double _radius;

   Circle(double radius) {
      this._radius = radius;
   }

   Circle() {
      this._radius = 10;
   }

   double getRadius() {
      return this._radius;
   }

   double calArea() {
      return Math.PI * (Math.pow(this._radius, 2));
   }
}
