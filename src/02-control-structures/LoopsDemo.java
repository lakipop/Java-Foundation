/**
 * LoopsDemo - Loop Structures in Java
 * 
 * This program demonstrates:
 * - for loop
 * - while loop
 * - do-while loop
 * - nested loops
 * - break and continue statements
 * 
 * @author BICT Java Foundation Course
 * @version 1.0
 */
public class LoopsDemo {
    public static void main(String[] args) {
        System.out.println("=== Loop Structures Demo ===\n");
        
        // Example 1: for loop
        System.out.println("Example 1: For Loop");
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        
        // Example 2: while loop
        System.out.println("Example 2: While Loop");
        System.out.println("Multiplication table of 5:");
        int count = 1;
        while (count <= 10) {
            System.out.println("5 x " + count + " = " + (5 * count));
            count++;
        }
        System.out.println();
        
        // Example 3: do-while loop
        System.out.println("Example 3: Do-While Loop");
        System.out.println("Factorial of 5:");
        int num = 5;
        int factorial = 1;
        int i = 1;
        do {
            factorial *= i;
            i++;
        } while (i <= num);
        System.out.println("5! = " + factorial);
        System.out.println();
        
        // Example 4: nested loops (pattern printing)
        System.out.println("Example 4: Nested Loops - Pattern");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        
        // Example 5: break statement
        System.out.println("Example 5: Break Statement");
        System.out.println("Finding first number divisible by both 3 and 5:");
        for (int n = 1; n <= 100; n++) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("Found: " + n);
                break; // Exit loop when found
            }
        }
        System.out.println();
        
        // Example 6: continue statement
        System.out.println("Example 6: Continue Statement");
        System.out.println("Numbers from 1 to 10, skipping multiples of 3:");
        for (int n = 1; n <= 10; n++) {
            if (n % 3 == 0) {
                continue; // Skip this iteration
            }
            System.out.print(n + " ");
        }
        System.out.println("\n");
        
        // Example 7: Enhanced for loop (array iteration)
        System.out.println("Example 7: Enhanced For Loop");
        String[] fruits = {"Apple", "Banana", "Orange", "Mango", "Grapes"};
        System.out.println("Fruits list:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
    }
}
