import javax.swing.*;
import java.awt.*;
import java.util.*;
public class GridLayoutEx {

static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame j = new JFrame();
		Container c;
		j.setTitle("Grid:ayout Sample");
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c = j.getContentPane();
		c.setLayout(null);
		c.add(new JLabel("�̸�"));
		c.add(new JTextField(""));
		c.add(new JLabel("�й�"));
		c.add(new JTextField(""));
		c.add(new JLabel("�а�"));
		c.add(new JTextField(""));
		c.add(new JLabel("����"));
		c.add(new JTextField(""));
		
		j.setSize(300,200);
		j.setVisible(true);
	}

}
