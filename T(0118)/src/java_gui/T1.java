package java_gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class T1 extends JFrame {
	
	public T1 (String str) {
		super(str);
		
		setLayout(new FlowLayout());
		Label lbl1 = new Label("���̵� �Է�:");
		TextField txt1 = new TextField("", 20);
		
		
		setSize(300, 300);
		setVisible(true);
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex08("�ǽ� 1");

	}

}
