# Day1.java Explained (Beginner Friendly)

## What is Java?
Java is a popular programming language used to build all kinds of applications. Java code is written in files ending with `.java`. You write code, then "compile" it (turn it into a form the computer can run), and then you "run" it.

## How to Compile and Run Day1.java
1. **Open a terminal or command prompt.**
2. **Navigate to the folder** where `Day1.java` is located (in this case, `meeting1`).
3. **Compile the code:**
   ```powershell
   javac Day1.java
   ```
   This creates a file called `Day1.class` (the compiled version).
4. **Run the program:**
   ```powershell
   java Day1
   ```
   You should see output in the terminal.

## Explaining the Code

```java
package meeting1;
class Day1 {
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		int a = 5;
		int b = 10;
		int sum = a + b;
		System.out.println("Sum: " + sum);
		String greeting = "Welcome to Java programming!";
		greeting = greeting.toUpperCase();
		System.out.println(greeting);
		greeting = greeting.toLowerCase();
		System.out.println(greeting);
		greeting = greeting.replace("java", "Python");
		System.out.println(greeting);
		String[] words = greeting.split(" ");
		for (String word : words) {
			System.out.println(word);
		}
		System.out.println("Length of greeting: " + greeting.length());
		System.out.println("Character at index 5: " + greeting.charAt(5));
		System.out.println("Substring (0, 7): " + greeting.substring(0, 7));
		System.out.println("Index of 'Python': " + greeting.indexOf("Python"));
		System.out.println("Trimmed greeting: '" + greeting.trim() + "'");
	}
}
```

### Line-by-Line Explanation
- `package meeting1;` — Organizes the file into a package (like a folder for code). For beginners, you can ignore this for now.
- `class Day1 { ... }` — Defines a class (a blueprint for objects or a container for code). The file name and class name should match.
- `public static void main(String[] args)` — This is the entry point. The program starts running from here.
- `System.out.println(...)` — Prints text to the terminal.
- `int a = 5; int b = 10; int sum = a + b;` — Declares two numbers and adds them.
- `String greeting = ...` — Creates a text variable.
- `greeting.toUpperCase()` — Changes all letters to uppercase.
- `greeting.toLowerCase()` — Changes all letters to lowercase.
- `greeting.replace("java", "Python")` — Replaces the word "java" with "Python".
- `greeting.split(" ")` — Splits the text into words.
- `for (String word : words) { ... }` — Loops through each word and prints it.
- `greeting.length()` — Gets the number of characters in the text.
- `greeting.charAt(5)` — Gets the character at position 5 (counting starts at 0).
- `greeting.substring(0, 7)` — Gets the first 7 characters.
- `greeting.indexOf("Python")` — Finds where "Python" appears in the text (returns -1 if not found).
- `greeting.trim()` — Removes spaces at the start and end.

## Java Basics
- **Statements end with `;`**
- **Variables** store data (like numbers or text)
- **Strings** are text
- **Methods** (like `toUpperCase()`) do things to data
- **Comments** start with `//` and are ignored by the computer

## Summary
This file shows how to print, use variables, work with text, and use loops in Java. Try changing the code and running it again to see what happens!
