package java_gui;

import java.awt.FlowLayout;
import java.awt.List;

import javax.swing.JFrame;

public class Ex03 extends JFrame {
	
	public Ex03(String str) {
		super(str);
		setLayout(new FlowLayout());
		List list = new List(3, false);
		
		list.add("���ѹα�1");
		list.add("���ѹα�2");
		list.add("���ѹα�3");
		list.add("���ѹα�4");
		list.add("���ѹα�5");
		
		add(list);
		
		setSize(200, 200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Ex03("ex03 ����");

	}

}
