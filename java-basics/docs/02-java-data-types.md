# Java Data Types

In Java, data types specify the type of data that a variable can hold. Java has two categories of data types: primitive data types and reference data types.

## Primitive Data Types

### 1. **Numeric Types:**

- **int:** Used for storing integer values.

  ```java
  int age = 25;
  ```

- **double:** Used for storing floating-point numbers.

  ```java
  double salary = 1200.50;
  ```

- **float:** Similar to double but with less precision.

  ```java
  float weight = 68.5f;
  ```

- **short:** Used for small integers.

  ```java
  short temperature = -10;
  ```

- **long:** Used for large integers.
  ```java
  long population = 7000000000L;
  ```

### 2. **Boolean Type:**

- **boolean:** Used for storing true or false values.
  ```java
  boolean isJavaFun = true;
  ```

### 3. **Character Type:**

- **char:** Used for storing a single character.
  ```java
  char grade = 'A';
  ```

## Reference Data Types

### 1. **Object Types:**

- **String:** Represents a sequence of characters.
  ```java
  String greeting = "Hello, World!";
  ```

### 2. **Arrays:**

- Used for storing multiple values of the same type.
  ```java
  int[] numbers = {1, 2, 3, 4, 5};
  ```

### 3. **Custom Classes:**

- User-defined classes can be used to create objects with specific data types.

  ```java
  class Person {
      String name;
      int age;
  }

  Person john = new Person();
  john.name = "John";
  john.age = 30;
  ```
