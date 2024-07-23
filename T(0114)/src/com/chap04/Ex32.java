package com.chap04;

import javax.swing.JFrame;

class FrameDemo extends JFrame{
	
	public FrameDemo() {
		setTitle("간닫한 gui 프로그램");
		setSize(200, 100);
		setLocation(50, 50);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}
public class Ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//JFrame frame = new JFrame();
		//frame.setVisible(true);
		
		FrameDemo f = new FrameDemo();
		f.setVisible(true);

	}

}
