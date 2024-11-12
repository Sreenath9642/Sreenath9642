Magical Arena Game
This project implements a turn-based "Magical Arena" game in Java. In this game, two players face off in an arena, each with health, strength, and attack attributes. The players take turns to attack and defend, with the game continuing until one player's health reaches zero. This project focuses on demonstrating clean code design, readability, and test coverage.

Table of Contents
Getting Started
Game Rules
Design Overview
How to Run the Code
Running Tests
Commit History Guidelines
Getting Started
Prerequisites
Java 11 or later
IDE (e.g., IntelliJ, Eclipse) or command line tools
Setup
Clone the repository to your local machine:
bash
Copy code
git clone <repository-url>
Navigate to the project folder:
bash
Copy code
cd magical-arena
Game Rules
Each player has three attributes: health, strength, and attack, all positive integers.
Players take turns to attack each other, with the player having lower health starting the match.
The attacking player rolls an attacking die (1-6), and the defending player rolls a defending die (1-6).
Damage dealt by the attacker is calculated as:
makefile
Copy code
damage = attack * attack_die_roll
Defense by the defender is calculated as:
makefile
Copy code
defense = strength * defense_die_roll
If the attacker’s damage exceeds the defender’s defense, the difference is subtracted from the defender’s health.
The game ends when a player’s health reaches zero, and the player with remaining health is declared the winner.
Design Overview
Classes
Player:

Attributes: health, strength, attack.
Methods:
attack(): Returns attack damage based on a dice roll.
defend(): Returns defense points based on a dice roll.
takeDamage(int damage): Reduces health based on the net damage received.
isAlive(): Checks if the player's health is above zero.
Arena:

Manages the battle between two players.
Handles turn-based mechanics, damage calculation, and game termination conditions.
startFight(): Begins the game loop where players alternate turns until one player loses.
How to Run the Code
Open the project in your preferred IDE or use the command line.
Compile the code:
bash
Copy code
javac src/*.java
Run the main class (assuming it's Arena):
bash
Copy code
java src/Arena
Running Tests
Unit tests are included for key methods in the Player and Arena classes.
To run the tests:
If using an IDE, right-click on the test directory and select "Run All Tests".
Or, using the command line:
bash
Copy code
javac -cp .:junit-4.13.2.jar org.junit.runner.JUnitCore TestClassName
Commit History Guidelines
Commit Often: Break down your work into small, incremental commits.
Meaningful Messages: Each commit message should describe the specific change made, e.g., “Add damage calculation logic to Player class.”
Example Commit Messages:
Initial commit: Add basic project structure and Player class
Implement attack and defend methods for Player
Add startFight method in Arena class to manage game flow
Add unit tests for Player and Arena classes
