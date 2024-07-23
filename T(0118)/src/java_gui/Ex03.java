package java_gui;

import java.awt.FlowLayout;
import java.awt.List;

import javax.swing.JFrame;

public class Ex03 extends JFrame {
	
	public Ex03(String str) {
		super(str);
		setLayout(new FlowLayout());
		List list = new List(3, false);
		
		list.add("¥Î«—πŒ±π1");
		list.add("¥Î«—πŒ±π2");
		list.add("¥Î«—πŒ±π3");
		list.add("¥Î«—πŒ±π4");
		list.add("¥Î«—πŒ±π5");
		
		add(list);
		
		setSize(200, 200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Ex03("ex03 øπ¿Á");

	}

}
