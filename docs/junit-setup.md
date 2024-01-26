# Junit Setup

## Creating a Maven Project in IntelliJ IDEA

Apache Maven is a widely used project management and comprehension tool. It is part of the Apache Software Foundation's efforts to automate the build process and manage project dependencies. Maven uses a standard directory layout and a declarative approach to specify the build process.

Key aspects of Apache Maven:

### 1. Project Object Model (POM):

Maven uses a Project Object Model, represented by an XML file called pom.xml. This file contains information about the project, its dependencies, build settings, and plugins.

### 2. Dependency Management:

Maven simplifies the process of managing external libraries (dependencies) by automatically downloading and managing them. Dependencies are specified in the pom.xml file.

### 3. Build Lifecycle:

Maven defines a set of build phases (such as compile, test, package, install, and deploy) that are executed in a sequence known as the build lifecycle. Plugins associated with each phase carry out specific tasks.

### 4. Convention over Configuration:

Maven follows the principle of "convention over configuration," meaning that it uses sensible defaults and conventions to reduce the amount of configuration required. This promotes consistency across projects.

### 5. Central Repository:

Maven Central Repository is a centralized repository where Maven can automatically download dependencies. It is a vast collection of open-source libraries and components.

### 6. Plugin Architecture:

Maven is extensible through plugins, which provide additional functionality. There are plugins for various tasks, such as compiling code, running tests, creating JARs, and more.

### 7. Command-Line Interface and IDE Integration:

Maven can be used from the command line, and many integrated development environments (IDEs), including IntelliJ IDEA, Eclipse, and NetBeans, have built-in support for Maven.

#### Step 1: Open IntelliJ IDEA

Open IntelliJ IDEA and make sure it is properly installed on your system.

#### Step 2: Create a New Project

1. Click on `Create New Project` or go to `File` > `New` > `Project`.

2. In the "New Project" window, choose `Maven` on the left sidebar.

3. Check the box that says "Create from archetype" and select the `maven-archetype-quickstart` from the list.

4. Click `Next`.

#### Step 3: Configure Project

1. **GroupId:** Enter a unique identifier for your organization or project. For example, `com.example`.

2. **ArtifactId:** Enter a unique identifier for your project. For example, `my-maven-project`.

3. **Version:** Enter the initial version of your project. For example, `1.0-SNAPSHOT`.

4. **Project Name:** IntelliJ IDEA will automatically populate this based on the ArtifactId.

5. **Project Location:** Choose the location where you want to save your project.

6. Click `Next`.

#### Step 4: Project SDK

Choose the JDK version you want to use for your project. If you haven't set up a JDK, click `New` and select the JDK installation directory.

Click `Next`.

#### Step 5: Project Metadata

Enter your information or leave the default values for the `GroupId`, `ArtifactId`, and `Version`.

Click `Finish`.

#### Step 6: Open Project

IntelliJ IDEA will now create your Maven project. Once the process is complete, you will see your project structure.

## Create unit tests using Junit

# Adding JUnit Dependency to a Maven Project

To add JUnit dependency to your Maven project, follow these steps:

## Step 1: Open `pom.xml`

Open the `pom.xml` file in the root of your Maven project.

## Step 2: Add JUnit Dependency

Inside the `<dependencies>` section, add the JUnit dependency:

```xml
<dependencies>
    <!-- Other dependencies -->

    <!-- JUnit Dependency -->
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.13.1</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

## Step 3: Save Changes

Save the `pom.xml` file.

## Step 4: Update Maven Project

IntelliJ IDEA will usually detect the changes automatically and prompt you to reload the project. If not, you can manually update the project:

- Right-click on the project in the Project Explorer.
- Select `Maven` > `Reload Project`.

## Step 5: Verify JUnit Dependency with a Calculator Class

Create a simple `Calculator` class along with JUnit test cases to ensure that the JUnit dependency is added successfully. Follow these steps:

### Create a Calculator Class

Create a new Java class, for example, `Calculator.java`:

src
└── main
└── java
└── com
└── example
└── Calculator.java

```java
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
```

### Create JUnit Test Cases

Create a JUnit test class for the Calculator class, for example, `CalculatorTest.java`:

src
└── test
└── java
└── com
└── example
└── CalculatorTest.java

```java
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(15, calculator.multiply(3, 5));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(10, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        calculator.divide(10, 0);
    }
}
```
### Using Data Providers
- add `junit-jupiter-params` dependency in pom.xml
- reload maven project
```xml
  <dependency>
  <groupId>org.junit.jupiter</groupId>
  <artifactId>junit-jupiter-params</artifactId>
  <version>5.10.1</version>
  <scope>test</scope>
  </dependency>
```

- Create Test data
```java
import java.util.stream.Stream;

public class DataProviders {
    public static Stream<Object[]> dataProviderForAdd() {
        return Stream.of(
                new Object[]{1, 2, 3},
                new Object[]{0, 0, 0},
                new Object[]{-1, 1, 0}
        );
    }
}
```

- Use Test data
```java
public class CalculatorTest {

    @ParameterizedTest
    @MethodSource("DataProviders#dataProviderForAdd")
    public void testAddWithDataProvider(int a, int b, int expected) {
        Calculator calculator = new Calculator();
        assertEquals(expected, calculator.add(a, b));
    }
}
```