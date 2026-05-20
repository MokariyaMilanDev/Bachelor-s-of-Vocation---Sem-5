
public class Main {
      public static void main(String[] args){
         int a = 5;
         int b = 6;
         System.err.println(  "Before swiping: a = " + a + ", b = " + b);
         
         a = a + b; // a now holds the sum of a and b
         b = a - b; // b now holds the original value of a
         a = a - b; // a now holds the original value of b
         System.out.println("After swiping: a = " + a + ", b = " + b);
      }
}
