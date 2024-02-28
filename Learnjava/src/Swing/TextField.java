package Swing;

import java.awt.Dimension;

import javax.swing.*;

public class TextField {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Swing TextField Example");

        // Create a JTextField
        JTextField textField = new JTextField();
        
        // Set some initial text in the text field (optional)
        textField.setText("Type here...");

        // Add the text field to the frame
        frame.add(textField);

        // Set frame size and make it visible
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Set the preferred size of the text field
        textField.setPreferredSize(new Dimension(200, 30)); // width, height
    }
}
