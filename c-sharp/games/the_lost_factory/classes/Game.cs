using System;
using System.Collections.Generic;

class Game{
   
   public static void main(string[] args)
    {
        Player player = new Player("Red", new Position(10, 40));
        Wire wire = new Wire(new Position(10, 50));
        Battery battery = new Battery(new Position(10, 20));
        MetalPlate metalPlate = new MetalPlate(new Position(10, 40));
        Console.WriteLine("Wire: " + wire.id);
        Console.WriteLine("Battery: " + battery.id);
        Console.WriteLine("Battery.position: " + battery.position.x + battery.position.y);
        Console.WriteLine("MetalPlate: " + metalPlate.id);
        Console.WriteLine("Wires: " + player.wires);
        Console.WriteLine("Batteries: " + player.batteries);
        Console.WriteLine("MetalPlates: " + player.metalPlates);
        player.pickWire(wire);
        player.pickBattery(battery);
        player.pickMetalPlate(metalPlate);
        Console.WriteLine("Wires: " + player.wires);
        Console.WriteLine("Batteries: " + player.batteries);
        Console.WriteLine("MetalPlates: " + player.metalPlates);
        Console.WriteLine("Player: " + player.name);
    }
}


