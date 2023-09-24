package Lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q1_21L5787 {
	
	public static void main(String[] args) {
		JFrame helloworld = new JFrame("Hello World");
		helloworld.setSize(300, 100);
		
		JPanel contentPanel = new JPanel();
		JButton clickme = new JButton("Click me");
		
		clickme.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent a) {
				JOptionPane.showMessageDialog(helloworld, "Hello Swing");
			}
		});
		
		contentPanel.add(clickme);
		helloworld.add(contentPanel);
		
		helloworld.setVisible(true);
		
	}
	
	public void gitfunc() {
		// amazing function i have added for github testing
	}
}
