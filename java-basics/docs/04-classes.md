# Java Classes

In object-oriented programming, a class serves as a blueprint or a data type from which objects can be created. A class defines the behavior and state of objects instantiated from it.

## Example: The "Car" Class

A simple class to represent a car in the Java programming language might look like this:

## "Car" Class Implementation

```java
public class Car {
    // Instance variables
    String brand;
    String model;
    int year;

    // Static variable shared among all instances
    static int numberOfCars;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        // Incrementing the static variable on each instance creation
        numberOfCars++;
    }

    // Final method that displays information about the car
    public final void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    // Static method to get the total number of cars
    public static int getNumberOfCars() {
        return numberOfCars;
    }
}
```

## Explanation for the "Car" Class Example

In the provided example:

- **Car** is the name of the class.
- **brand**, **model**, and **year** are instance variables that define the state of objects created from this class.

### Keyword `static`:

- The variable **numberOfCars** is declared as `static`, meaning it belongs to the class rather than specific instances. A single copy of this variable is shared among all instances.

### Keyword `final`:

- The method **displayInfo** is marked with `final`, indicating that it cannot be overridden in a derived class.

- The variables **brand**, **model**, and **year** are instance variables and are not marked with `final`. They can be modified after object creation.

### Keyword `static` for methods:

- The method **getNumberOfCars** is declared as `static`, allowing it to be called directly on the class without creating an instance. It is useful for operations that don't depend on the specific state of an instance.
