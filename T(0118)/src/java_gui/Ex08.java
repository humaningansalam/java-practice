package java_gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Ex08 extends JFrame implements KeyListener{
	
	public Ex08(String str) {
		super(str);
		addKeyListener(this);
		setSize(300, 300);
		setVisible(true);
	}

	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyChar() + "Ű ��ư�� ���������ϴ�.");
		//e.getKeyChar() �� ���� ������ Ű���� �о��
	}
	
	public void keyReleased(KeyEvent e) {
		System.out.println(e.getKeyChar() + "Ű ��ư�� �ö󰬽��ϴ�.");
		//e.getKeyChar() �� ���� ������ Ű���� �о��
	}
	
	
	public void keyTyped(KeyEvent e) {
		System.out.println(e.getKeyChar() + "Ű ��ư");
		//e.getKeyChar() �� ���� ������ Ű���� �о��
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex08("Ű �̺�Ʈ ����");

	}

}
