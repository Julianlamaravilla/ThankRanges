# Java Swing Tank Level Indicator

## Overview

This Java application uses **Swing (JOptionPane)** to simulate a **tank level indicator**. The program asks the user to enter a numeric value representing the tank range and then displays the corresponding tank level status message.

## Features

* Graphical input using `JOptionPane`
* Tank level classification based on numeric ranges
* Conditional logic using `if-else`
* Error handling with automatic restart
* User-friendly pop-up messages

## Tank Level Classification

The program classifies the tank level according to the following ranges:

| Range        | Tank Status  |
| ------------ | ------------ |
| 70           | Tank full    |
| 60 – 69      | Almost full  |
| 40 – 59      | Tank 1/4     |
| 35 – 39      | Half a tank  |
| 20 – 34      | Sufficient   |
| 1 – 19       | Insufficient |
| Other values | Out of range |

## How It Works

1. The user enters a numeric value representing the tank level.
2. The program evaluates the value using conditional statements.
3. A message is displayed indicating the tank status.
4. If the value is out of range or invalid:

   * An error message is shown.
   * The program restarts automatically.

## Code Structure

* `main` method: Program entry point
* `JOptionPane.showInputDialog`: Receives user input
* `Double.parseDouble`: Converts input to a numeric value
* `if-else` statements: Evaluate tank ranges
* `try-catch`: Handles invalid input errors
* Recursive call `main(args)`: Restarts program on error

## Requirements

* Java Development Kit (JDK) 8 or higher
* Any Java IDE (IntelliJ IDEA, Eclipse, NetBeans) or terminal

## How to Run

### Using an IDE

1. Open the project in your IDE
2. Run the `Main` class

### Using Terminal

```bash
javac Main.java
java Main
```

## Example

**Input:**

```
Enter Ranges Tank: 65
```

**Output:**

```
Almost full
```

## Error Handling

* If the user enters a non-numeric value, the program displays an error message and restarts.
* If the user enters a number outside the defined ranges, the program displays **"Out of the range"** and restarts.

## Notes

* The program uses recursion (`main(args)`) to restart when an error occurs. This works for small programs but is not recommended for large applications because it may cause memory issues.
* A loop structure (`while`) would be a better approach in a real-world application.

## Possible Improvements

* Replace recursion with a loop
* Add a graphical progress bar to represent the tank level
* Allow percentage input (0–100%)
* Improve tank classification logic and labels

## Author

Developed as a Java practice exercise using Swing, conditional statements, and exception handling.
