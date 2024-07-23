package GuiEvent;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Ex02 extends JFrame{
	
	JLabel j = new JLabel("¿Ã∏ß");
	JTextField tf = new JTextField(20);
	JLabel check = new JLabel("");
	
	public Ex02()	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(j);
		c.add(tf);
		c.add(check);
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				check.setText(t.getText());
			}
		});
		
		setSize(300,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Ex02();
	}

}
