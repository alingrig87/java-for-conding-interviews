# Inheritance

Inheritance is a fundamental concept in object-oriented programming (OOP) that allows a class (subclass or derived class) to inherit properties and behaviors from another class (superclass or base class). In Java, inheritance facilitates code reuse, promotes the creation of a hierarchical class structure, and supports the development of more organized and modular code.

## Example: Class Inheritance

```java
// Base class (superclass)
class Animal {
    void eat() {
        System.out.println("The animal eats.");
    }

    void sleep() {
        System.out.println("The animal sleeps.");
    }
}

// Derived class (subclass)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Example Usage
public class Main {
    public static void main(String[] args) {
        // Creating an instance of the Dog class
        Dog myDog = new Dog();

        // Accessing methods from the base class
        myDog.eat();
        myDog.sleep();

        // Accessing methods from the derived class
        myDog.bark();
    }
}
```

## Explanation

- The `Animal` class is the base class, and the `Dog` class is the derived class.
- The `Dog` class inherits the `eat()` and `sleep()` methods from the `Animal` class.
- The `Dog` class introduces its own method, `bark()`.
- Code reuse is demonstrated as `Dog` can access the methods of `Animal`.

# Example: Abstract Class

```java
// Abstract base class
abstract class Shape {
    abstract double calculateArea(); // Abstract method
}

// Concrete derived class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete derived class
class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

// Example Usage
public class Main {
    public static void main(String[] args) {
        // Creating instances of concrete classes
        Circle myCircle = new Circle(5.0);
        Rectangle myRectangle = new Rectangle(4.0, 6.0);

        // Calculating and displaying areas
        System.out.println("Circle Area: " + myCircle.calculateArea());
        System.out.println("Rectangle Area: " + myRectangle.calculateArea());
    }
```

## Explanation

- The `Shape` class is an abstract base class with an abstract method `calculateArea()`.
- Concrete classes (`Circle` and `Rectangle`) extend the abstract class and provide implementations for the abstract method.
- Abstract classes can't be instantiated; they provide a common interface for their subclasses.
