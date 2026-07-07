using System;

class Battery : PrimaryKey{
   public Guid id { get; } = Guid.NewGuid();
   public Position position { get; }

   public Battery(Position position)
    {
        this.position = position;
    }
}

