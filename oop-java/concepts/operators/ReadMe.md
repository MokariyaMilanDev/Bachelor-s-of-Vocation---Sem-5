# Operators

## Arithmetic Operators

#### + (Addition):

> Adds two values or concatenates strings.

#### - (Subtraction):

> Subtracts the right operand from the left operand.

#### \* (Multiplication):

> Multiplies two values.

#### / (Division):

> Divides the left operand by the right operand to return the quotient.

#### % (Modulus):

> Divides the left operand by the right operand and returns the remainder.

---

## Assignment Operators

#### =

> Assigns the right-side value to the left-side variable.

#### +=

> Adds the right value to the variable and assigns the result (x += 3 is x = x + 3).

#### -=

> Subtracts the right value from the variable and assigns the result.

#### \*=

> Multiplies the variable by the right value and assigns the result.

#### /=

> Divides the variable by the right value and assigns the result.

#### %=

> Calculates the modulus of the variable by the right value and assigns the result.

---

## Unary Operators

#### ++ (Increment)

> Increases a numeric value by 1 (available as prefix ++x or postfix x++).

#### -- (Decrement)

> Decreases a numeric value by 1 (available as prefix --x or postfix x--).

#### ! (Logical NOT)

> Inverts the boolean truth value of a statement.

#### - (Unary Minus)

> Negates a positive expression or value.

#### ~ (Bitwise Complement)

> Inverts all the bits of an integer value

---

## Relational (Comparison) Operators

#### == (Equal to)

> Checks if two values are equal to each other.

#### != (Not Equal to)

> Checks if two values are not equal to each other.

#### > (Greater than)

> Determines if the left value is strictly greater than the right value.

#### < (Less than)

> Determines if the left value is strictly less than the right value.

#### >= (Greater than or Equal to)

> Determines if the left value is greater than or equal to the right value.

#### <= (Less than or Equal to)

> Determines if the left value is less than or equal to the right value.

---

## Logical Operators

#### && (Logical AND)

> Returns true only if both evaluated conditions are true. It features short-circuiting logic.

#### || (Logical OR)

> Returns true if at least one evaluated condition is true. It also short-circuits if the first condition resolves to true.

---

## Bitwise and Shift Operators

#### & (Bitwise AND)

> Performs a bit-by-bit AND operation.

#### | (Bitwise OR)

> Performs a bit-by-bit inclusive OR operation.

#### ^ (Bitwise XOR)

> Performs a bit-by-bit exclusive OR operation.

#### << (Left Shift)

> Shifts binary bits to the left, padding empty spaces with zeros.

#### >> (Signed Right Shift)

> Shifts binary bits to the right while preserving the sign bit.

#### >>> (Unsigned Right Shift)

> Shifts binary bits to the right, padding empty spaces with zeros regardless of the sign.

---

## Ternary Operators

> The ternary operator `(?:)` acts as a shorthand alternative to basic if-else structural statements. It takes three arguments:

#### Syntax

```java
expression ? value_if_true : value_if_false;
```

---

## Instanceof Operator

> instanceof: Compares a reference object against a specific type or class. It returns `true` if the object matches or inherits from that class type.
