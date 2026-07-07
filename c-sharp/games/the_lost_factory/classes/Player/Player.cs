using System;

class Player{
   public String name;
   public List<Wire> wires { get; } = new();

   Player(String name){
      this.name = name;
   }
}

