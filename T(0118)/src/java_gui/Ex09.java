package java_gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Ex09 extends JFrame {

	
	public Ex09 (String str) {
		super(str);
		
		setLayout(new FlowLayout());
		Label lbl1 = new Label("���̵� �Է�:");
		TextField txt2 = new TextField(20);
		
		Label lbl2 = new Label("��̼���");
		Choice hobby = new Choice();
		hobby.add("������");
		hobby.add("����");
		hobby.add("����");
		
		Button bt1 = new Button("Ȯ��");
		
		add(lbl1);
		add(txt2);
		add(lbl2);
		add(hobby);
		add(bt1);
		setSize(300, 300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Ex09("���� ����");
	}

}
