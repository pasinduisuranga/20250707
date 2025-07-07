/**
 * BasicOperations.java - Demonstrates arithmetic and logical operations
 * Shows how to perform calculations and comparisons in Java
 */
public class BasicOperations {
    public static void main(String[] args) {
        // Arithmetic Operations
        int a = 15;
        int b = 4;
        
        System.out.println("=== Arithmetic Operations ===");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Addition: " + a + " + " + b + " = " + (a + b));
        System.out.println("Subtraction: " + a + " - " + b + " = " + (a - b));
        System.out.println("Multiplication: " + a + " * " + b + " = " + (a * b));
        System.out.println("Division: " + a + " / " + b + " = " + (a / b));
        System.out.println("Remainder: " + a + " % " + b + " = " + (a % b));
        
        // Increment and Decrement
        System.out.println("\n=== Increment/Decrement ===");
        int counter = 10;
        System.out.println("Original counter: " + counter);
        System.out.println("Pre-increment: " + (++counter));
        System.out.println("Post-increment: " + (counter++));
        System.out.println("Final counter: " + counter);
        
        // Comparison Operations
        System.out.println("\n=== Comparison Operations ===");
        int x = 10;
        int y = 20;
        
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x <= y: " + (x <= y));
        System.out.println("x >= y: " + (x >= y));
        
        // Logical Operations
        System.out.println("\n=== Logical Operations ===");
        boolean isTrue = true;
        boolean isFalse = false;
        
        System.out.println("isTrue = " + isTrue + ", isFalse = " + isFalse);
        System.out.println("AND (&&): " + (isTrue && isFalse));
        System.out.println("OR (||): " + (isTrue || isFalse));
        System.out.println("NOT (!): " + (!isTrue));
    }
}
