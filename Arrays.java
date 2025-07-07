/**
 * Arrays.java - Demonstrates arrays and array operations
 * Essential for understanding data collections in Java
 */
public class Arrays {
    public static void main(String[] args) {
        // Array declaration and initialization
        System.out.println("=== Array Basics ===");
        
        // Method 1: Declare then initialize
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        
        // Method 2: Declare and initialize at once
        String[] colors = {"Red", "Green", "Blue", "Yellow", "Purple"};
        
        // Method 3: Alternative syntax
        double prices[] = {9.99, 15.50, 23.75, 8.25, 12.00};
        
        // Displaying arrays
        System.out.println("Numbers array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
        
        System.out.println("\nColors array:");
        for (String color : colors) {
            System.out.println("Color: " + color);
        }
        
        System.out.println("\nPrices array:");
        for (double price : prices) {
            System.out.println("Price: $" + price);
        }
        
        // Array length and access
        System.out.println("\n=== Array Properties ===");
        System.out.println("Numbers array length: " + numbers.length);
        System.out.println("First number: " + numbers[0]);
        System.out.println("Last number: " + numbers[numbers.length - 1]);
        
        // Array operations
        System.out.println("\n=== Array Operations ===");
        
        // Finding maximum and minimum
        int max = numbers[0];
        int min = numbers[0];
        int sum = 0;
        
        for (int num : numbers) {
            if (num > max) max = num;
            if (num < min) min = num;
            sum += num;
        }
        
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("Sum of all numbers: " + sum);
        System.out.println("Average: " + (double)sum / numbers.length);
        
        // Searching in array
        System.out.println("\n=== Array Searching ===");
        String searchColor = "Blue";
        boolean found = false;
        int position = -1;
        
        for (int i = 0; i < colors.length; i++) {
            if (colors[i].equals(searchColor)) {
                found = true;
                position = i;
                break;
            }
        }
        
        if (found) {
            System.out.println(searchColor + " found at position: " + position);
        } else {
            System.out.println(searchColor + " not found in the array");
        }
        
        // 2D Array (Matrix)
        System.out.println("\n=== 2D Array (Matrix) ===");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("3x3 Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // Array copying
        System.out.println("\n=== Array Copying ===");
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray = new int[originalArray.length];
        
        // Manual copying
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }
        
        System.out.println("Original array:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nCopied array:");
        for (int num : copiedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
