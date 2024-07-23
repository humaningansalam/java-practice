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
		c.add(new JLabel("이름"));
		c.add(new JTextField(""));
		c.add(new JLabel("학번"));
		c.add(new JTextField(""));
		c.add(new JLabel("학과"));
		c.add(new JTextField(""));
		c.add(new JLabel("과목"));
		c.add(new JTextField(""));
		
		j.setSize(300,200);
		j.setVisible(true);
	}

}
