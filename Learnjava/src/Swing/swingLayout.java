package Swing;

import java.awt.*;

import javax.swing.*;

public class swingLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JButton btnNorth = new JButton("North");
        panel.add(btnNorth, BorderLayout.NORTH);

        JButton btnSouth = new JButton("South");
        panel.add(btnSouth, BorderLayout.SOUTH);

        JButton btnEast = new JButton("East");
        panel.add(btnEast, BorderLayout.EAST);

        JButton btnWest = new JButton("West");
        panel.add(btnWest, BorderLayout.WEST);

        JButton btnCenter = new JButton("Center");
        panel.add(btnCenter, BorderLayout.CENTER);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
