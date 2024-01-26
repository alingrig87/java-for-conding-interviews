# Polymorphism and Method Overloading

## Polymorphism

Polymorphism is a fundamental concept in object-oriented programming (OOP) that allows objects of different types to be treated as objects of a common type. In Java, polymorphism is achieved through two mechanisms: method overriding and interfaces. Method overriding allows a subclass to provide a specific implementation of a method that is already defined in its superclass.

### Example: Method Overriding

```java
// Base class
class Animal {
    void makeSound() {
        System.out.println("Some generic sound");
    }
}

// Derived class
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Example Usage
public class Main {
    public static void main(String[] args) {
        // Polymorphic behavior
        Animal myDog = new Dog();
        myDog.makeSound();  // Output: Woof! Woof!
    }
}
```

- The `Animal` class has a method `makeSound()`.
- The `Dog` class overrides the `makeSound()` method with a specific implementation.
- Polymorphism is demonstrated as an instance of `Dog` can be treated as an `Animal`.

### Method Overloading

```java
public class Calculator {
    // Method with two int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with three double parameters
    double add(double a, double b, double c) {
        return a + b + c;
    }
}

// Example Usage
public class Main {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        // Overloaded methods
        int result1 = myCalculator.add(5, 10);
        double result2 = myCalculator.add(2.5, 3.0, 1.5);

        System.out.println("Result 1: " + result1);  // Output: 15
        System.out.println("Result 2: " + result2);  // Output: 7.0
    }
}

```

- The `Calculator` class has two overloaded `add` methods with different parameter lists.
- Method overloading allows the same method name to be used for different types or numbers of parameters.
- The appropriate method is chosen based on the arguments provided.
