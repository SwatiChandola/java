import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
public class RGBColorCombinationDemo {
    private static int redValue = 0;
    private static int greenValue = 0;
    private static int blueValue = 0;
    public static void main(String[] args) {
        System.out.println("Swati");
        JFrame frame = new JFrame("RGB Color Combination");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());
        JLabel label = new JLabel("RGB Color Combination");
        label.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(label);
        JPanel colorPanel = new JPanel();
        colorPanel.setPreferredSize(new Dimension(200, 100));
        frame.add(colorPanel);
        JScrollBar redScrollbar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 10, 0, 255);
        redScrollbar.setPreferredSize(new Dimension(200, 20));
        frame.add(redScrollbar);
        JScrollBar greenScrollbar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 10, 0, 255);
        greenScrollbar.setPreferredSize(new Dimension(200, 20));
        frame.add(greenScrollbar);
        JScrollBar blueScrollbar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 10, 0, 255);
        blueScrollbar.setPreferredSize(new Dimension(200, 20));
        frame.add(blueScrollbar);
        frame.setVisible(true);
        redScrollbar.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                redValue = redScrollbar.getValue();
                colorPanel.setBackground(new Color(redValue, greenValue, blueValue));
            }
        });
        greenScrollbar.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                greenValue = greenScrollbar.getValue();
                colorPanel.setBackground(new Color(redValue, greenValue, blueValue));
            }
        });
        blueScrollbar.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                blueValue = blueScrollbar.getValue();
                colorPanel.setBackground(new Color(redValue, greenValue, blueValue));
            }
        });
    }
}

