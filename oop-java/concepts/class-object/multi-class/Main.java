
class Room {
   int id;

   Room(int id) {
      this.id = id;
   }
}

class Car {
   int year;
   String company;
   double price;

   Car(int year, String company, double price) {
      this.year = year;
      this.company = company;
      this.price = price;
   }
}

class Employee {
   int id;
   String name;
   double salary;

   Employee(String name, int id, double salary) {
      this.id = id;
      this.name = name;
      this.salary = salary;
   }

   Boolean setSalary(
         int performance,
         double salary) {
      double extra = 0.0;
      switch (performance) {
         case 1:
            extra = 1000;
            break;
         case 2:
            extra = 2000;
            break;
         case 3:
            extra = 3000;
            break;
         case 4:
            extra = 4000;
            break;
         default:
            System.out.println("Invalide performance metrix");
            return false;
      }

      double newSalry = salary + extra;
      this.salary = newSalry;
      return true;
   }
}

public class Main {
   public static void main(String[] args) {
      Room roomOne = new Room(1);
      System.out.println("Room: " + roomOne.id);

      Car carOne = new Car(2000, "IMB", 10000);
      System.out.println("Car: " + carOne.year);

      Employee employee = new Employee("A", 1, 10000);
      System.out.println("Emplyee: " + employee.salary);
      employee.setSalary(4, 12000);
      System.out.println("Emplyee: " + employee.salary);
   }
}
