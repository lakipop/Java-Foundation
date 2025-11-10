/**
 * NestedTryCatch - Nested Exception Handling
 * 
 * This program demonstrates:
 * - Nested try-catch blocks
 * - Inner try-catch blocks
 * - Outer try-catch blocks
 * - Exception handling at different levels
 * 
 * @author BICT Java Foundation Course
 * @version 1.0
 */
public class NestedTryCatch {
    public static void main(String[] args) {
        System.out.println("Program started...");
        
        // Outer try block
        try {
            System.out.println("\nOuter try block started");
            
            // Inner try block 1 - handling division by zero
            try {
                System.out.println("Inner try block 1: Going to divide by zero");
                int[] numbers = new int[5];
                numbers[5] = 2 / 0;  // This will throw ArithmeticException
                
            } catch (ArithmeticException e) {
                System.out.println("Inner catch 1: ArithmeticException caught!");
                System.out.println("Error: " + e.getMessage());
            }
            
            // Inner try block 2 - handling array index out of bounds
            try {
                System.out.println("\nInner try block 2: Accessing invalid array index");
                int[] numbers = new int[5];
                numbers[6] = 30;  // This will throw ArrayIndexOutOfBoundsException
                
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch 2: ArrayIndexOutOfBoundsException caught!");
                System.out.println("Error: " + e.getMessage());
            }
            
            System.out.println("\nOther statements in outer try block");
            
        } catch (Exception e) {
            // This catch will handle any exception in outer try block
            // that is not caught by inner catch blocks
            System.out.println("Outer catch: Unexpected exception!");
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("\nNormal program flow continues...");
        System.out.println("Program completed successfully!");
    }
}
