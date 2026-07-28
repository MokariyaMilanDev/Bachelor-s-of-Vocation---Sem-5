
class Game {
   public String Name;

   Game(String Name) {
      this.Name = Name;
   }
}

public class Main {
   public static void main(String[] args) {
      Game hayday = new Game("HayDay");
      System.out.println(hayday.Name);
   }
}
