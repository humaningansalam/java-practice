package GuiEvent;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex01 extends JFrame{

	JCheckBox f1 = new JCheckBox("c��� 2000��");
	JLabel label;
	
	public Ex01() {
		setTitle("üũ�ڽ� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("���縦 �����Ͻÿ�"));
	    MyItemListener listener = new MyItemListener();
	    f1.addItemListener(listener);
	    c.add(f1);
	    label = new JLabel("���� ������ ????");
	    c.add(label);
	    setSize(200,200);
	    setVisible(true);
	    
	}
	
	class MyItemListener implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			int price = 0;
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == f1) {
					price = 2000;
				}
				else {
					price = 0;
				}

		}
		label.setText("���� ������" + price + "��");
	  }
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Ex01();
	}

}
