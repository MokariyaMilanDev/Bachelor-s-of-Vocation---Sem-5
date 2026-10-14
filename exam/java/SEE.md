**2D array with example.**

- Two dimentional array
- Data stored in row and column pattern

> Syntax

```java
<DataType>[][] <VariableName> = {{}};
```

> Example

```java
int[][] nums = {{1, 2, 3}, {4, 5, 6}};
```

> Code

```java
public class Main {
   public static void main() {
      int[][] nums = {
            {
                  1, 2, 3
            },
            {
                  4, 5, 6
            }
      };

      for (int[] row : nums) {
         for (int num : row) {
            System.err.println(num);
         }
      }
   }
}
```

**Row major array with example**

```java
public class Main {
   public static void main() {
      int[][] nums = {
            {
                  1, 2, 3
            },
            {
                  4, 5, 6
            }
      };

      int rowCount = 0;
      int columnCount = 0;

      for (int[] row : nums) {
         for (int num : row) {
            System.err.println(num);
            columnCount += 1;
         }
         rowCount += 1;
         columnCount = 0;
      }
   }
}
```

**Column major array with example**

```java
public class Main {
   public static void main() {
      int[][] nums = {
            {
                  1, 2, 3
            },
            {
                  4, 5, 6
            }
      };

      for (int i = 0; i < nums[0].length; i++) {
         for (int j = 0; j < nums.length; j++) {
            System.out.println(nums[j][i]);
         }
      }
   }
}
```

**Types of array**

- Syntax
- Runtime
- Logical

> #Marks_2

**Types array with example**

> #Marks_5

**Exception handling with example**

> #Marks_5

**Try catch with example**

> #Marks_5
