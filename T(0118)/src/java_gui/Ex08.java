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
		System.out.println(e.getKeyChar() + "키 버튼이 내려갔습니다.");
		//e.getKeyChar() 로 현재 눌려진 키값을 읽어옴
	}
	
	public void keyReleased(KeyEvent e) {
		System.out.println(e.getKeyChar() + "키 버튼이 올라갔습니다.");
		//e.getKeyChar() 로 현재 눌려진 키값을 읽어옴
	}
	
	
	public void keyTyped(KeyEvent e) {
		System.out.println(e.getKeyChar() + "키 버튼");
		//e.getKeyChar() 로 현재 눌려진 키값을 읽어옴
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex08("키 이벤트 예제");

	}

}
