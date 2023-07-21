import java.awt.*;
import java.awt.event.*;
public class EventHandlingDemo {
    private static Label label;
    public static void main(String[] args) {
        System.out.println("Swati");
        Frame frame = new Frame("Event Handling Demo");
        Button button = new Button("Click me!");
        label = new Label("No event yet");
        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!");
            }
        };
        button.addActionListener(listener);
        frame.add(button, BorderLayout.CENTER);
        frame.add(label, BorderLayout.SOUTH);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
