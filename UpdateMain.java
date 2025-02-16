import java.io.*;
import java.nio.file.*;

public class UpdateMain {
    public static void main(String[] args) {
        try {
            // Path to the main.java file
            Path mainFilePath = Paths.get("D:/Learning/main.java");

            // Read the content of the main.java file
            String content = new String(Files.readAllBytes(mainFilePath));

            // Replace the username placeholder in main.java
            content = content.replaceAll("username_placeholder", "new_username");

            // Write the updated content back to main.java
            Files.write(mainFilePath, content.getBytes());

            System.out.println("Username updated successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
