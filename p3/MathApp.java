import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MathApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Math Operations");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel resultLabel = new JLabel("Result: ");
        JTextField num1Field = new JTextField(10);
        JTextField num2Field = new JTextField(10);
        JButton addButton = new JButton("Add");
        JButton subtractButton = new JButton("Subtract");

        panel.add(new JLabel("Number 1:"));
        panel.add(num1Field);
        panel.add(new JLabel("Number 2:"));
        panel.add(num2Field);
        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(resultLabel);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double result = MathOperation.add(num1, num2);
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input.");
                }
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double result = MathOperation.subtract(num1, num2);
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input.");
                }
            }
        });

        frame.setVisible(true);
    }
}
