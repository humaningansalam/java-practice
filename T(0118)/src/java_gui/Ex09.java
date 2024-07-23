package java_gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Ex09 extends JFrame {

	
	public Ex09 (String str) {
		super(str);
		
		setLayout(new FlowLayout());
		Label lbl1 = new Label("아이디 입력:");
		TextField txt2 = new TextField(20);
		
		Label lbl2 = new Label("취미선택");
		Choice hobby = new Choice();
		hobby.add("스포츠");
		hobby.add("독서");
		hobby.add("여행");
		
		Button bt1 = new Button("확인");
		
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

		new Ex09("개인 정보");
	}

}
