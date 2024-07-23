package java_gui;

import java.awt.*;
import javax.swing.JFrame;

public class Ex06 extends JFrame{
	
	public Ex06(String str) {
		super(str);
		Panel panel1 = new Panel();
		panel1.add(new Button("패널1 위에 버튼"));
		panel1.add(new Checkbox("체크박스"));
		Panel panel2 = new Panel();
		panel2.add(new Label("라벨"));
		panel2.add(new Button("패널2 위에 버튼"));
		add("North", panel1);
		add("Center", new Button("버튼"));
		add("South", panel2);
		

		setSize(200, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Ex06("예제");

	}

}
