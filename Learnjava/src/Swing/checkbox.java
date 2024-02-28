package Swing;

import javax.swing.*;

public class checkbox {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Swing CheckBox Example");
        frame.setSize(250, 250);

        // Create a JCheckBox
        JCheckBox checkBox = new JCheckBox("Check Me");
        
        // Set the initial state of the checkbox (optional)
        checkBox.setSelected(true); // Check the checkbox by default

        // Add the checkbox to the frame
        frame.add(checkBox);

        // Set frame size and make it visible
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setBounds(300, 300, 200, 30); // (x, y, width, height)
    }
}
