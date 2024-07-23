package java_gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex02 extends Frame {
	
	public Ex02(String str) {
		super(str);
		setLayout(new FlowLayout());
		Label bb = new Label("국가를 선택하세요");
		Label aa = new Label("성별을 선택하세요");
		
		Choice choice = new Choice();
		choice.add("대한민국");
	    choice.add("미국");
	    choice.add("말레이시아");
	    choice.add("중국");
	    
	    Choice cc = new Choice();
	    cc.add("남자");
	    cc.add("여자");
	    
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
