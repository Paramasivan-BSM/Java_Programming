package Swing;
import javax.swing.*;
import java.awt.*;

public class flowlayout{
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Button 4");
        JButton btn5 = new JButton("Button 5");
        JButton btn6 = new JButton("Button 5");
        JButton btn8 = new JButton("Button 1");
        JButton btn9 = new JButton("Button 2");
        JButton btn10 = new JButton("Button 3");
        JButton btn11= new JButton("Button 4");
        JButton btn12 = new JButton("Button 5");
        JButton btn13 = new JButton("Button 5");

        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btn8);
        panel.add(btn9);
        panel.add(btn10);
        panel.add(btn11);
        panel.add(btn12);
        panel.add(btn13);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}


