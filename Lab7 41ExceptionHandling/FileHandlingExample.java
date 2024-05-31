//Write a Java program that attempts to open a file (e.g., "sample.txt") and handle the FileNotFoundException that may occur if the file does not exist.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandlingExample {
    
    public static void main(String[] args) {
        // Specify the file path (e.g., "sample.txt")
        String filePath = "sample.txt";

        try {
            File file = new File(filePath);

            if (file.exists()) {
                // File exists, attempt to open and read it
                Scanner scanner = new Scanner(file);

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    System.out.println(line);
                }

                scanner.close();
            } else {
                System.out.println("Error: File does not exist.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. " + e.getMessage());
        }
    }
}

    

