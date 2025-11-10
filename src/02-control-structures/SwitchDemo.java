/**
 * SwitchDemo - Switch Statement in Java
 * 
 * This program demonstrates:
 * - switch statement with int
 * - switch statement with String
 * - switch with multiple cases
 * - default case
 * - switch expression (Java 12+)
 * 
 * @author BICT Java Foundation Course
 * @version 1.0
 */
public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("=== Switch Statement Demo ===\n");
        
        // Example 1: Switch with int
        int dayNumber = 3;
        System.out.println("Example 1: Switch with Integer");
        System.out.println("Day number: " + dayNumber);
        
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number!");
        }
        
        // Example 2: Switch with String
        String month = "March";
        System.out.println("\nExample 2: Switch with String");
        System.out.println("Month: " + month);
        
        switch (month) {
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println("This month has 31 days");
                break;
            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println("This month has 30 days");
                break;
            case "February":
                System.out.println("This month has 28 or 29 days");
                break;
            default:
                System.out.println("Invalid month name!");
        }
        
        // Example 3: Calculator using switch
        char operator = '+';
        double num1 = 10.5;
        double num2 = 5.2;
        double result;
        
        System.out.println("\nExample 3: Simple Calculator");
        System.out.println(num1 + " " + operator + " " + num2);
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }
        
        // Example 4: Grading system
        char grade = 'B';
        System.out.println("\nExample 4: Grade Description");
        System.out.println("Grade: " + grade);
        
        switch (grade) {
            case 'A':
                System.out.println("Excellent! Outstanding performance.");
                break;
            case 'B':
                System.out.println("Very Good! Above average performance.");
                break;
            case 'C':
                System.out.println("Good! Average performance.");
                break;
            case 'D':
                System.out.println("Satisfactory! Below average.");
                break;
            case 'F':
                System.out.println("Failed! Need to work harder.");
                break;
            default:
                System.out.println("Invalid grade!");
        }
        
        // Example 5: Season detector
        String currentMonth = "July";
        System.out.println("\nExample 5: Season Detector");
        System.out.println("Month: " + currentMonth);
        
        switch (currentMonth) {
            case "December":
            case "January":
            case "February":
                System.out.println("Season: Winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("Season: Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("Season: Summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("Season: Autumn");
                break;
            default:
                System.out.println("Invalid month!");
        }
    }
}
