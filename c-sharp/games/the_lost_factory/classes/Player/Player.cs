using System;
using System.Collections.Generic;

class Player{
   public String name;
   public List<Wire> wires { get; } = new List<Wire>();
   public List<Battery> batteries { get; } = new List<Battery>();
   public List<MetalPlate> metalPlates { get; } = new List<MetalPlate>();
   public Position position { get; }

   public Player(String name, Position position){
      this.name = name;
      this.position = position;
   }

   public Boolean pickWire(Wire wire){
      this.wires.Add(wire);
      return true;
   }

   public Boolean pickBattery(Battery battery){
      this.batteries.Add(battery);
      return true;
   }

   public Boolean pickMetalPlate(MetalPlate metalPlate){
      this.metalPlates.Add(metalPlate);
      return true;
   }
}

