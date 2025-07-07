/**
 * Variables.java - Demonstrates different data types and variables
 * Great for teaching variable declaration and initialization
 */
public class Variables {
    public static void main(String[] args) {
        // Integer types
        int age = 25;
        long population = 8000000000L;
        
        // Floating-point types
        double price = 19.99;
        float temperature = 98.6f;
        
        // Character and String
        char grade = 'A';
        String name = "John Doe";
        
        // Boolean
        boolean isStudent = true;
        
        // Constants (final keyword)
        final double PI = 3.14159;
        
        // Display all variables
        System.out.println("=== Variable Examples ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Price: $" + price);
        System.out.println("Temperature: " + temperature + "°F");
        System.out.println("World Population: " + population);
        System.out.println("Value of PI: " + PI);
        
        // Variable modification
        age = age + 1;
        System.out.println("Age after birthday: " + age);
    }
}
