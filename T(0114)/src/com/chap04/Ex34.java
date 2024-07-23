package com.chap04;

import java.awt.*;
import javax.swing.*;

public class Ex34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame fr = new JFrame("화면 구성");
		

		Container cont = fr.getContentPane();
		cont.setLayout(new FlowLayout());
		
		cont.add(new JButton("1"));
		cont.add(new JButton("2"));
		cont.add(new JButton("3"));
		cont.add(new JButton("4"));
		cont.add(new JButton("5"));
		
		fr.pack();
		fr.setVisible(true);
		
	}

}
