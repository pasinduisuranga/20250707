/**
 * Loops.java - Demonstrates different types of loops in Java
 * Great for teaching repetitive tasks and iteration
 */
public class Loops {
    public static void main(String[] args) {
        // For loop
        System.out.println("=== For Loop ===");
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
        
        // While loop
        System.out.println("\n=== While Loop ===");
        System.out.println("Countdown from 5:");
        int countdown = 5;
        while (countdown > 0) {
            System.out.println("Countdown: " + countdown);
            countdown--;
        }
        System.out.println("Blast off! 🚀");
        
        // Do-while loop
        System.out.println("\n=== Do-While Loop ===");
        System.out.println("Guessing game simulation:");
        int guess = 1;
        int secretNumber = 7;
        do {
            System.out.println("Guessing: " + guess);
            if (guess == secretNumber) {
                System.out.println("Correct! The number was " + secretNumber);
                break;
            }
            guess++;
        } while (guess <= 10);
        
        // Enhanced for loop (for arrays)
        System.out.println("\n=== Enhanced For Loop ===");
        String[] fruits = {"Apple", "Banana", "Orange", "Grape", "Mango"};
        System.out.println("My favorite fruits:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
        
        // Nested loops
        System.out.println("\n=== Nested Loops ===");
        System.out.println("Multiplication table (1-5):");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println(); // New line after each row
        }
        
        // Loop with break and continue
        System.out.println("\n=== Break and Continue ===");
        System.out.println("Numbers 1-10, skipping 5, stopping at 8:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Skipping " + i);
                continue; // Skip the rest of this iteration
            }
            if (i == 8) {
                System.out.println("Breaking at " + i);
                break; // Exit the loop
            }
            System.out.println("Number: " + i);
        }
    }
}
