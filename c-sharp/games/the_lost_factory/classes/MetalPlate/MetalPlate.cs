using System;

class MetalPlate : PrimaryKey{
   public Guid id { get; } = Guid.NewGuid();
   public Position position { get; }

   public MetalPlate(Position position)
    {
        this.position = position;
    }
}

