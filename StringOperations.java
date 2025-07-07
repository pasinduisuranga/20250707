/**
 * StringOperations.java - Demonstrates String manipulation in Java
 * Important for text processing and user input handling
 */
public class StringOperations {
    public static void main(String[] args) {
        // String creation
        System.out.println("=== String Creation ===");
        String str1 = "Hello, World!";
        String str2 = new String("Java Programming");
        String str3 = "";
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: '" + str3 + "'");
        
        // String length and basic properties
        System.out.println("\n=== String Properties ===");
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Is str3 empty? " + str3.isEmpty());
        System.out.println("Is str1 empty? " + str1.isEmpty());
        
        // String comparison
        System.out.println("\n=== String Comparison ===");
        String name1 = "Alice";
        String name2 = "alice";
        String name3 = "Alice";
        
        System.out.println("name1.equals(name2): " + name1.equals(name2));
        System.out.println("name1.equals(name3): " + name1.equals(name3));
        System.out.println("name1.equalsIgnoreCase(name2): " + name1.equalsIgnoreCase(name2));
        System.out.println("name1.compareTo(name2): " + name1.compareTo(name2));
        
        // String methods
        System.out.println("\n=== String Methods ===");
        String sentence = "  Java is a powerful programming language  ";
        
        System.out.println("Original: '" + sentence + "'");
        System.out.println("Trimmed: '" + sentence.trim() + "'");
        System.out.println("Upper case: " + sentence.toUpperCase());
        System.out.println("Lower case: " + sentence.toLowerCase());
        
        // Character access
        System.out.println("\n=== Character Access ===");
        String word = "Programming";
        System.out.println("Word: " + word);
        System.out.println("First character: " + word.charAt(0));
        System.out.println("Last character: " + word.charAt(word.length() - 1));
        System.out.println("Character at index 5: " + word.charAt(5));
        
        // Substring operations
        System.out.println("\n=== Substring Operations ===");
        String fullName = "John Doe Smith";
        System.out.println("Full name: " + fullName);
        System.out.println("First 4 characters: " + fullName.substring(0, 4));
        System.out.println("From index 5: " + fullName.substring(5));
        System.out.println("Middle part: " + fullName.substring(5, 8));
        
        // String searching
        System.out.println("\n=== String Searching ===");
        String text = "Java programming is fun and Java is powerful";
        System.out.println("Text: " + text);
        System.out.println("Contains 'Java': " + text.contains("Java"));
        System.out.println("Contains 'Python': " + text.contains("Python"));
        System.out.println("Starts with 'Java': " + text.startsWith("Java"));
        System.out.println("Ends with 'powerful': " + text.endsWith("powerful"));
        System.out.println("Index of 'programming': " + text.indexOf("programming"));
        System.out.println("Index of 'Java': " + text.indexOf("Java"));
        System.out.println("Last index of 'Java': " + text.lastIndexOf("Java"));
        
        // String replacement
        System.out.println("\n=== String Replacement ===");
        String message = "I love Python programming";
        System.out.println("Original: " + message);
        System.out.println("Replace Python with Java: " + message.replace("Python", "Java"));
        System.out.println("Replace all 'a' with '@': " + message.replace('a', '@'));
        
        // String splitting
        System.out.println("\n=== String Splitting ===");
        String fruits = "apple,banana,orange,grape,mango";
        System.out.println("Fruits string: " + fruits);
        String[] fruitArray = fruits.split(",");
        System.out.println("Split into array:");
        for (int i = 0; i < fruitArray.length; i++) {
            System.out.println((i + 1) + ". " + fruitArray[i]);
        }
        
        // String concatenation
        System.out.println("\n=== String Concatenation ===");
        String firstName = "John";
        String lastName = "Doe";
        int age = 25;
        
        // Using + operator
        String info1 = firstName + " " + lastName + " is " + age + " years old";
        System.out.println("Using + operator: " + info1);
        
        // Using concat method
        String info2 = firstName.concat(" ").concat(lastName).concat(" is awesome!");
        System.out.println("Using concat(): " + info2);
        
        // Using String.format
        String info3 = String.format("%s %s is %d years old", firstName, lastName, age);
        System.out.println("Using String.format(): " + info3);
        
        // StringBuilder for efficient concatenation
        System.out.println("\n=== StringBuilder ===");
        StringBuilder sb = new StringBuilder();
        sb.append("Building a string ");
        sb.append("piece by piece. ");
        sb.append("Current year: ");
        sb.append(2025);
        
        String result = sb.toString();
        System.out.println("StringBuilder result: " + result);
        
        // String validation examples
        System.out.println("\n=== String Validation ===");
        String email = "user@example.com";
        String phone = "123-456-7890";
        String emptyString = "";
        String nullString = null;
        
        System.out.println("Email contains '@': " + email.contains("@"));
        System.out.println("Phone matches pattern: " + phone.matches("\\d{3}-\\d{3}-\\d{4}"));
        
        // Safe string operations (avoiding NullPointerException)
        System.out.println("Empty string is null or empty: " + (emptyString == null || emptyString.isEmpty()));
        System.out.println("Null string is null or empty: " + (nullString == null || nullString.isEmpty()));
        
        // Escape sequences
        System.out.println("\n=== Escape Sequences ===");
        System.out.println("Quote: \"Hello, World!\"");
        System.out.println("New line:\nThis is on a new line");
        System.out.println("Tab:\tThis is tabbed");
        System.out.println("Backslash: \\");
    }
}
