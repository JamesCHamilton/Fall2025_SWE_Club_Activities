# Pokemon.java Explained (Beginner Friendly)

## What is this file?
`Pokemon.java` is a Java class that models a Pokémon character, showing how to use classes, objects, methods, and some basic Java features.

## How to Compile and Run
1. Open a terminal and go to the main project folder (the one containing `meeting2`).
2. Compile the code:
	```powershell
	javac meeting2/Pokemon.java
	```
3. Run the program:
	```powershell
	java meeting2.Pokemon
	```
	(Notice the dot, not a slash, between `meeting2` and `Pokemon`!)

## What does the code do?
The code defines a `Pokemon` class with properties (like name, type, level, attack power) and methods (actions the Pokémon can do, like level up, evolve, or attack). It also has a `main` method that creates and manipulates Pokémon objects.

## Key Concepts in the Code
- **Class**: `public class Pokemon` defines a blueprint for Pokémon objects.
- **Fields/Properties**: Variables like `name`, `type`, `level`, etc. store information about each Pokémon.
- **Constructors**: Special methods that create new Pokémon. There are two: one for Pokémon with one type, and one for Pokémon with two types.
- **Methods**: Functions that do things. Some are private (used only inside the class), and some are public (can be called from outside):
  - `levelUpPublic()`: Increases the Pokémon's level by 1.
  - `evolvePublic(String newName)`: Changes the Pokémon's name and increases attack power.
  - `attackPublic()`: Prints out an attack message.
- **toString()**: This method makes it easy to print out a Pokémon's details.
- **main()**: This is where the program starts. It creates two Pokémon (Pikachu and Charizard), prints them, levels them up, evolves them, and makes them attack.

## Example Output
When you run the program, you'll see something like:
```
Pokemon{name='Pikachu', type='Electric', level=25, attackPower=60}
Pokemon{name='Pikachu', type='Electric', level=26, attackPower=60}
Pikachu attacks with power 60
Pokemon{name='Charizard', type='Fire', secondType='Flying', level=50, attackPower=100}
Pokemon{name='Mega Charizard X', type='Fire', secondType='Flying', level=50, attackPower=120}
Mega Charizard X attacks with power 120
```

## Java Basics Shown Here
- **Classes and Objects**: How to define and use them
- **Methods**: How to make objects do things
- **Access Modifiers**: `private`, `public`, `protected` control what can be used where
- **Printing**: `System.out.println()`
- **Packages**: The `package meeting2;` line groups related files together

## Try it Yourself!
Change the Pokémon names, types, or stats in the code and see what happens when you run it. This is a great way to learn Java basics!
