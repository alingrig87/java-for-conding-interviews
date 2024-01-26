# Java Control Structures

In Java, control structures are used to manage the flow of a program. These structures include decision-making statements and loops.

## Decision-Making Statements

### 1. **if Statement:**

- Used to execute a block of code if the specified condition is true.
  ```java
  int x = 10;
  if (x > 5) {
      System.out.println("x is greater than 5");
  }
  ```

### 2. **if-else Statement:**

- Executes one block of code if the condition is true and another if it's false.
  ```java
  int y = 3;
  if (y % 2 == 0) {
      System.out.println("y is even");
  } else {
      System.out.println("y is odd");
  }
  ```

### 3. **switch Statement:**

- Used to select one of many code blocks to be executed.
  ```java
  int day = 2;
  switch (day) {
      case 1:
          System.out.println("Monday");
          break;
      case 2:
          System.out.println("Tuesday");
          break;
      // ... other cases ...
      default:
          System.out.println("Invalid day");
  }
  ```

## 4. Loops

### 1. **for Loop:**

- Executes a block of code a specified number of times.
  ```java
  for (int i = 0; i < 5; i++) {
      System.out.println("Iteration: " + i);
  }
  ```

### 2. **while Loop:**

- Repeats a block of code while a specified condition is true.
  ```java
  int count = 0;
  while (count < 3) {
      System.out.println("Count: " + count);
      count++;
  }
  ```

### 3. **do-while Loop:**

- Similar to the while loop, but the code block is executed at least once.
  ```java
  int num = 5;
  do {
      System.out.println("Number: " + num);
      num--;
  } while (num > 0);
  ```

### 4. **Enhanced For Loop:**

- Iterating through an array of strings using the enhanced for loop.

  ```java
      public static void main(String[] args) {
          String[] fruits = {"Apple", "Banana", "Orange", "Grapes"};

          // Using enhanced for loop to iterate over the array of strings
          for (String fruit : fruits) {
              System.out.println(fruit);
          }
      }
  ```

### 5. **Iterator with a List of Objects:**

- Using an iterator to iterate through a list of custom objects.

  ```java
  import java.util.ArrayList;
  import java.util.Iterator;
  import java.util.List;

  class Person {
      String name;

      public Person(String name) {
          this.name = name;
      }
  }

  public class IteratorExample {
      public static void main(String[] args) {
          List<Person> people = new ArrayList<>();
          people.add(new Person("Alice"));
          people.add(new Person("Bob"));
          people.add(new Person("Charlie"));

          // Using iterator to iterate through the list of Person objects
          Iterator<Person> iterator = people.iterator();
          while (iterator.hasNext()) {
              Person person = iterator.next();
              System.out.println(person.name);
          }
      }
  }
  ```

### 6. **Streams with a List of Names:**

- Using streams to filter and print elements from a list of names.

  ```java
  import java.util.Arrays;
  import java.util.List;

  public class StreamsExample {
      public static void main(String[] args) {
          List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie", "Eve");

          // Using streams to filter and print names starting with 'A'
          names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
      }
  }
  ```
