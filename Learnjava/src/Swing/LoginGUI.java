package Swing;

import javax.swing.*;
import java.awt.*;

public class LoginGUI extends JFrame {
    // Components
    private JLabel userLabel, passLabel;
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginButton;

    public LoginGUI() {
        // Frame setup
        setTitle("Login Form");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        // Components initialization
        userLabel = new JLabel("Username:");
        passLabel = new JLabel("Password:");
        userField = new JTextField();
        passField = new JPasswordField();
        loginButton = new JButton("Login");
        // Adding components to the frame
        add(userLabel);
        add(userField);
        add(passLabel);
        add(passField);
        add(new JLabel()); // Empty label for spacing
        add(loginButton);
    }

    public static void main(String[] args) {
        LoginGUI loginGUI = new LoginGUI();
        loginGUI.setVisible(true);
    }
}
