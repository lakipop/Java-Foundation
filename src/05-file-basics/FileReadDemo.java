import java.io.*;

/**
 * FileReadDemo - Reading from Files in Java
 * 
 * This program demonstrates:
 * - Reading text files using FileReader
 * - Reading with BufferedReader
 * - Reading line by line
 * - Reading character by character
 * - Checking file existence
 * 
 * @author BICT Java Foundation Course
 * @version 1.0
 */
public class FileReadDemo {
    public static void main(String[] args) {
        System.out.println("=== File Reading Demo ===\n");
        
        // Define file paths
        String userHome = System.getProperty("user.home");
        String filePath = userHome + File.separator + "demo_output.txt";
        
        // Example 1: Check if file exists
        System.out.println("Example 1: Checking file existence");
        File file = new File(filePath);
        if (file.exists()) {
            System.out.println("✓ File exists: " + filePath);
            System.out.println("  File size: " + file.length() + " bytes");
            System.out.println("  Can read: " + file.canRead());
            System.out.println("  Can write: " + file.canWrite());
        } else {
            System.out.println("✗ File does not exist!");
            System.out.println("  Please run FileWriteDemo first to create the file.");
            return;
        }
        
        // Example 2: Reading with BufferedReader (line by line)
        System.out.println("\nExample 2: Reading file line by line");
        System.out.println("-".repeat(50));
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 1;
            
            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
            System.out.println("-".repeat(50));
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        
        // Example 3: Reading entire file content
        System.out.println("\nExample 3: Reading entire file content");
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder content = new StringBuilder();
            String line;
            
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            
            System.out.println("Total characters read: " + content.length());
            System.out.println("\nFile content:");
            System.out.println("=".repeat(50));
            System.out.println(content.toString());
            System.out.println("=".repeat(50));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Example 4: Reading character by character
        System.out.println("\nExample 4: Reading character by character");
        try (FileReader reader = new FileReader(filePath)) {
            int character;
            int charCount = 0;
            int lineCount = 1;
            
            System.out.print("First 100 characters: ");
            while ((character = reader.read()) != -1 && charCount < 100) {
                System.out.print((char) character);
                if (character == '\n') {
                    lineCount++;
                }
                charCount++;
            }
            System.out.println("\n\nCharacters read: " + charCount);
            System.out.println("Lines encountered: " + lineCount);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Example 5: Reading with error handling and statistics
        System.out.println("\nExample 5: File statistics");
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int lineCount = 0;
            int wordCount = 0;
            int charCount = 0;
            String line;
            
            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                
                // Count words (split by whitespace)
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }
            
            System.out.println("File Statistics:");
            System.out.println("  Lines: " + lineCount);
            System.out.println("  Words: " + wordCount);
            System.out.println("  Characters: " + charCount);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Example 6: Reading student records
        System.out.println("\nExample 6: Reading structured data");
        String studentFile = userHome + File.separator + "student_records.txt";
        File studFile = new File(studentFile);
        
        if (studFile.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(studentFile))) {
                String line;
                System.out.println("\nStudent Records:");
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("Error reading student file: " + e.getMessage());
            }
        } else {
            System.out.println("Student records file not found.");
            System.out.println("Run FileWriteDemo to create it first.");
        }
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("File reading operations completed!");
    }
}
