package Swing;

import javax.swing.*;

public class Txtarea {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Swing TextArea Example");

        // Create a JTextArea
        JTextArea textArea = new JTextArea();
        
        // Set some initial text in the text area (optional)
        textArea.setText("This is a JTextArea.\nYou can type text here.");

        // Add the text area to a JScrollPane for scrolling (optional)
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Add the scroll pane to the frame
        frame.add(scrollPane);

        // Set frame size and make it visible
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
