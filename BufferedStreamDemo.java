import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferedStreamDemo {
    public static void main(String[] args) {
        System.out.println("Swati");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while (true) {
                System.out.print("Enter a line (type 'STOP' to exit): ");
                line = reader.readLine();
                if (line.equals("STOP")) {
                    break;
                }
                System.out.println("You entered: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
