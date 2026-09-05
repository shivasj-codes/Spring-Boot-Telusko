/**
 * Smart Console Calculator: Advanced Exercise: Build Your First Java Program
 * That Thinks
 * 
 * Create a minimal console-style calculator in Java that uses predefined values
 * instead of reading input from the user.
 * 1. Initialize two numbers (e.g., double num1 = 7;, double num2 = 3;) and an
 * operator (e.g., char operator = '+').
 * 
 * 2. Use a while loop controlled by a String again = "y". Inside the loop,
 * perform exactly one calculation and then set again = "n" so the loop ends
 * after the first run.
 * 
 * 3. Use if-else statements to handle the operator: +, -, *, /.
 * 4. For division, if num2 is 0, print Cannot divide by zero. and do not
 * perform the division.
 * 
 * 5. Print the result using the exact format: `Result: <value>`
 * 
 * 6. After the loop ends, print a closing message: `Thank you for using the
 * calculator.`
 * 
 * What this reinforces
 * 1. Variable initialization
 * 2. Arithmetic operators
 * 3. Conditional logic with if-else
 * 4. Loop control via a flag (again)
 * 5. Defensive check for division by zero
 * 
 * Expected Output (with your current values)
 * Result: 10.0
 * Thank you for using the calculator.
 */

public class Exercise {
    public static void main(String[] args) {

        double num1 = 7;
        double num2 = 3;
        char operator = '+';
        String again = "y";

        while (again.equalsIgnoreCase("y")) {
            if (operator == '+') {
                System.out.println("Result: " + (num1 + num2));
            } else if (operator == '-') {
                System.out.println("Result: " + (num1 - num2));
            } else if (operator == '*') {
                System.out.println("Result: " + (num1 * num2));
            } else if (operator == '/') {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }
            } else {
                System.out.println("Invalid operator.");
            }

            again = "n";
        }

        System.out.println("Thank you for using the calculator.");
    }
}