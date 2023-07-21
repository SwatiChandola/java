import java.io.FileInputStream;
import java.io.IOException;
public class prog2 {
    public static void main(String[] args) {
        System.out.println("Swati");
        try (FileInputStream inputStream = new FileInputStream("example.txt")) {
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
