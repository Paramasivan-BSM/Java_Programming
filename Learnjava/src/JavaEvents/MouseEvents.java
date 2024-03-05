package JavaEvents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEvents extends JFrame implements MouseListener {
    private JLabel label; // Label to display mouse events

    public MouseEvents() {
        setTitle("Mouse Event Demo");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create a label
        label = new JLabel("No mouse event yet", JLabel.CENTER);

        // Add mouse listener to the label
        label.addMouseListener(this);

        getContentPane().add(label, BorderLayout.CENTER);

        setVisible(true);
    }

    // Implement mouse listener methods
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked");
    }

    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed ");
    }

    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released ");
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited");
    }

    public static void main(String[] args) {
        new MouseEvents();
    }
}
