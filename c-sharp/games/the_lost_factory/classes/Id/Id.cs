using System;

namespace the_lost_factory;

public abstract class PrimaryKey
{
    public Guid Id { get; } = Guid.NewGuid();
}