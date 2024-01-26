# Interfaces

In Java, an interface is a collection of abstract methods, constants, and, starting from Java 8, it can also include default and static methods. Interfaces define contracts and abstract behavior, allowing classes to implement multiple interfaces.

## Example: The "CarPlugin" Interface

```java
public interface CarPlugin {
    // Abstract method to start the hybrid engine
    void startHybridEngine(); // implicit public and abstract

    // Abstract method to charge the hybrid battery
    void chargeHybridBattery(); // implicit public and abstract

    // Abstract method to check the hybrid status
    boolean isHybrid(); // implicit public and abstract
}
```

## "CarPlugin" Interface Implementation

```java
public class HybridCar implements CarPlugin {
    // Variable to track hybrid status
    private boolean isHybrid;

    // Constructor to initialize hybrid status
    public HybridCar(boolean isHybrid) {
        this.isHybrid = isHybrid;
    }

    // Implementation of the startHybridEngine method
    @Override
    public void startHybridEngine() {
        System.out.println("Hybrid engine started.");
    }

    // Implementation of the chargeHybridBattery method
    @Override
    public void chargeHybridBattery() {
        System.out.println("Charging hybrid battery.");
    }

    // Implementation of the isHybrid method
    @Override
    public boolean isHybrid() {
        return isHybrid;
    }
}

```

### Explanation for the "CarPlugin" Interface Example

In the provided example:

CarPlugin is the name of the interface defining methods related to a hybrid car plugin.

The HybridCar class implements the CarPlugin interface, providing a specific implementation for hybrid cars.

### Interface Methods:

The interface declares abstract methods for starting the hybrid engine, charging the hybrid battery, and checking the hybrid status.

### Implementation:

The class HybridCar implements the CarPlugin interface, providing concrete implementations for the methods related to hybrid functionality.

This example illustrates the creation and usage of an interface, "CarPlugin," in Java, with an implementation related to hybrid cars.
