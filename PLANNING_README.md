<img width="1136" height="719" alt="image" src="https://github.com/user-attachments/assets/9ec38bf7-e443-446f-b012-9e47de96e9de" />


**Project 1.1.6 Numbers Riddle: Planning and Documentation**

**Project Overview and Requirements
The objective of this project is to create a program that tests and validates a mathematical numbers riddle using the software development process. The riddle demonstrates distributive, commutative, and associative properties by asking the user to choose an integer, double it, add 6, divide it in half, and subtract the original number. The final result is always 3.**

To meet the project requirements, the final code must include the following structural and algo elements:

- A class definition header matching the file name, alongside the main method.

- A variable defined as the starting number.

- Six specific test variables that uses both int and double data types.

- Test values that include positive, negative, and zero values.

- Algorithms that process the chosen numbers.

- A print statement displaying the chosen starting number.

- Print statements that explicitly display each individual calculation step and the final result, rather than taking a shortcut and only printing "3".

- The implementation of camelCase naming conventions where appropriate.

- The inclusion of comments within the code.

- The use of both multiline and inline comments.

- The use of print and println methods to output data.

- The application of arithmetic expressions and the compound assignment operator.

- Conversions between int and double data types.

**Software Development Process & Collaboration**

Group Collaboration Strategies:

- Phase 1 & 2 (Investigate & Plan): We will outline the mathematical steps of the riddle together on a shared document to ensure we understand the required order of operations before writing any Java code.

- Phase 3 & 4 (Design, Create, and Test): We will utilize pair programming. One partner will act as the Driver or coder writing the initial variable declarations and the first algorithm trial, while the Navigators (can be more than one member) reviews for syntax errors and correct variable casting. We will then split the remaining 5 times so each member gets hands on coding experience.

- Phase 5 & 6 (Evaluate & Document): We will conduct a final review against the project checklist to guarantee all naming conventions, inline comments, and multiline comments are present before final submission.


**Algorithm and Code Segments**

Pseudocode (Single Trial):

DECLARE startingNumber
PRINT startingNumber

SET riddleNumber TO 2 * startingNumber
PRINT riddleNumber

ADD 6.0 to riddleNumber
PRINT riddleNumber

DIVIDE riddleNumber by 2
PRINT riddleNumber

SUBTRACT startingNumber from riddleNumber
PRINT final riddleNumber (Should be 3)

**Java Code Implementation (Excerpt):
To make sure we meet the requirement of testing various data types and values, we first declare our six test cases and our constant addition value at the top of our main method.**

int startingNumber = 1;
int negativeStartingNumber = -1;
double doubleStartingNumber = 1.5;
double doubleNegativeStartingNumber = -1.5;
int zeroStartingNumber = 0;
int largerStartingNumber = 10;
final double addNumber = 6.0;

**Below is the segment demonstrating the first trial. The code correctly stores the init calculation in riddleNumber and then modifies that variable, printing the result at each step to validate the riddles.
**
// This is the algorithm for the first riddle number
System.out.println();
System.out.println("Trial 1: Starting number is: " + startingNumber);

double riddleNumber = 2 * startingNumber;
System.out.println("The riddle number is: " + riddleNumber);

riddleNumber = riddleNumber + addNumber;
System.out.println("The riddle number is: " + riddleNumber);

riddleNumber = riddleNumber / 2;
System.out.println("The riddle number is: " + riddleNumber);

riddleNumber = riddleNumber - startingNumber;
System.out.println("The riddle number is: " + riddleNumber);
