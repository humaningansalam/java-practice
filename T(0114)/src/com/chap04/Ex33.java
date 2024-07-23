package com.chap04;

import java.awt.*;
import javax.swing.*;

public class Ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("패널 포함 프레임");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    JPanel panel = new JPanel();

	    panel.setBackground(Color.green);
	    panel.setPreferredSize(new Dimension(200, 100));
	    
	    frame.getContentPane().add(panel);
	    frame.pack();
	    frame.setVisible(true);
	}

}
