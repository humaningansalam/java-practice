package java_gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex11 extends JFrame implements ActionListener {
	Label lbl_info;
	Button bt1, bt2;
	public Ex11(String str) {
		super(str);
		lbl_info = new Label("버튼을 눌러 주세요");
	    bt1 = new Button("<버튼");
	    bt2 = new Button(">버튼");
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
		Object obj = e.getSource(); //e.getSource() 메소드로 이벤트 위치 파악
		if((Button)obj == bt1) {
			lbl_info.setText("왼쪽버튼을 눌렀습니다.");
		}
		else {
			lbl_info.setText("오른쪽 버튼을 눌렀습니다.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Ex11("ActionEvent 예제");
	}

}
