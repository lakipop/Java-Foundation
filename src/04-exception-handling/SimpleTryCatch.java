/**
 * SimpleTryCatch - Basic Exception Handling
 * 
 * This program demonstrates:
 * - Try-catch block structure
 * - Handling ArrayIndexOutOfBoundsException
 * - Program flow after exception
 * 
 * @author BICT Java Foundation Course
 * @version 1.0
 */
public class SimpleTryCatch {
    public static void main(String[] args) {
        System.out.println("Program started...");
        
        try {
            // Creating an array with 2 elements (index 0 and 1)
            int[] numbers = new int[2];
            
            // Trying to access element at index 3 - this will cause exception
            System.out.println("Accessing element at index 3: " + numbers[3]);
            
            // This line won't execute if exception occurs
            System.out.println("This line won't be printed");
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("You tried to access an invalid array index!");
        }
        
        // Program continues normally after exception is handled
        System.out.println("Out of try-catch block");
        System.out.println("Program continues normally...");
    }
}
