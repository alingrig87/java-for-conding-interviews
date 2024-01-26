### Setting Up IntelliJ IDEA

#### Step 1: Install IntelliJ IDEA Community Edition

- Visit the [IntelliJ IDEA download page](https://www.jetbrains.com/idea/download/) and download the Community Edition.
- Follow the installation instructions based on your operating system.

#### Step 2: Open IntelliJ IDEA and Create a New Java Project

1. Open IntelliJ IDEA after installation.
2. Click on "Create New Project" or go to `File` > `New` > `Project`.
3. Select "Java" on the left sidebar and choose "Java" as the Project SDK.
4. Click "Next."

5. Enter a Project Name (e.g., HelloWorld) and click "Finish."

#### Step 3: Create a Java Hello World Class

1. In the Project Explorer, locate the "src" folder.
2. Right-click on the "src" folder and choose `New` > `Java Class`.
3. Name the class (e.g., HelloWorld) and click "OK."
4. Inside the class, write a simple Java Hello World program:

   ```java
   public class HelloWorld {
       public static void main(String[] args) {
           System.out.println("Hello, World!");
       }
   }
   ```

#### Step 4: Set Up the Terminal with Git Bash

1. Open IntelliJ IDEA and go to `View` > `Tool Windows` > `Terminal`.
2. In the terminal, type the following command to set Git Bash as your default terminal:

   ```bash
   git config --global core.autocrlf input
   ```

#### Step 5: Making Commits and Pushing Changes via Terminal

5.1 **Check Status**

Before making a commit, check the status of your repository:

```bash
git status
```

5.2 **Stage Changes**

Stage the changes you want to commit:

```bash
git add .
```

You can also stage specific files:

```bash
git add file1.txt file2.java
```

5.3 **Commit Changes**

Commit the staged changes with a descriptive message:

```bash
git commit -m "add: Hello world project"
```

5.4 **Push Changes to Remote Repository**

Push the committed changes to the remote repository (replace `main` with your branch name):

```bash
git push origin main
```
