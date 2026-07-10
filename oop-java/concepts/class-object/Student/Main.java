
class Student {
   String name = "Rahul";
   int rollNo = 101;
}

class Exam extends Student {
   int marks1 = 80;
   int marks2 = 90;
}

class Result extends Exam {
   void display() {
      int total = marks1 + marks2;
      System.out.println("Name: " + name);
      System.out.println("Roll No: " + rollNo);
      System.out.println("Total Marks: " + total);
   }
}

public class Main {
   public static void main(String[] args) {
      Result result = new Result();
      result.display();
   }
}
