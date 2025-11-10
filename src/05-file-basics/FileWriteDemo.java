import java.io.*;

/**
 * FileWriteDemo - Writing to Files in Java
 * 
 * This program demonstrates:
 * - Writing text to files using FileWriter
 * - Writing text using BufferedWriter
 * - Appending to existing files
 * - Writing multiple lines
 * - Proper resource management (try-with-resources)
 * 
 * @author BICT Java Foundation Course
 * @version 1.0
 */
public class FileWriteDemo {
    public static void main(String[] args) {
        System.out.println("=== File Writing Demo ===\n");
        
        // Define file paths (using user's home directory)
        String userHome = System.getProperty("user.home");
        String filePath1 = userHome + File.separator + "demo_output.txt";
        String filePath2 = userHome + File.separator + "student_records.txt";
        
        // Example 1: Simple file writing with FileWriter
        System.out.println("Example 1: Writing to file using FileWriter");
        try (FileWriter writer = new FileWriter(filePath1)) {
            writer.write("Hello, this is a test file!\n");
            writer.write("Learning Java file I/O operations.\n");
            writer.write("File created successfully!\n");
            System.out.println("✓ File written successfully: " + filePath1);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        
        // Example 2: Writing using BufferedWriter (more efficient)
        System.out.println("\nExample 2: Writing with BufferedWriter");
        try (BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(filePath1, false))) {  // false = overwrite
            
            bufferedWriter.write("=== Java Programming Notes ===");
            bufferedWriter.newLine();
            bufferedWriter.write("1. Java is object-oriented");
            bufferedWriter.newLine();
            bufferedWriter.write("2. Java is platform-independent");
            bufferedWriter.newLine();
            bufferedWriter.write("3. Java is robust and secure");
            bufferedWriter.newLine();
            
            System.out.println("✓ File written with BufferedWriter");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Example 3: Appending to existing file
        System.out.println("\nExample 3: Appending to existing file");
        try (FileWriter writer = new FileWriter(filePath1, true)) {  // true = append
            writer.write("\n--- Additional Information ---\n");
            writer.write("Date: 2024\n");
            writer.write("Course: BICT Java Foundation\n");
            System.out.println("✓ Content appended successfully");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Example 4: Writing structured data
        System.out.println("\nExample 4: Writing student records");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath2))) {
            // Write header
            writer.write("=== Student Records ===");
            writer.newLine();
            writer.write("ID\tName\t\tAge\tGPA");
            writer.newLine();
            writer.write("-".repeat(50));
            writer.newLine();
            
            // Write student data
            String[][] students = {
                {"S001", "John Doe", "20", "3.75"},
                {"S002", "Jane Smith", "19", "3.90"},
                {"S003", "Bob Johnson", "21", "3.60"},
                {"S004", "Alice Brown", "20", "3.85"}
            };
            
            for (String[] student : students) {
                writer.write(student[0] + "\t" + student[1] + "\t" + 
                           student[2] + "\t" + student[3]);
                writer.newLine();
            }
            
            System.out.println("✓ Student records written: " + filePath2);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Example 5: Writing with error handling
        System.out.println("\nExample 5: Writing with comprehensive error handling");
        String outputFile = userHome + File.separator + "summary.txt";
        
        try {
            // Check if directory is writable
            File directory = new File(userHome);
            if (!directory.canWrite()) {
                throw new IOException("Directory is not writable!");
            }
            
            // Write file
            try (PrintWriter printWriter = new PrintWriter(new FileWriter(outputFile))) {
                printWriter.println("=== Java File I/O Summary ===");
                printWriter.println();
                printWriter.printf("%-20s: %s%n", "Date", "2024");
                printWriter.printf("%-20s: %s%n", "Topic", "File Writing");
                printWriter.printf("%-20s: %s%n", "Files Created", "3");
                printWriter.println();
                printWriter.println("All operations completed successfully!");
                
                System.out.println("✓ Summary file created: " + outputFile);
            }
        } catch (IOException e) {
            System.out.println("Error creating summary: " + e.getMessage());
        }
        
        // Display completion message
        System.out.println("\n" + "=".repeat(50));
        System.out.println("File writing operations completed!");
        System.out.println("Files created in: " + userHome);
        System.out.println("- demo_output.txt");
        System.out.println("- student_records.txt");
        System.out.println("- summary.txt");
    }
}
