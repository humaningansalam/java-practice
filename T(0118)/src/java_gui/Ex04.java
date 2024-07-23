package java_gui;

import java.awt.*;
import javax.swing.JFrame;

public class Ex04 extends JFrame{
	
	public Ex04(String str) {
		super(str);
		setLayout(new FlowLayout());
		Label lbl1 = new Label("아이디 입력:");
		Label lbl2 = new Label("비밀번호 입력:");
		TextField txt1 = new TextField("", 20);
		TextField txt2 = new TextField(20);
		txt2.setEchoChar('*');
		add(lbl1);
		add(txt1);
		add(lbl2);
		add(txt2);
		
		setSize(200, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Ex04("TextField 예제");
	}

}
