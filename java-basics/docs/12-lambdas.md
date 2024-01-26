# Lambda Expressions in Java

Lambda expressions, introduced in Java 8, provide a concise way to express instances of single-method interfaces, known as functional interfaces. They are a powerful feature that enhances the readability and flexibility of Java code.

## What is a Lambda Expression?

A lambda expression is a short, anonymous function that can have zero or more parameters and a body. It provides a way to pass functions as arguments, making code more expressive and concise.

## Syntax of a Lambda Expression

The basic syntax of a lambda expression is as follows:

```java
   // Lambda expression with a single expression
   (x, y) -> x + y

   // Lambda expression with a block of statements
   (x, y) -> {
      int sum = x + y;
      System.out.println("Sum: " + sum);
      return sum;
   }
```

## Functional interfaces

A **functional interface** in Java is an interface that contains only a single abstract method (SAM - Single Abstract Method). It is termed "functional" because it can be used in the context of functional programming and lambda expressions. With the introduction of lambda expressions in Java 8, functional interfaces have become fundamental for implementing functional programming concepts in the language.

The utility of a functional interface lies in its ability to be used for creating instances using lambda expressions, providing a concise and flexible way to implement behaviors in Java. Through functional interfaces, Java enables programmers to treat functions as arguments and return them as results of other functions, leading to a more modular and expressive approach to programming.

#### Example of a Functional Interface in Java:

```java
@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();
}
```

By adding the `@FunctionalInterface`` annotation, the compiler will generate an error if the interface contains more than one abstract method. While this annotation is optional, it is considered good practice to ensure the correct usage of the interface in the context of functional programming.

Using functional interfaces in Java brings more conciseness and readability to the source code, facilitating the implementation of concepts such as higher-order functions, lambda expressions, and functional programming in general.

## Comparator Interface in Java

The `Comparator` interface in Java, part of the `java.util` package, is utilized for sorting objects within a collection. It provides a mechanism to define custom sorting logic for objects that may not inherently implement the `Comparable` interface.

### Comparator Interface:

The `Comparator` interface is a functional interface containing two primary methods: `compare(T o1, T o2)` and `equals(Object obj)`.
The `compare` method is essential for sorting and returns a negative integer, zero, or a positive integer, indicating whether the first object is less than, equal to, or greater than the second.

### Sorting Order:

The `compare` method must be implemented to define the sorting order. For ascending order, return a negative value when the first object is smaller, zero if they are equal, and a positive value if the first is larger.
For descending order, reverse the logic: return a positive value when the first object is smaller, zero if equal, and a negative value if the first is larger.

### Default Methods:

The `Comparator` interface incorporates various default and static methods to facilitate common sorting operations, such as `reversed()`, `thenComparing()`, and `naturalOrder()`.

## Example

Consider a class `Person`:

```java
public class Person {
    private String name;
    private int age;

    // Constructors, getters, setters
}
```

```java
import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return Integer.compare(person1.getAge(), person2.getAge());
    }
}
```

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
public static void main(String[] args) {
List<Person> people = new ArrayList<>();
// Add people to the list

        // Sorting using the custom comparator
        Collections.sort(people, new AgeComparator());

        // Now, the 'people' list is sorted based on age
    }

}
```

## Supplier Interface in Java

The `Supplier` interface is part of the `java.util.function` package in Java and is considered a functional interface. It represents a supplier of results, meaning it does not take any arguments but produces a result. The result is obtained by calling the `get()` method defined in the `Supplier` interface.

### Key Concepts:

1. **Supplier Interface:**

   - The `Supplier` interface is a functional interface with a single abstract method, `get()`, that does not take any arguments and returns a result.
   - It is commonly used for lazy initialization or scenarios where a value needs to be generated on demand.

2. **Lazy Evaluation:**

   - The `get()` method is called when the value is requested, enabling lazy evaluation of the result.

3. **Lambda Expressions:**
   - `Supplier` is often used with lambda expressions to provide a concise way of representing the logic for generating a value.

### Example:

Consider a scenario where we want to generate a random number using the `Supplier` interface:

```java
import java.util.Random;
import java.util.function.Supplier;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        // Using a Supplier to generate a random number
        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt(100);

        // Getting the random number
        int randomNumber = randomNumberSupplier.get();
        System.out.println("Generated Random Number: " + randomNumber);
    }
}

```

## Supplier Interface in Java

The `Supplier` interface is part of the `java.util.function` package in Java and is considered a functional interface. It represents a supplier of results, meaning it does not take any arguments but produces a result. The result is obtained by calling the `get()` method defined in the `Supplier` interface.

### Key Concepts:

1. **Supplier Interface:**

   - The `Supplier` interface is a functional interface with a single abstract method, `get()`, that does not take any arguments and returns a result.
   - It is commonly used for lazy initialization or scenarios where a value needs to be generated on demand.

2. **Lazy Evaluation:**

   - The `get()` method is called when the value is requested, enabling lazy evaluation of the result.

3. **Lambda Expressions:**
   - `Supplier` is often used with lambda expressions to provide a concise way of representing the logic for generating a value.

### Example:

Consider a scenario where we want to generate a random number using the `Supplier` interface:

```java
import java.util.Random;
import java.util.function.Supplier;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        // Using a Supplier to generate a random number
        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt(100);

        // Getting the random number
        int randomNumber = randomNumberSupplier.get();
        System.out.println("Generated Random Number: " + randomNumber);
    }
}
```

## Consumer Interface in Java

The `Consumer` interface is part of the `java.util.function` package in Java and is considered a functional interface. It represents an operation that takes a single input argument and returns no result. The primary method in the `Consumer` interface is `accept()`.

### Key Concepts:

1. **Consumer Interface:**

   - The `Consumer` interface is a functional interface with a single abstract method, `accept(T t)`, that takes an argument of type T and performs some operation without returning a result.
   - It is commonly used for scenarios where an action needs to be performed on each element of a collection.

2. **Lambda Expressions:**
   - `Consumer` is often used with lambda expressions to provide a concise way of representing the logic for the operation.

### Example:

Consider a scenario where we want to print each element of a list using the `Consumer` interface:

```java
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ElementPrinter {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Grapes");

        // Using a Consumer to print each element
        Consumer<String> printElement = System.out::println;

        // Performing the operation for each element
        fruits.forEach(printElement);
    }
}
```

## Function Interface in Java

The `Function` interface is part of the `java.util.function` package in Java and is considered a functional interface. It represents a function that takes one argument and produces a result. The primary method in the `Function` interface is `apply(T t)`.

### Key Concepts:

1. **Function Interface:**

   - The `Function` interface is a functional interface with a single abstract method, `apply(T t)`, that takes an argument of type T and produces a result of type R.
   - It is commonly used for scenarios where a transformation needs to be applied to an input.

2. **Lambda Expressions:**
   - `Function` is often used with lambda expressions to provide a concise way of representing the logic for the transformation.

### Example:

Consider a scenario where we want to transform a list of strings to their lengths using the `Function` interface:

```java
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StringLengthTransformer {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Function", "Lambda", "Example");

        // Using a Function to transform strings to their lengths
        Function<String, Integer> lengthMapper = String::length;

        // Applying the transformation and collecting results
        words.stream().map(lengthMapper).forEach(System.out::println);
    }
}
```
