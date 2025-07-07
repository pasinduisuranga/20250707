p/**
 * UserInput.java - Demonstrates user input handling with Scanner
 * Essential for interactive programs
 */
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Create Scanner object for reading input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== User Input Demo ===");
        System.out.println("This program will collect information about you!\n");
        
        // Reading different types of input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter your height in meters (e.g., 1.75): ");
        double height = scanner.nextDouble();
        
        // Clear the buffer after nextDouble()
        scanner.nextLine();
        
        System.out.print("Enter your favorite color: ");
        String favoriteColor = scanner.nextLine();
        
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        
        // Clear the buffer after nextBoolean()
        scanner.nextLine();
        
        // Display collected information
        System.out.println("\n=== Your Information ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        System.out.println("Favorite Color: " + favoriteColor);
        System.out.println("Student Status: " + (isStudent ? "Yes" : "No"));
        
        // Simple calculator example
        System.out.println("\n=== Simple Calculator ===");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter an operation (+, -, *, /): ");
        String operation = scanner.next();
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double result = 0;
        boolean validOperation = true;
        
        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operation!");
                validOperation = false;
        }
        
        if (validOperation) {
            System.out.println("Result: " + num1 + " " + operation + " " + num2 + " = " + result);
        }
        
        // Clear the buffer
        scanner.nextLine();
        
        // Menu-driven program example
        System.out.println("\n=== Grade Calculator ===");
        System.out.print("How many subjects do you have? ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        
        String[] subjects = new String[numSubjects];
        double[] grades = new double[numSubjects];
        
        // Input subjects and grades
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter subject " + (i + 1) + " name: ");
            subjects[i] = scanner.nextLine();
            
            System.out.print("Enter grade for " + subjects[i] + ": ");
            grades[i] = scanner.nextDouble();
            scanner.nextLine(); // Clear buffer
        }
        
        // Calculate and display results
        double totalGrades = 0;
        System.out.println("\n=== Your Grades ===");
        for (int i = 0; i < numSubjects; i++) {
            System.out.println(subjects[i] + ": " + grades[i]);
            totalGrades += grades[i];
        }
        
        double average = totalGrades / numSubjects;
        System.out.println("\nAverage Grade: " + String.format("%.2f", average));
        
        // Determine letter grade
        String letterGrade;
        if (average >= 90) {
            letterGrade = "A";
        } else if (average >= 80) {
            letterGrade = "B";
        } else if (average >= 70) {
            letterGrade = "C";
        } else if (average >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        
        System.out.println("Letter Grade: " + letterGrade);
        
        // Input validation example
        System.out.println("\n=== Number Guessing Game ===");
        int secretNumber = 42;
        int guess;
        int attempts = 0;
        boolean hasGuessed = false;
        
        System.out.println("I'm thinking of a number between 1 and 100!");
        
        while (!hasGuessed && attempts < 5) {
            System.out.print("Enter your guess (attempt " + (attempts + 1) + "/5): ");
            
            // Input validation
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                attempts++;
                
                if (guess == secretNumber) {
                    System.out.println("🎉 Congratulations! You guessed it in " + attempts + " attempts!");
                    hasGuessed = true;
                } else if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            } else {
                System.out.println("Please enter a valid number!");
                scanner.next(); // Clear invalid input
            }
        }
        
        if (!hasGuessed) {
            System.out.println("Game over! The number was " + secretNumber);
        }
        
        // Interactive menu
        scanner.nextLine(); // Clear buffer
        boolean continueProgram = true;
        
        while (continueProgram) {
            System.out.println("\n=== Interactive Menu ===");
            System.out.println("1. Display a greeting");
            System.out.println("2. Calculate circle area");
            System.out.println("3. Convert temperature");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer
            
            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String userName = scanner.nextLine();
                    System.out.println("Hello, " + userName + "! Nice to meet you!");
                    break;
                    
                case 2:
                    System.out.print("Enter circle radius: ");
                    double radius = scanner.nextDouble();
                    double area = Math.PI * radius * radius;
                    System.out.println("Circle area: " + String.format("%.2f", area));
                    break;
                    
                case 3:
                    System.out.print("Enter temperature in Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = (celsius * 9/5) + 32;
                    System.out.println(celsius + "°C = " + String.format("%.2f", fahrenheit) + "°F");
                    break;
                    
                case 4:
                    System.out.println("Thanks for using the program! Goodbye!");
                    continueProgram = false;
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please select 1-4.");
            }
        }
        
        // Close the scanner
        scanner.close();
        System.out.println("\nProgram ended successfully!");
    }
}
