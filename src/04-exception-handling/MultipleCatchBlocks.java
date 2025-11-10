/**
 * MultipleCatchBlocks - Handling Different Exception Types
 * 
 * This program demonstrates:
 * - Multiple catch blocks for different exceptions
 * - Order of catch blocks matters
 * - Catching specific vs general exceptions
 * 
 * @author BICT Java Foundation Course
 * @version 1.0
 */
public class MultipleCatchBlocks {
    public static void main(String[] args) {
        System.out.println("--- Example 1: Multiple Exceptions ---");
        
        try {
            int[] numbers = new int[5];
            
            // This line will cause ArrayIndexOutOfBoundsException
            numbers[6] = 30;
            
            // This line won't execute because of the exception above
            numbers[5] = 2 / 0;  // Would cause ArithmeticException
            
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
            System.out.println("Division by zero is not allowed!");
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
            System.out.println("Array index out of bounds!");
            
        } catch (Exception e) {
            // Generic exception handler - catches any other exception
            System.out.println("General Exception caught: " + e.getMessage());
        }
        
        System.out.println("\n--- Example 2: ArithmeticException ---");
        
        try {
            int result = 10 / 0;  // Division by zero
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
            System.out.println("Error details: " + e.getMessage());
        }
        
        System.out.println("\nProgram completed successfully!");
    }
}
