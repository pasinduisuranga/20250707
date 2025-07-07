/**
 * ConditionalStatements.java - Demonstrates if-else statements and switch cases
 * Perfect for teaching decision-making in programming
 */
public class ConditionalStatements {
    public static void main(String[] args) {
        // If-else statements
        System.out.println("=== If-Else Statements ===");
        
        int score = 85;
        
        if (score >= 90) {
            System.out.println("Grade: A - Excellent!");
        } else if (score >= 80) {
            System.out.println("Grade: B - Good job!");
        } else if (score >= 70) {
            System.out.println("Grade: C - You can do better!");
        } else if (score >= 60) {
            System.out.println("Grade: D - Study harder!");
        } else {
            System.out.println("Grade: F - Need improvement!");
        }
        
        // Ternary operator
        System.out.println("\n=== Ternary Operator ===");
        int age = 18;
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age: " + age + " - Status: " + status);
        
        // Switch statement
        System.out.println("\n=== Switch Statement ===");
        int dayNumber = 3;
        String dayName;
        
        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        
        System.out.println("Day " + dayNumber + " is: " + dayName);
        
        // Nested if statements
        System.out.println("\n=== Nested If Statements ===");
        int temperature = 75;
        boolean isSunny = true;
        
        if (temperature > 70) {
            if (isSunny) {
                System.out.println("Perfect weather for outdoor activities!");
            } else {
                System.out.println("Warm but cloudy - good for indoor activities.");
            }
        } else {
            System.out.println("Too cold - stay inside!");
        }
    }
}
