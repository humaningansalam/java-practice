package java_gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex02 extends Frame {
	
	public Ex02(String str) {
		super(str);
		setLayout(new FlowLayout());
		Label bb = new Label("������ �����ϼ���");
		Label aa = new Label("������ �����ϼ���");
		
		Choice choice = new Choice();
		choice.add("���ѹα�");
	    choice.add("�̱�");
	    choice.add("�����̽þ�");
	    choice.add("�߱�");
	    
	    Choice cc = new Choice();
	    cc.add("����");
	    cc.add("����");
	    
	    add(aa);
	    add(cc);
	    add(bb);
	    add(choice);
	    setSize(200, 200);
	    setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
