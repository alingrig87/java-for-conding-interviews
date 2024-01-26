# 01 running java programs

### Class in Java

In Java, a class is a fundamental unit of object-oriented programming. A class defines the behavior and characteristics of an object. Generally, a class can contain attributes (variables) and methods (functions).

Example of defining a simple class in Java:

```java
public class MyClass {
    // Attributes (variables) can be defined here

    // Methods can be defined here
}
```

## `main` Method in Java

In Java programming, the `main` method plays a crucial role as the entry point of any standalone Java application. When you run a Java program, the Java Virtual Machine (JVM) looks for the `main` method to start the execution of the program.

## Structure of the `main` Method

The `main` method has a specific signature, and its structure looks like this:

```java
public static void main(String[] args) {
    // Code to be executed when the program starts
}

```

- **`public`**: The `main` method is declared as public, which means it can be accessed from outside the class.

- **`static`**: The `main` method is static, allowing it to be called without creating an instance of the class. This is a requirement for the JVM to invoke the method without creating an object of the class.

- **`void`**: The `main` method does not return any value.

- **`main`**: The name of the method, which is recognized by the JVM as the entry point.

- **`String[] args`**: The method takes an array of strings as parameters, allowing you to pass command-line arguments to the program.

## Steps for Compilation and Execution:

1. **Open IntelliJ IDEA:**

   - Open IntelliJ IDEA and make sure your Java project is loaded.

2. **Create or Open a Java File:**

   - Create a new Java file (e.g., MyProgram.java) or open an existing one.

3. **Write Your Java Code:**

   - Write your Java code, including the main method.

4. **Add Arguments in IntelliJ:**

   - If your program expects command-line arguments, you can specify them in IntelliJ.
   - Navigate to Run > Edit Configurations...
   - In the "Program arguments" field, enter your arguments separated by spaces.

5. **Compile and Run:**
   - Click on the green "Run" button in the toolbar or press Shift + F10 to compile and execute your program.

## Running from the Command Line

1. **Open a Terminal or Command Prompt:**

   - Open a terminal on Linux or MacOS, or a Command Prompt / PowerShell on Windows.

2. **Navigate to the Project Directory:**

   - Use the `cd` command to navigate to the directory where your Java file is located.

3. **Check Java Installation:**

   - Ensure that Java is installed on your system by running:
     ```bash
     java -version
     ```

4. **Check Java Compiler Installation:**

   - Ensure that the Java compiler (`javac`) is installed by running:
     ```bash
     javac -version
     ```

5. **Set JAVA_HOME (if not set):**

   - If `JAVA_HOME` is not set, set it to the path of your JDK installation directory. For example:
     - **Linux / MacOS:**
       ```bash
       export JAVA_HOME=/path/to/your/jdk
       export PATH=$PATH:$JAVA_HOME/bin
       ```
     - **Windows:**
       ```cmd
       set JAVA_HOME=C:\Path\To\Your\JDK
       set PATH=%PATH%;%JAVA_HOME%\bin
       ```

6. **Compile the Java File:**

   - Compile your Java file using the `javac` command. For example:
     ```bash
     javac MyProgram.java
     ```

7. **Run the Java Program:**
   - Execute your Java program using the `java` command. If your program expects arguments, provide them after the class name. For example:
     ```bash
     java MyProgram arg1 arg2 arg3
     ```
