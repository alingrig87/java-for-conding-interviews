# Encapsulation

Encapsulation is one of the four fundamental object-oriented programming (OOP) concepts and is a key principle in Java. It refers to the bundling of data (attributes or fields) and methods (functions) that operate on the data within a single unit, often known as a class. The primary purpose of encapsulation is to hide the internal state of an object and restrict direct access to its internal details.

## Key Aspects of Encapsulation

### 1. Access Modifiers

Java provides access modifiers to control the visibility of classes, methods, and fields. The main access modifiers are:

- **Public:** Accessible from any other class.
- **Private:** Accessible only within the same class.
- **Protected:** Accessible within the same package and subclasses.
- **Default (Package-Private):** Accessible only within the same package.

Encapsulation often involves making fields private and providing public methods, known as getters and setters, to manipulate the data. This controls the access to the internal state of the object.

### 2. Getter and Setter Methods

Getter methods are used to retrieve the values of private fields, while setter methods are used to modify or update the values. This allows controlled access to the internal state, ensuring data integrity and validation.

Example:

```java
public class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Getter methods
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

```

### 3. Data Hiding

Encapsulation promotes the concept of data hiding, where the internal details of an object are hidden from the outside world. This helps prevent unauthorized access and modification of an object's state. By making fields private and providing controlled access through methods (getters and setters), encapsulation ensures that the internal implementation details remain encapsulated within the class. This separation of concerns enhances security, maintains code integrity, and facilitates changes to the internal structure without affecting the external code.

### 4. Bundling of Code and Data

Encapsulation allows the bundling of related code and data within a single unit, often represented by a class. This bundling enhances the modularity of code, making it easier to understand, maintain, and extend. By encapsulating both the behavior (methods) and the state (fields) of an object, encapsulation promotes a clean and organized code structure. It supports the concept of information hiding, as the internal deta

## Benefits of Encapsulation

1. **Security:**

   - _Description:_ Protects the internal state of an object from unauthorized access.
   - _Explanation:_ By making fields private and providing controlled access through methods, encapsulation prevents direct manipulation of an object's internal state. This enhances security by restricting access to only authorized operations.

2. **Flexibility:**

   - _Description:_ Allows changes to the internal implementation without affecting the external code.
   - _Explanation:_ Encapsulation provides a protective barrier between the internal implementation of a class and the external components using it. This enables developers to modify the internal details of a class without impacting the external code that relies on its public interface.

3. **Code Organization:**

   - _Description:_ Promotes a clean and organized code structure by grouping related code and data.
   - _Explanation:_ Encapsulation encourages bundling related behavior and state within a class. This modular approach improves code organization, making it easier to comprehend, maintain, and collaborate on projects.

4. **Maintenance:**
   - _Description:_ Simplifies maintenance tasks and reduces the likelihood of errors.
   - _Explanation:_ The encapsulation of code and data within a class reduces the complexity of software systems. With a well-defined interface, modifications and updates to the internal implementation are localized, minimizing the risk of introducing errors and simplifying the maintenance process.
