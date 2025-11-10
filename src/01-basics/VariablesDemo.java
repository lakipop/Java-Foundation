/**
 * VariablesDemo - Understanding Java Variables and Data Types
 * 
 * This program demonstrates:
 * - Primitive data types (int, double, boolean, char)
 * - Variable declaration and initialization
 * - Basic operators
 * - String type
 * 
 * @author BICT Java Foundation Course
 * @version 1.0
 */
public class VariablesDemo {
    public static void main(String[] args) {
        // Integer data type - whole numbers
        int age = 20;
        int year = 2025;
        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        
        // Double data type - decimal numbers
        double price = 99.99;
        double pi = 3.14159;
        System.out.println("Price: $" + price);
        System.out.println("Pi: " + pi);
        
        // Boolean data type - true or false
        boolean isStudent = true;
        boolean hasLicense = false;
        System.out.println("Is Student: " + isStudent);
        System.out.println("Has License: " + hasLicense);
        
        // Character data type - single character
        char grade = 'A';
        char initial = 'J';
        System.out.println("Grade: " + grade);
        System.out.println("Initial: " + initial);
        
        // String data type - text
        String name = "John Doe";
        String university = "University of Ruhuna";
        System.out.println("Name: " + name);
        System.out.println("University: " + university);
        
        // Arithmetic operations
        int num1 = 10;
        int num2 = 5;
        System.out.println("\nArithmetic Operations:");
        System.out.println("Addition: " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println("Division: " + num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println("Modulus: " + num1 + " % " + num2 + " = " + (num1 % num2));
    }
}
