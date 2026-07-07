using System;

namespace the_lost_factory;

class Wire : PrimaryKey{
   public Guid id { get; } = Guid.NewGuid();
   
    public static void Main(string[] args)
    {   
        Wire wireOne = new Wire();
        Console.WriteLine("Wire: " + wireOne.id);
    }
}

