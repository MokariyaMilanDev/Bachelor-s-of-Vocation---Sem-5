using System;

class Player {
   public string name;
   public int energy;

   public Player(string name,  int energy){
      this.name = name;
      this.energy = energy;
   }

   public bool takeHit(int damage){
      if(this.energy <= 0){
         return false;
      }

      this.energy -= damage;
      return true;
   }
}

public class Game{
   public static void Main(){
      Player player = new Player("XYZ", 100);
      Console.WriteLine(player.name + "[" + player.energy + "]" + " has started game...");
      bool isTaken = player.takeHit(100);
      Console.WriteLine(isTaken.ToString() + " " + player.energy);
      bool isTaken2 = player.takeHit(10);
      Console.WriteLine(isTaken2.ToString() + " " + player.energy);
   }
}


