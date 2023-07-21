import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingDemo {
    public static void main(String[] args) {
        System.out.println("Swati");
        File file = new File("nonexistent.txt");
        try {
            FileReader reader = new FileReader(file);
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while processing the file: " + e.getMessage());
        }
    }
}
