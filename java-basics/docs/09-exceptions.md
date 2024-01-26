# Exceptions in Java

In Java, exceptions are events that occur during the execution of a program and disrupt its normal flow. They represent situations that the programmer might want to handle, such as errors or unexpected conditions. Java provides a robust exception-handling mechanism to deal with these situations.

## Types of Exceptions

Java classifies exceptions into two main types:

1. **Checked Exceptions:**

   - These are exceptions that the compiler requires you to catch or declare. They extend the `Exception` class.
   - Examples: `IOException`, `ClassNotFoundException`.

2. **Unchecked Exceptions (Runtime Exceptions):**
   - These are exceptions that occur at runtime and do not need to be explicitly caught or declared.
   - They extend the `RuntimeException` class.
   - Examples: `NullPointerException`, `ArrayIndexOutOfBoundsException`.

## Handling Exceptions

### Using try-catch Blocks

```java
try {
    // Code that may throw an exception
    // ...
} catch (ExceptionType1 e1) {
    // Handle ExceptionType1
} catch (ExceptionType2 e2) {
    // Handle ExceptionType2
} finally {
    // Code that will be executed regardless of whether an exception occurs or not
}
```

# Using `throws` Keyword

```java
public void myMethod() throws MyException {
    // Code that may throw MyException
    // ...
}
```

# Common Exception Handling Best Practices

1. **Catch Specific Exceptions:**

   - Catch specific exceptions rather than using a generic `catch (Exception e)`. This allows for more targeted handling.

2. **Handle Exceptions Appropriately:**

   - Choose the appropriate handling strategy for each exception type (logging, rethrowing, or gracefully handling).

3. **Use Finally Sparingly:**

   - Use the `finally` block for cleanup code that should be executed regardless of whether an exception occurs or not.

4. **Avoid Empty Catch Blocks:**

   - Avoid empty `catch` blocks as they can hide issues and make debugging challenging.

5. **Log Exceptions:**
   - Consider logging exceptions using a logging framework to aid in debugging and troubleshooting.

### Checked Exceptions Examples

1. **IOException:**

   - Represents an error that occurs during input-output operations.

   ```java
   import java.io.FileReader;
   import java.io.IOException;

   public class CheckedExample {
       public static void main(String[] args) {
           try {
               FileReader fileReader = new FileReader("example.txt");
               // Code that reads from the file
               fileReader.close();
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
   }
   ```

2. **ClassNotFoundException:**

   - Indicates that the specified class could not be found during runtime.

```java
public class CheckedExample2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.example.NonExistentClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

```

### Unchecked Exceptions Examples

1. **NullPointerException:**

   - Occurs when trying to access or modify an object reference that is `null``.

```java
public class UncheckedExample {
    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}

```

2. **ArrayIndexOutOfBoundsException:**

   - Thrown when attempting to access an array element at an invalid index.

```java
public class UncheckedExample2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            int value = numbers[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
```

3. **ArithmeticException:**

   - Occurs when an arithmetic operation results in an overflow, underflow, or division by zero.

```java
public class UncheckedExample3 {
    public static void main(String[] args) {
        int result;
        try {
            result = 10 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
```

## List of Common Java Exceptions

### Checked Exceptions

1. **IOException:**
   - Occurs during input-output operations, such as file handling.
2. **ClassNotFoundException:**

   - Thrown when attempting to load a class by its string name, but the class definition is not found.

3. **SQLException:**

   - Raised for database access issues, indicating an error with SQL.

4. **FileNotFoundException:**

   - Raised when trying to access a file that cannot be found.

5. **ParseException:**
   - Occurs when parsing operations fail, such as parsing a date or number from a string.

### Unchecked Exceptions (Runtime Exceptions)

1. **NullPointerException:**

   - Thrown when trying to access or modify an object reference that is `null`.

2. **ArrayIndexOutOfBoundsException:**

   - Raised when attempting to access an array element at an invalid index.

3. **ArithmeticException:**

   - Occurs when an arithmetic operation results in an overflow, underflow, or division by zero.

4. **IllegalArgumentException:**

   - Thrown when a method receives an argument of an inappropriate type.

5. **IllegalStateException:**

   - Raised when the state of an object is incompatible with the requested operation.

6. **ClassCastException:**

   - Occurs when an attempt is made to cast an object to a subclass type, and the object is not an instance of that type.

7. **NumberFormatException:**

   - Thrown when attempting to convert a string to a numeric format, but the string does not have the appropriate format.

8. **NullPointerException:**

   - Raised when trying to access or modify an object reference that is `null`.

9. **IndexOutOfBoundsException:**

   - General superclass for all exceptions related to accessing an index that is out of bounds.

10. **ConcurrentModificationException:**
    - Thrown when a collection is modified while iterating over it.
