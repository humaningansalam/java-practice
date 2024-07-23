package java_gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Ex07 extends JFrame implements ActionListener{
	
	public Ex07(String title) {
		super(title);
		Button btn = new Button("버튼");
		btn.addActionListener(this);
		add(btn);
		setSize(300, 200);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("**이벤트 발생정보**");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Ex07("이벤트 첫 번째 예제");

	}

}
