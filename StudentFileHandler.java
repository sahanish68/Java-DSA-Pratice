import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class StudentFileHandler {

    public static void main(String[] args) {
        // 1. Define the file path (relative to your project folder)
        Path filePath = Path.of("students.txt");

        // 2. Define the student data to be written
        String studentData = "ID: 101, Name: Rahul Sharma, Course: Computer Science\n";

        try {
            // 3. Check if the file already exists
            if (Files.notExists(filePath)) {
                // Create the file explicitly if it doesn't exist
                Files.createFile(filePath);
                System.out.println("File created successfully: " + filePath.toAbsolutePath());
            } else {
                System.out.println("File already exists. Appending data...");
            }

            // 4. Open the file in APPEND mode so it doesn't overwrite old data
            try (BufferedWriter writer = Files.newBufferedWriter(filePath, StandardOpenOption.APPEND)) {
                writer.write(studentData);
                System.out.println("Student data added successfully!");
            }

        } catch (IOException e) {
            System.err.println("An error occurred during file operations: " + e.getMessage());
        }
    }
}
