package java_gui;

import java.awt.*;
import javax.swing.JFrame;

public class Ex06 extends JFrame{
	
	public Ex06(String str) {
		super(str);
		Panel panel1 = new Panel();
		panel1.add(new Button("�г�1 ���� ��ư"));
		panel1.add(new Checkbox("üũ�ڽ�"));
		Panel panel2 = new Panel();
		panel2.add(new Label("��"));
		panel2.add(new Button("�г�2 ���� ��ư"));
		add("North", panel1);
		add("Center", new Button("��ư"));
		add("South", panel2);
		

		setSize(200, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Ex06("����");

	}

}
