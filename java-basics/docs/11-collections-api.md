# Java Collection API

The Java Collections Framework provides a set of interfaces and classes to represent a group of objects as a single unit. It includes various types of collections, such as lists, sets, maps, queues, and more. Here is an overview of the key interfaces and classes in the Java Collection API:

## Interfaces

### 1. **Collection Interface:**

- Represents the root interface in the collection hierarchy.
- Defines basic methods common to all collections.

### 2. **List Interface:**

- Extends `Collection` and represents an ordered collection.
- Allows duplicate elements.
- Implementing classes include `ArrayList`, `LinkedList`, and `Vector`.

### 3. **Set Interface:**

- Extends `Collection` and represents a collection that does not allow duplicate elements.
- Implementing classes include `HashSet`, `LinkedHashSet`, and `TreeSet`.

### 4. **Queue Interface:**

- Represents a collection for holding elements prior to processing.
- Extends `Collection` and adds methods specific to queues.
- Implementing classes include `LinkedList` and `PriorityQueue`.

### 5. **Map Interface:**

- Represents a collection of key-value pairs.
- Does not extend `Collection`.
- Implementing classes include `HashMap`, `LinkedHashMap`, `TreeMap`, and `HashTable`.

## Classes

# Java Collection API

Java Collection Framework provides a set of interfaces and classes that implement various data structures to store, organize, and manipulate data efficiently. It is a part of the Java Standard Edition (SE) library.

## Core Interfaces

1. **List:**

   - Ordered collection of elements that allows duplicates. Implementations include ArrayList, LinkedList, and Vector.

2. **Set:**

   - Unordered collection of unique elements. Implementations include HashSet, LinkedHashSet, and TreeSet.

3. **Queue:**

   - Ordered collection used to hold elements before processing. Implementations include LinkedList, PriorityQueue.

4. **Deque:**

   - A double-ended queue that supports insertion and removal at both ends. Implementations include ArrayDeque.

5. **Map:**
   - Key-value pair collection where each element is unique. Implementations include HashMap, LinkedHashMap, TreeMap.

## Core Classes

1. **ArrayList:**

   - Implements List interface using a dynamically resizable array.

```java
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        List<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Accessing elements in the ArrayList
        System.out.println("Fruits List: " + fruits);

        // Iterating through the ArrayList
        System.out.println("Iterating through the ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Removing an element from the ArrayList
        fruits.remove("Banana");
        System.out.println("After removing 'Banana': " + fruits);

        // Checking if the ArrayList contains an element
        System.out.println("Does the list contain 'Apple'? " + fruits.contains("Apple"));

        // Getting the size of the ArrayList
        System.out.println("Size of the ArrayList: " + fruits.size());

        // Clearing all elements from the ArrayList
        fruits.clear();
        System.out.println("After clearing the list: " + fruits);
    }
}
```

2. **LinkedList:**

   - Implements List and Deque interfaces using a doubly-linked list.

```java
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList of Strings
        List<String> colors = new LinkedList<>();

        // Adding elements to the LinkedList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Accessing elements in the LinkedList
        System.out.println("Colors LinkedList: " + colors);

        // Iterating through the LinkedList
        System.out.println("Iterating through the LinkedList:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Adding an element at the beginning of the LinkedList
        ((LinkedList<String>) colors).addFirst("Yellow");
        System.out.println("After adding 'Yellow' at the beginning: " + colors);

        // Adding an element at the end of the LinkedList
        colors.add("Purple");
        System.out.println("After adding 'Purple' at the end: " + colors);

        // Removing an element from the LinkedList
        colors.remove("Green");
        System.out.println("After removing 'Green': " + colors);

        // Checking if the LinkedList contains an element
        System.out.println("Does the list contain 'Blue'? " + colors.contains("Blue"));

        // Getting the size of the LinkedList
        System.out.println("Size of the LinkedList: " + colors.size());

        // Clearing all elements from the LinkedList
        colors.clear();
        System.out.println("After clearing the list: " + colors);
    }
}
```

3. **HashSet:**

   - Implements Set interface using a hash table for storage.

```java
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet of integers
        Set<Integer> numbers = new HashSet<>();

        // Adding elements to the HashSet
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);

        // Accessing elements in the HashSet
        System.out.println("Numbers HashSet: " + numbers);

        // Iterating through the HashSet
        System.out.println("Iterating through the HashSet:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Adding duplicate elements (ignored in a HashSet)
        numbers.add(10);
        numbers.add(15);
        System.out.println("After adding duplicate elements: " + numbers);

        // Removing an element from the HashSet
        numbers.remove(10);
        System.out.println("After removing '10': " + numbers);

        // Checking if the HashSet contains an element
        System.out.println("Does the set contain '15'? " + numbers.contains(15));

        // Getting the size of the HashSet
        System.out.println("Size of the HashSet: " + numbers.size());

        // Clearing all elements from the HashSet
        numbers.clear();
        System.out.println("After clearing the set: " + numbers);
    }
}
```

4. **LinkedHashSet:**

   - Implements Set interface using a hash table with a linked list for ordering.

```java
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Creating a LinkedHashSet of strings
        Set<String> fruits = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Accessing elements in the LinkedHashSet
        System.out.println("Fruits LinkedHashSet: " + fruits);

        // Iterating through the LinkedHashSet
        System.out.println("Iterating through the LinkedHashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Adding duplicate elements (ignored in a LinkedHashSet)
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("After adding duplicate elements: " + fruits);

        // Removing an element from the LinkedHashSet
        fruits.remove("Banana");
        System.out.println("After removing 'Banana': " + fruits);

        // Checking if the LinkedHashSet contains an element
        System.out.println("Does the set contain 'Apple'? " + fruits.contains("Apple"));

        // Getting the size of the LinkedHashSet
        System.out.println("Size of the LinkedHashSet: " + fruits.size());

        // Clearing all elements from the LinkedHashSet
        fruits.clear();
        System.out.println("After clearing the set: " + fruits);
    }
}
```

5. **TreeSet:**

   - Implements Set interface using a Red-Black tree for storage.

```java
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet of integers
        Set<Integer> numbers = new TreeSet<>();

        // Adding elements to the TreeSet
        numbers.add(5);
        numbers.add(10);
        numbers.add(3);

        // Accessing elements in the TreeSet
        System.out.println("Numbers TreeSet: " + numbers);

        // Iterating through the TreeSet
        System.out.println("Iterating through the TreeSet:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Adding duplicate elements (ignored in a TreeSet)
        numbers.add(10);
        numbers.add(3);
        System.out.println("After adding duplicate elements: " + numbers);

        // Removing an element from the TreeSet
        numbers.remove(10);
        System.out.println("After removing '10': " + numbers);

        // Checking if the TreeSet contains an element
        System.out.println("Does the set contain '5'? " + numbers.contains(5));

        // Getting the size of the TreeSet
        System.out.println("Size of the TreeSet: " + numbers.size());

        // Clearing all elements from the TreeSet
        numbers.clear();
        System.out.println("After clearing the set: " + numbers);
    }
}
```

6. **HashMap:**

   - Implements Map interface using a hash table for storage.

```java
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap with String keys and Integer values
        Map<String, Integer> studentGrades = new HashMap<>();

        // Adding key-value pairs to the HashMap
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 92);
        studentGrades.put("Charlie", 78);

        // Accessing elements in the HashMap
        System.out.println("Student Grades HashMap: " + studentGrades);

        // Iterating through the HashMap
        System.out.println("Iterating through the HashMap:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Adding duplicate key (replaces the existing value)
        studentGrades.put("Bob", 95);
        System.out.println("After adding duplicate key 'Bob': " + studentGrades);

        // Removing a key-value pair from the HashMap
        studentGrades.remove("Charlie");
        System.out.println("After removing 'Charlie': " + studentGrades);

        // Checking if the HashMap contains a key
        System.out.println("Does the map contain 'Alice'? " + studentGrades.containsKey("Alice"));

        // Getting the size of the HashMap
        System.out.println("Size of the HashMap: " + studentGrades.size());

        // Clearing all key-value pairs from the HashMap
        studentGrades.clear();
        System.out.println("After clearing the map: " + studentGrades);
    }
}
```

7. **LinkedHashMap:**

   - Implements Map interface using a hash table with a linked list for ordering.

```java
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Creating a LinkedHashMap with String keys and Integer values
        Map<String, Integer> populationByCity = new LinkedHashMap<>();

        // Adding key-value pairs to the LinkedHashMap
        populationByCity.put("New York", 8419600);
        populationByCity.put("Los Angeles", 3980400);
        populationByCity.put("Chicago", 2716000);

        // Accessing elements in the LinkedHashMap
        System.out.println("Population by City LinkedHashMap: " + populationByCity);

        // Iterating through the LinkedHashMap
        System.out.println("Iterating through the LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : populationByCity.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Adding duplicate key (replaces the existing value)
        populationByCity.put("Los Angeles", 3999759);
        System.out.println("After adding duplicate key 'Los Angeles': " + populationByCity);

        // Removing a key-value pair from the LinkedHashMap
        populationByCity.remove("Chicago");
        System.out.println("After removing 'Chicago': " + populationByCity);

        // Checking if the LinkedHashMap contains a key
        System.out.println("Does the map contain 'New York'? " + populationByCity.containsKey("New York"));

        // Getting the size of the LinkedHashMap
        System.out.println("Size of the LinkedHashMap: " + populationByCity.size());

        // Clearing all key-value pairs from the LinkedHashMap
        populationByCity.clear();
        System.out.println("After clearing the map: " + populationByCity);
    }
}
```

8. **TreeMap:**

   - Implements Map interface using a Red-Black tree for storage.

```java
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Creating a TreeMap with String keys and Integer values
        Map<String, Integer> studentGrades = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 92);
        studentGrades.put("Charlie", 78);

        // Accessing elements in the TreeMap
        System.out.println("Student Grades TreeMap: " + studentGrades);

        // Iterating through the TreeMap
        System.out.println("Iterating through the TreeMap:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Adding duplicate key (replaces the existing value)
        studentGrades.put("Bob", 95);
        System.out.println("After adding duplicate key 'Bob': " + studentGrades);

        // Removing a key-value pair from the TreeMap
        studentGrades.remove("Charlie");
        System.out.println("After removing 'Charlie': " + studentGrades);

        // Checking if the TreeMap contains a key
        System.out.println("Does the map contain 'Alice'? " + studentGrades.containsKey("Alice"));

        // Getting the size of the TreeMap
        System.out.println("Size of the TreeMap: " + studentGrades.size());

        // Clearing all key-value pairs from the TreeMap
        studentGrades.clear();
        System.out.println("After clearing the map: " + studentGrades);
    }
}
```

9. **ArrayDeque:**

   - Implements Deque interface using resizable arrays.

```java
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // Creating an ArrayDeque of strings
        Deque<String> colorsDeque = new ArrayDeque<>();

        // Adding elements to the front of the deque
        colorsDeque.addFirst("Red");
        colorsDeque.addFirst("Green");
        colorsDeque.addFirst("Blue");

        // Adding elements to the end of the deque
        colorsDeque.addLast("Yellow");
        colorsDeque.addLast("Orange");

        // Accessing elements in the deque
        System.out.println("Colors ArrayDeque: " + colorsDeque);

        // Iterating through the deque (front to end)
        System.out.println("Iterating through the ArrayDeque (front to end):");
        for (String color : colorsDeque) {
            System.out.println(color);
        }

        // Removing elements from the front of the deque
        String removedFirst = colorsDeque.removeFirst();
        System.out.println("Removed from the front: " + removedFirst);

        // Removing elements from the end of the deque
        String removedLast = colorsDeque.removeLast();
        System.out.println("Removed from the end: " + removedLast);

        // Checking if the deque contains an element
        System.out.println("Does the deque contain 'Green'? " + colorsDeque.contains("Green"));

        // Getting the size of the deque
        System.out.println("Size of the ArrayDeque: " + colorsDeque.size());

        // Clearing all elements from the deque
        colorsDeque.clear();
        System.out.println("After clearing the deque: " + colorsDeque);
    }
}
```

10. **PriorityQueue:**

    - Implements Queue interface using a priority heap.

```java
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Creating a PriorityQueue of integers
        PriorityQueue<Integer> numbersQueue = new PriorityQueue<>();

        // Adding elements to the PriorityQueue
        numbersQueue.add(30);
        numbersQueue.add(20);
        numbersQueue.add(50);
        numbersQueue.add(10);

        // Accessing elements in the PriorityQueue (in ascending order)
        System.out.println("Numbers PriorityQueue: " + numbersQueue);

        // Polling elements from the PriorityQueue (removing and retrieving)
        int minNumber = numbersQueue.poll();
        System.out.println("Min Number: " + minNumber);

        // Accessing elements after polling
        System.out.println("Numbers PriorityQueue after polling: " + numbersQueue);

        // Checking if the PriorityQueue contains an element
        System.out.println("Does the queue contain 20? " + numbersQueue.contains(20));

        // Getting the size of the PriorityQueue
        System.out.println("Size of the PriorityQueue: " + numbersQueue.size());

        // Clearing all elements from the PriorityQueue
        numbersQueue.clear();
        System.out.println("After clearing the PriorityQueue: " + numbersQueue);
    }
}
```
