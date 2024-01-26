# Arrays in Java

Arrays in Java are used to store multiple values of the same type in a single variable. They provide a convenient way to work with collections of data.

## Declaration and Initialization

### Declaration:

```java
// Declaration of an integer array
int[] intArray;

// Declaration of a string array
String[] stringArray;
```

### Initialization:

```java
// Initializing an integer array with size 5
intArray = new int[5];

// Initializing a string array with values
stringArray = new String[]{"Apple", "Banana", "Orange"};

```

### Accessing Elements

- You can access individual elements in an array using their index (starting from 0):

```java
// Accessing elements in an array
int firstElement = intArray[0];
String secondElement = stringArray[1];

```

### Array Length

- You can find the length of an array using the length property:

```java
    // Finding the length of an array
    int arrayLength = intArray.length;

```

### Iterating Through an Array

- You can use loops to iterate through the elements of an array:

```java
// Iterating through an array
    int[] numbers = {1, 2, 3, 4, 5};


    for (int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]);
    }

    // Array declaration and initialization
    int[] numbers = {1, 2, 3, 4, 5};

    // Enhanced for loop to iterate through the array
    for (int number : numbers) {
        System.out.println(number);
    }
```

## Strings in Java

In Java, strings are objects that represent sequences of characters.
The `String` class in Java provides a rich set of methods for working with strings.
Strings are widely used for representing text and are immutable, meaning their values cannot be changed after creation.

### Creating Strings

#### Using String Literal

```java
String greeting = "Hello, World!";
```

#### Using the new Keyword

```java
String welcome = new String("Welcome to Java!");
```

#### Using String Literal

```java
String greeting = "Hello, World!";
```

#### Commonly Used Methods of the `String` Class

- **length():** Returns the length of the string.
- **charAt(index):** Returns the character at the specified index.
- **substring(startIndex, endIndex):** Returns a substring based on the specified indices.
- **equals(anotherString):** Compares the content of two strings for equality.
- **concat(anotherString):** Concatenates two strings.
- **toUpperCase() and toLowerCase():** Converts the string to uppercase or lowercase.

```java
    String message = "Programming is fun!";
    int length = message.length(); // Returns 20
    char firstChar = message.charAt(0); // Returns 'P'
    String subString = message.substring(0, 11); // Returns "Programming"
    boolean isEqual = message.equals("Programming is Fun!"); // Returns false
    String newMessage = message.concat(" Let's code."); // Returns "Programming is fun! Let's code."
    String upperCaseMessage = message.toUpperCase(); // Returns "PROGRAMMING IS FUN!"

```

#### String Concatenation

```java
String firstName = "John";
String lastName = "Doe";

String fullName1 = firstName + " " + lastName; // Using +
String fullName2 = firstName.concat(" ").concat(lastName); // Using concat()
```

### Immutability of Strings in Java

In Java, strings are immutable, meaning their values cannot be changed after they are created. When you perform operations that seem to modify a string, you are actually creating a new string with the modified content. This immutability has several implications:

1. **Memory Efficiency:** Immutable strings allow for efficient memory usage, as they can be shared among different parts of a program without the risk of unintended modifications.

2. **Thread Safety:** Immutable strings are inherently thread-safe, as there is no risk of one thread modifying a string while another is using it.

3. **Security:** Immutability makes strings more secure, as the original content cannot be altered once it's created.

### StringBuilder in Java

To efficiently manipulate strings, Java provides the `StringBuilder` class. Unlike `String`, `StringBuilder` is mutable, meaning you can modify its content without creating a new object for each modification. This can lead to better performance when dealing with frequent string manipulations.

#### Creating a StringBuilder

```java
StringBuilder stringBuilder = new StringBuilder("Hello");
```

#### StringBuilder Methods

- **append(str):** Appends the specified string to the end.
- **insert(index, str):** Inserts the specified string at the specified index.
- **delete(startIndex, endIndex):** Deletes the substring from `startIndex` to `endIndex`.
- **reverse():** Reverses the characters in the `StringBuilder`.
- **charAt(index):** Returns the character at the specified index.
- **length():** Returns the length (number of characters) in the `StringBuilder`.
- **substring(startIndex):** Returns a substring starting from the specified index.
- **substring(startIndex, endIndex):** Returns a substring based on the specified indices.
- **replace(startIndex, endIndex, str):** Replaces the characters from `startIndex` to `endIndex` with the specified string.
- **indexOf(str):** Returns the index of the first occurrence of the specified string.
- **lastIndexOf(str):** Returns the index of the last occurrence of the specified string.
- **capacity():** Returns the current capacity of the `StringBuilder`.
- **ensureCapacity(minimumCapacity):** Ensures that the capacity is at least equal to the specified minimum capacity.
- **setLength(newLength):** Sets the length of the `StringBuilder`.

```java
public class StringBuilderExample {

    public static void main(String[] args) {
        // Creating a StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello");

        // Append a string to the end
        stringBuilder.append(" World");
        System.out.println("Appended: " + stringBuilder);

        // Insert a string at a specific index
        stringBuilder.insert(5, ",");
        System.out.println("Inserted: " + stringBuilder);

        // Delete a substring from startIndex to endIndex
        stringBuilder.delete(0, 6);
        System.out.println("Deleted: " + stringBuilder);

        // Reverse the characters
        stringBuilder.reverse();
        System.out.println("Reversed: " + stringBuilder);

        // Accessing character at a specific index
        char charAtIndex = stringBuilder.charAt(3);
        System.out.println("Character at index 3: " + charAtIndex);

        // Get the length of the StringBuilder
        int length = stringBuilder.length();
        System.out.println("Length: " + length);

        // Get a substring starting from a specific index
        String substringFromIndex = stringBuilder.substring(2);
        System.out.println("Substring from index 2: " + substringFromIndex);

        // Get a substring based on specified indices
        String substringByIndices = stringBuilder.substring(2, 5);
        System.out.println("Substring from index 2 to 5: " + substringByIndices);

        // Replace characters from startIndex to endIndex with a specified string
        stringBuilder.replace(1, 4, "i");
        System.out.println("Replaced: " + stringBuilder);

        // Find the index of the first occurrence of a specified string
        int indexOfString = stringBuilder.indexOf("o");
        System.out.println("Index of 'o': " + indexOfString);

        // Find the index of the last occurrence of a specified string
        int lastIndexOfString = stringBuilder.lastIndexOf("o");
        System.out.println("Last Index of 'o': " + lastIndexOfString);

        // Get the current capacity of the StringBuilder
        int capacity = stringBuilder.capacity();
        System.out.println("Capacity: " + capacity);

        // Ensure that the capacity is at least equal to the specified minimum capacity
        stringBuilder.ensureCapacity(20);

        // Set the length of the StringBuilder
        stringBuilder.setLength(5);
        System.out.println("New Length: " + stringBuilder);
    }
}
```
