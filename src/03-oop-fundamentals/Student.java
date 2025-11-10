/**
 * Student - Simple Class Example
 * 
 * This class demonstrates:
 * - Class definition
 * - Instance variables (fields)
 * - Constructor
 * - Methods (getters, setters, display)
 * - Object creation
 * 
 * @author BICT Java Foundation Course
 * @version 1.0
 */
public class Student {
    // Instance variables (fields)
    private String name;
    private int age;
    private String studentId;
    private double gpa;
    
    /**
     * Default constructor
     */
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.studentId = "N/A";
        this.gpa = 0.0;
    }
    
    /**
     * Parameterized constructor
     * 
     * @param name Student's name
     * @param age Student's age
     * @param studentId Student's ID
     * @param gpa Student's GPA
     */
    public Student(String name, int age, String studentId, double gpa) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.gpa = gpa;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getStudentId() {
        return studentId;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
    
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA! Must be between 0.0 and 4.0");
        }
    }
    
    /**
     * Display student information
     */
    public void displayInfo() {
        System.out.println("=== Student Information ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
        System.out.println("GPA: " + gpa);
        System.out.println();
    }
    
    /**
     * Check if student is on honor roll (GPA >= 3.5)
     * 
     * @return true if on honor roll, false otherwise
     */
    public boolean isHonorRoll() {
        return gpa >= 3.5;
    }
    
    /**
     * Calculate scholarship eligibility
     * 
     * @return scholarship percentage (0-100)
     */
    public int getScholarshipPercentage() {
        if (gpa >= 3.8) {
            return 100;
        } else if (gpa >= 3.5) {
            return 75;
        } else if (gpa >= 3.0) {
            return 50;
        } else if (gpa >= 2.5) {
            return 25;
        } else {
            return 0;
        }
    }
    
    /**
     * Main method to test the Student class
     */
    public static void main(String[] args) {
        System.out.println("=== Student Class Demo ===\n");
        
        // Creating student using default constructor
        Student student1 = new Student();
        System.out.println("Student 1 (Default Constructor):");
        student1.displayInfo();
        
        // Creating student using parameterized constructor
        Student student2 = new Student("John Doe", 20, "BICT2023001", 3.75);
        System.out.println("Student 2 (Parameterized Constructor):");
        student2.displayInfo();
        
        // Using setter methods
        student1.setName("Jane Smith");
        student1.setAge(19);
        student1.setStudentId("BICT2023002");
        student1.setGpa(3.9);
        
        System.out.println("Student 1 (After Setting Values):");
        student1.displayInfo();
        
        // Using methods
        System.out.println("Student 2 Honor Roll Status:");
        if (student2.isHonorRoll()) {
            System.out.println(student2.getName() + " is on the honor roll!");
        } else {
            System.out.println(student2.getName() + " is not on the honor roll.");
        }
        
        System.out.println("\nScholarship Information:");
        System.out.println(student1.getName() + " - Scholarship: " + 
                          student1.getScholarshipPercentage() + "%");
        System.out.println(student2.getName() + " - Scholarship: " + 
                          student2.getScholarshipPercentage() + "%");
        
        // Testing validation
        System.out.println("\nTesting Validation:");
        student1.setAge(-5);  // Invalid age
        student1.setGpa(5.0);  // Invalid GPA
    }
}
