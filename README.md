# Binary Calculator Suite

Java console applications that perform binary arithmetic operations using custom algorithms and manual computation methods.

## Overview

- **Binary Multiplication Calculator** — Performs binary multiplication using 2D arrays and grid-based calculation
- **Binary Addition Calculator** — Performs binary addition with custom carry-over logic

Both calculators implement binary arithmetic rules manually without using built-in conversion methods.

## Installation

```bash
# Clone the repository
git clone https://github.com/yourusername/Binary_Exercises.git
cd Binary_Exercises

# Compile and run
javac -d out src/main/java/Binary_Exercise1/*.java
javac -d out src/main/java/Binary_Exercise2/*.java

java -cp out Binary_Exercise1.Binary_Addiction
java -cp out Binary_Exercise2.Binary_Calculator_Multiplication
```

## Features

### Binary Addition
- Manual binary addition with proper carry-over handling
- Processes multi-digit binary numbers
- Example: `1011111111 + 111111111 = 10011111110`

### Binary Multiplication
- Grid-based multiplication using 2D arrays
- Interactive user input
- Visual display of calculation steps
- Example: `101 × 11 = 1111`

## Screenshots
![Binary Addition](/docs/Binary_Addiction.PNG)

![Binary Multiplication](/docs/Binary_Multiplication.PNG)


## Technologies

- Java
- Arrays and 2D Arrays
- Scanner for user input
- Maven

## License

This project is licensed under the MIT License.


