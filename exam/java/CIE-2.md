**What is static variables and methods**

> #Marks_5

**Solution**

> **Static Variables**

- Those variables which are declared once
- `static` keyword

> **Static Methods**

- Those methods which are declared once
- `static` keyword

---

**What is methods overloading ? write down the rules of methods overloading**

> #Marks_5

**Solution**

> **Defination:** Method overloading occurs when we have declared same name methods in the class with different args or parameters.

> **Rules**

- Methods must have `different args`
- Methods must have `same name`

--

**List out `data types` in Java** #Marks_2

**Solution**

- String
- Char
- Int
- Double
- Boolean
- Array

--

**What is `constructor`? Explain `default constructor` with example.** #Marks_5

**Solution**

> **Defination:** A special method of class which automatically invoke at object creation time

- We can declare constructor by defining methods name same as class name

> **Default Constructor:** a no-argument constructor that the Java compiler automatically generates for a class if, and only if, no other constructors are explicitly written in the source code

> **Example**

```java
public class Main{
   // Constructor
   public void Main(){
      // Invoke when object creates
   }
}
```

--

**What is `mutator method`? Explain with example.**

**Solution**

--

**Explain if-else with example**

**Solution**

--

**Explain 1D array with example of sum, max, min and indexing** #Marks_10

**Solution**

--

**What is inheritance? List out it types? Explain any one example.** #Marks_10

**Solution**

> What
> When an class `derive another class` attributes and methods is called `inheritance`.

> Types

1. Single
2. Multiple
3. Multi level
4. Hybrid

> Example

```java
class Perent {
   private version = 1;

   public int parentMethod(){
      return this.version;
   }
}

class Child extends Parent {
   private version = 2;

   public int childMethod(){
      return this.version;
   }
}

public class Main {
   public static void main(){
      Parent parent = new Parent();

   }
}
```

---
