import java.util.Scanner;

/**
 * UserInputDemo - Getting Input from User
 * 
 * This program demonstrates:
 * - Using Scanner class for input
 * - Reading different data types
 * - Basic input validation
 * - String concatenation
 * 
 * @author BICT Java Foundation Course
 * @version 1.0
 */
public class UserInputDemo {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Reading String input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Reading integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Reading double input
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();
        
        // Display collected information
        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        
        // Close the scanner
        scanner.close();
        
        System.out.println("\nThank you for using the program!");
    }
}
