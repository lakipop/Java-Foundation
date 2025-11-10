/**
 * IfElseDemo - Conditional Statements in Java
 * 
 * This program demonstrates:
 * - If-else statements
 * - Nested if-else
 * - else-if ladder
 * - Comparison operators
 * - Logical operators
 * 
 * @author BICT Java Foundation Course
 * @version 1.0
 */
public class IfElseDemo {
    public static void main(String[] args) {
        System.out.println("=== If-Else Statement Demo ===\n");
        
        // Example 1: Simple if-else
        int age = 20;
        System.out.println("Example 1: Simple If-Else");
        System.out.println("Age: " + age);
        
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
        
        // Example 2: else-if ladder
        int marks = 85;
        System.out.println("\nExample 2: Else-If Ladder");
        System.out.println("Marks: " + marks);
        
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F (Failed)");
        }
        
        // Example 3: Nested if-else
        int number = 15;
        System.out.println("\nExample 3: Nested If-Else");
        System.out.println("Number: " + number);
        
        if (number > 0) {
            System.out.println("Number is positive");
            
            if (number % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
        
        // Example 4: Logical operators (AND, OR, NOT)
        boolean hasTicket = true;
        boolean isVIP = false;
        
        System.out.println("\nExample 4: Logical Operators");
        System.out.println("Has Ticket: " + hasTicket);
        System.out.println("Is VIP: " + isVIP);
        
        if (hasTicket && isVIP) {
            System.out.println("Enter through VIP gate");
        } else if (hasTicket && !isVIP) {
            System.out.println("Enter through regular gate");
        } else {
            System.out.println("Cannot enter - no ticket");
        }
        
        // Example 5: Checking ranges
        int temperature = 25;
        System.out.println("\nExample 5: Range Checking");
        System.out.println("Temperature: " + temperature + "°C");
        
        if (temperature < 0) {
            System.out.println("Freezing!");
        } else if (temperature >= 0 && temperature < 15) {
            System.out.println("Cold");
        } else if (temperature >= 15 && temperature < 25) {
            System.out.println("Pleasant");
        } else if (temperature >= 25 && temperature < 35) {
            System.out.println("Warm");
        } else {
            System.out.println("Hot!");
        }
    }
}
