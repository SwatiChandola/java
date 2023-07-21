import javax.swing.*;
import java.awt.*;
public class BorderLayoutDemo {
    public static void main(String[] args) {
        System.out.println("Swati");
        JFrame frame = new JFrame("BorderLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        JLabel northLabel = new JLabel("North", SwingConstants.CENTER);
        JLabel southLabel = new JLabel("South", SwingConstants.CENTER);
        JLabel eastLabel = new JLabel("East", SwingConstants.CENTER);
        JLabel westLabel = new JLabel("West", SwingConstants.CENTER);
        JLabel centerLabel = new JLabel("Center", SwingConstants.CENTER);
        frame.setLayout(new BorderLayout());
        frame.add(northLabel, BorderLayout.NORTH);
        frame.add(southLabel, BorderLayout.SOUTH);
        frame.add(eastLabel, BorderLayout.EAST);
        frame.add(westLabel, BorderLayout.WEST);
        frame.add(centerLabel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
