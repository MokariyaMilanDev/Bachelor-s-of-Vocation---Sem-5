using System;

public abstract class PrimaryKey
{
    public Guid Id { get; } = Guid.NewGuid();
}