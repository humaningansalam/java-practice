package java_gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex11 extends JFrame implements ActionListener {
	Label lbl_info;
	Button bt1, bt2;
	public Ex11(String str) {
		super(str);
		lbl_info = new Label("��ư�� ���� �ּ���");
	    bt1 = new Button("<��ư");
	    bt2 = new Button(">��ư");
	    bt1.addActionListener(this);
	    bt2.addActionListener(this);
	    Panel panel = new Panel();
	    panel.add(bt1);
	    panel.add(bt2);
	    add("Center", panel);
	    add("South", lbl_info);
	    setSize(300, 200);
	    setVisible(true);
	    
	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource(); //e.getSource() �޼ҵ�� �̺�Ʈ ��ġ �ľ�
		if((Button)obj == bt1) {
			lbl_info.setText("���ʹ�ư�� �������ϴ�.");
		}
		else {
			lbl_info.setText("������ ��ư�� �������ϴ�.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Ex11("ActionEvent ����");
	}

}
