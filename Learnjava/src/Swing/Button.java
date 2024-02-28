package Swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame();
		frame.setVisible(true);
		JButton B=new JButton("Click Here!");
		//JButton B=new JButton(new ImageIcon("clit it","C:\\custom.png");// to Setting A img as Button
		B.setPreferredSize(new Dimension(100,30));
		frame.add(B);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		frame.setTitle("JSwing_BUTTON");// Setting a Title of Frame
		frame.setResizable(false);// To controlling Frame Resize
		frame.getContentPane().setBackground(new Color(0,0,0));	// To Change A Frame BG	
		
		

	}

}
