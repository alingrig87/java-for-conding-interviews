# Java Streams

In Java, a stream is a sequence of elements that can be processed in a functional style. Streams provide a concise and expressive way to perform operations on collections of data, such as filtering, mapping, and reducing. They were introduced in Java 8 as part of the Stream API.

## Key Concepts

### 1. Stream Pipeline

- A stream pipeline consists of a source, followed by zero or more intermediate operations, and a terminal operation.
- Operations are either intermediate or terminal. Intermediate operations transform a stream into another stream, while terminal operations produce a result or a side-effect.

### 2. Intermediate Operations

- Common intermediate operations include `filter`, `map`, `flatMap`, `distinct`, `sorted`, `peek`, and more.
- These operations are lazy, meaning they do not execute until a terminal operation is invoked.

### 3. Terminal Operations

- Terminal operations trigger the processing of elements and produce a result or side-effect.
- Examples of terminal operations are `forEach`, `collect`, `reduce`, `count`, `anyMatch`, `allMatch`, and `noneMatch`.

# Java Streams Methods

## 1. **`filter`**

- **Description:** Filters the elements of the stream based on a given predicate.
- **Example:**
  ```java
  stream.filter(x -> x > 5)
  ```

## 2. **`map`**

- **Description:** Transforms each element of the stream using a given function.
- **Example:**
  ```java
  stream.map(x -> x * 2)
  ```

## 3. **`flatMap`**

- **Description:** Flattens a stream of collections into a single stream.
- **Example:**
  ```java
  stream.flatMap(Collection::stream)
  ```

## 4. **`distinct`**

- **Description:** Removes duplicate elements from the stream.
- **Example:**
  ```java
  stream.distinct()
  ```

## 5. **`sorted`**

- **Description:** Sorts the elements of the stream.
- **Example:**
  ```java
  stream.sorted()
  ```

## 6. **`forEach`**

- **Description:** Performs an action for each element of the stream.
- **Example:**
  ```java
  stream.forEach(System.out::println)
  ```

## 7. **`reduce`**

- **Description:** Performs a reduction on the elements of the stream using an associative accumulation function and returns an `Optional`.
- **Example:**
  ```java
  stream.reduce((x, y) -> x + y)
  ```

## 8. **`collect`**

- **Description:** Performs a mutable reduction on the elements of the stream into a different form.
- **Example:**
  ```java
  stream.collect(Collectors.toList())
  ```

## 9. **`anyMatch`**

- **Description:** Checks if any element of the stream matches a given predicate.
- **Example:**
  ```java
  stream.anyMatch(x -> x > 10)
  ```

## 10. **`allMatch`**

- **Description:** Checks if all elements of the stream match a given predicate.
- **Example:**
  ```java
  stream.allMatch(x -> x > 0)
  ```

## Example 1: Filtering Elements

```java
import java.util.Arrays;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Grapes");

        // Filtering fruits that start with the letter 'A'
        fruits.stream()
              .filter(fruit -> fruit.startsWith("A"))
              .forEach(System.out::println);
    }
}
```

## Example 2: Mapping and Displaying

```java
import java.util.Arrays;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Python", "JavaScript", "C#");

        // Mapping the lengths of strings and displaying them
        languages.stream()
                 .map(String::length)
                 .forEach(System.out::println);
    }
}

```

## Example 3: Sorting

```java
import java.util.Arrays;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Grapes");

        // Sorting fruits and displaying them
        fruits.stream()
              .sorted()
              .forEach(System.out::println);
    }
}


```

## Example 4: Limiting and Skipping

```java
import java.util.Arrays;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Yellow");

        // Limiting to the first two colors and skipping one
        colors.stream()
              .limit(2)
              .skip(1)
              .forEach(System.out::println);
    }
}

```

## Example 5: Matching Elements

```java
import java.util.Arrays;
import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Grapes");

        // Checking if any fruit starts with 'B'
        boolean anyStartsWithB = fruits.stream()
                                       .anyMatch(fruit -> fruit.startsWith("B"));
        System.out.println("Any fruit starts with 'B': " + anyStartsWithB);
    }
}

```

## Example 6: Reducing Elements

```java
import java.util.Arrays;
import java.util.List;

public class Example6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Summing all numbers
        int sum = numbers.stream()
                         .reduce(0, Integer::sum);
        System.out.println("Sum of numbers: " + sum);
    }
}

```

## Example 7: Collecting Results

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Grapes");

        // Collecting fruits into a List
        List<String> collectedFruits = fruits.stream()
                                            .collect(Collectors.toList());
        System.out.println("Collected fruits: " + collectedFruits);
    }
}

```

## Example 8: Grouping Elements

```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example8 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Grapes");

        // Grouping fruits by their first letter
        Map<Character, List<String>> groupedByFirstLetter = fruits.stream()
                                                                  .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println("Fruits grouped by first letter: " + groupedByFirstLetter);
    }
}

```

## Example 9: Flat Map

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example9 {
    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("Java", "C++"),
                Arrays.asList("Python", "Ruby"),
                Arrays.asList("JavaScript", "TypeScript")
        );

        // Using flatMap to flatten the nested list
        List<String> flatList = nestedList.stream()
                                          .flatMap(List::stream)
                                          .collect(Collectors.toList());
        System.out.println("Flat list: " + flatList);
    }
}
```

## Example 10: Creating Streams

```java
import java.util.stream.Stream;

public class Example11 {
    public static void main(String[] args) {
        // Creating a stream of integers from 1 to 5
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

        // Displaying elements of the stream
        integerStream.forEach(System.out::println);
    }
}

```

## Example 11 Infinite Streams

```java
import java.util.stream.Stream;

public class Example12 {
    public static void main(String[] args) {
        // Generating an infinite stream of integers
        Stream<Integer> infiniteStream = Stream.iterate(1, n -> n + 1);

        // Limiting the stream to the first five elements
        infiniteStream.limit(5)
                      .forEach(System.out::println);
    }
}

```

## Example 12: Peeking Elements

```java
import java.util.Arrays;
import java.util.List;

public class Example14 {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Yellow");

        // Peeking into each color before displaying
        colors.stream()
              .peek(System.out::println)
              .forEach(color -> {}); // Terminal operation to force execution
    }
}

```
