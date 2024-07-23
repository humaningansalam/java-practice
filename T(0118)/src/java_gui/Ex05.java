package java_gui;

import java.awt.*;
import javax.swing.JFrame;

public class Ex05 extends JFrame{
	
	Button btn[] = new Button[6];
	
	public Ex05(String str) {
		super(str);
		setLayout(new GridLayout(3,2));
		
		for(int i=0; i<btn.length; i++) {
			btn[i] = new Button(i + "번 버튼");
			add(btn[i]);
		}
		
		setSize(200, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Ex05("GridLayout 예제");
	}

}
