import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SwingApplicationDemo {
    public static void main(String[] args) {
        System.out.println("Swati");
        JFrame frame = new JFrame("Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        JLabel nameLabel = new JLabel("Name:");
        frame.add(nameLabel);
        JTextField nameTextField = new JTextField(15);
        frame.add(nameTextField);
        JButton submitButton = new JButton("Submit");
        frame.add(submitButton);
        JLabel resultLabel = new JLabel();
        frame.add(resultLabel);
        JCheckBox checkBox = new JCheckBox("I agree to the terms");
        frame.add(checkBox);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                if (checkBox.isSelected()) {
                    resultLabel.setText("Submitted by: " + name);
                } else {
                    resultLabel.setText("Please agree to the terms.");
                }
            }
        });
        frame.setVisible(true);
    }
}
