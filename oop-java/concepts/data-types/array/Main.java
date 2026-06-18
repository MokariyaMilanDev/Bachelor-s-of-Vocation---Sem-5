import java.util.ArrayList;
import java.util.Arrays;

public class Main {
   public static void main(String arg[]) {
      // > Array

      int sample[] = { 1, 2, 3, 4, 5 };
      System.out.println("Lenght: " + sample.length);
      System.out.println("Lenght: " + Arrays.toString(sample));
      System.out.println("Lenght: " + sample[0]);

      // > ArrayList

      ArrayList<String> fruits = new ArrayList<>();

      fruits.add("Apple");
      fruits.add("Banana");
      fruits.add("Mango");
      fruits.add("_Mango");
      fruits.add(fruits.size(), "__Mango");

      System.out.println("Fruits: " + fruits);
      System.out.println("Firsts [.get(0)]: " + fruits.get(0));

      fruits.set(1, "Blueberry");
      System.out.println("Fruits [.set(Blueberry)]: " + fruits);

      fruits.remove(2);
      System.out.println("Fruits [.remove(2)]: " + fruits);
      fruits.remove("Apple");
      System.out.println("Fruits [.remove(Apple)]: " + fruits);

      System.out.println("Fruits Size: " + fruits.size());

      for (String fruit : fruits) {
         System.out.println("fruit: " + fruit);
      }
   }
}
