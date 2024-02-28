package Swing;

import javax.swing.*;

public class label {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Swing Label Example");
        
        // Create a JLabel with text
        JLabel label = new JLabel("Hello, World!");
        
        // Set the position of the label using absolute positioning
        label.setBounds(100, 50, 200, 30); // (x, y, width, height)
        
        // Add the label to the frame
        frame.add(label);
        
        // Set frame size and make it visible
        frame.setSize(400, 200);
        frame.setLayout(null); // Use null layout for absolute positioning
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

