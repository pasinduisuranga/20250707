/**
 * Methods.java - Demonstrates method creation and usage
 * Essential for understanding code organization and reusability
 */
public class Methods {
    
    // Method with no parameters and no return value
    public static void greetUser() {
        System.out.println("Hello! Welcome to Java programming!");
        System.out.println("This message comes from a method.");
    }
    
    // Method with parameters and return value
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }
    
    // Method with multiple parameters
    public static void displayPersonInfo(String name, int age, String city) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("---");
    }
    
    // Method that returns a String
    public static String getGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    
    // Method that works with arrays
    public static double calculateAverage(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        return (double) sum / numbers.length;
    }
    
    // Method with boolean return type
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    // Method that calls another method
    public static void processNumbers(int[] numbers) {
        System.out.println("Processing array of numbers:");
        
        for (int number : numbers) {
            System.out.print(number + " is ");
            if (isEven(number)) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
        
        System.out.println("Average: " + calculateAverage(numbers));
    }
    
    // Overloaded methods (same name, different parameters)
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    
    // Method with variable arguments (varargs)
    public static int findMax(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number is required");
        }
        
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        System.out.println("=== Method Demonstrations ===");
        
        // Calling a method with no parameters
        greetUser();
        
        // Calling a method with parameters and using return value
        System.out.println("\n=== Addition Method ===");
        int result = addNumbers(15, 25);
        System.out.println("15 + 25 = " + result);
        
        // Calling a method with multiple parameters
        System.out.println("\n=== Person Information ===");
        displayPersonInfo("Alice", 25, "New York");
        displayPersonInfo("Bob", 30, "Los Angeles");
        displayPersonInfo("Charlie", 22, "Chicago");
        
        // Using a method that returns a String
        System.out.println("\n=== Grade Calculator ===");
        int[] scores = {95, 87, 76, 63, 45};
        for (int score : scores) {
            String grade = getGrade(score);
            System.out.println("Score: " + score + " -> Grade: " + grade);
        }
        
        // Using methods with arrays
        System.out.println("\n=== Array Processing ===");
        int[] testNumbers = {12, 7, 23, 8, 15, 4, 19};
        processNumbers(testNumbers);
        
        // Demonstrating method overloading
        System.out.println("\n=== Method Overloading ===");
        System.out.println("multiply(5, 3) = " + multiply(5, 3));
        System.out.println("multiply(2.5, 4.0) = " + multiply(2.5, 4.0));
        System.out.println("multiply(2, 3, 4) = " + multiply(2, 3, 4));
        
        // Using variable arguments
        System.out.println("\n=== Variable Arguments ===");
        System.out.println("Max of (10, 5, 8, 12, 3): " + findMax(10, 5, 8, 12, 3));
        System.out.println("Max of (100, 200): " + findMax(100, 200));
        System.out.println("Max of (42): " + findMax(42));
        
        System.out.println("\n=== Method Benefits ===");
        System.out.println("✓ Code reusability");
        System.out.println("✓ Better organization");
        System.out.println("✓ Easier debugging");
        System.out.println("✓ Modular programming");
    }
}
