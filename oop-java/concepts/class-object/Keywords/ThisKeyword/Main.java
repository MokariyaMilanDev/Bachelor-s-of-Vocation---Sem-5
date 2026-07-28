
class Game {
   private String Name;

   Game(String Name) {
      this.Name = Name;
   }

   public String getName() {
      return Name;
   }

   public void setName(String name) {
      this.Name = name;
   }
}

public class Main {
   public static void main(String[] args) {
      Game hayday = new Game("HayDay");
      System.out.println(hayday.getName());
   }
}
