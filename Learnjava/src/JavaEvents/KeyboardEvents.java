package JavaEvents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyboardEvents extends JFrame implements KeyListener {
    private JTextField textField; // Text field to display keyboard events

    public KeyboardEvents() {
        setTitle("Keyboard Event Demo");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create a text field
        textField = new JTextField();
        textField.setEditable(false); // Make the text field read-only

        // Add key listener to the text field
        textField.addKeyListener(this);

        getContentPane().add(textField, BorderLayout.CENTER);

        setVisible(true);
    }

    // Implement key listener methods
    public void keyPressed(KeyEvent e) {
        textField.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    public void keyReleased(KeyEvent e) {
        textField.setText("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    public void keyTyped(KeyEvent e) {
        // This method is called when a key is typed (pressed and released)
        // We won't use it in this example
    }

    public static void main(String[] args) {
        new KeyboardEvents();
    }
}

