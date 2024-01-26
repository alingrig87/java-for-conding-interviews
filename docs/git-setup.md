### Initial Git Setup:

1. **Install Git:**

   - Download and install Git from [git-scm.com](https://git-scm.com/).
   - Follow the installation instructions for your operating system.

2. **Configure Git:**
   - Open a terminal or command prompt.
   - Set your username:
     ```bash
     git config --global user.name "Your Name"
     ```
   - Set your email address:
     ```bash
     git config --global user.email "your.email@example.com"
     ```

### Forking a GitHub Repository:

1. **Visit GitHub:**

   - Go to the GitHub repository you want to fork.

2. **Fork the Repository:**
   - Go to https://github.com/alingrig87/java-algo
   - Click the "Fork" button in the top-right corner of the repository page.
   - This creates a copy of the repository in your GitHub account.

### Cloning and Local Setup:

1. **Clone the Forked Repository:**

   - Open your terminal.
   - Clone the forked repository to your local machine:
     ```bash
     git clone https://github.com/your-username/repository.git
     ```
   - Replace `your-username` with your GitHub username and `repository` with the name of the repository.

2. **Navigate to the Cloned Repository:**

   ```bash
   cd repository
   ```

3. **Create a new file:**

   - create new file test.txt
   - add some random text

4. **Stage and Commit:**

   - Stage your changes:
     ```bash
     git add .
     ```
   - Commit your changes:
     ```bash
     git commit -m "Your commit message here"
     ```

5. **Push Changes to Your Fork:**
   - Push the committed changes to your fork on GitHub:
     ```bash
     git push
     ```

6 **Commit Message Best Practices**

When making commits, it's a good practice to follow a consistent format for commit messages. Use the following prefixes to categorize your commits:

#### Feature (feat):

- **feat: Add user authentication**
- **feat: Implement responsive design for mobile**
- **feat: Introduce new API endpoint for data retrieval**

#### Bug Fix (fix):

- **fix: Resolve issue with login button alignment**
- **fix: Fix bug causing data corruption in module X**

#### Cleanup (cleanup):

- **cleanup: Remove unused dependencies**
- **cleanup: Refactor code in module Y for clarity**

#### Chore (chore):

- **chore: Update build scripts**
- **chore: Reorganize project structure**

#### Configuration (config):

- **config: Update database configuration**
- **config: Add new environment variables**

#### Documentation (doc):

- **doc: Update README with installation instructions**
- **doc: Add API documentation for endpoints**
- **doc: Clarify usage of configuration settings**

#### Refactor (refactor):

- **refactor: Simplify logic in module A**
- **refactor: Extract common functions for reuse**
- **refactor: Improve variable naming in class B**

#### Other (misc):

- **misc: Add new utility functions for handling dates**
- **misc: Update third-party dependencies**
- **misc: Address code review feedback**
