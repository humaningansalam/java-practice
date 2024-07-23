import java.awt.*;
import java.util.Scanner;

import javax.swing.*;

public class ContentPaneEx extends JFrame {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		

		JFrame f = new JFrame();
		Container contentPane;
		f.setTitle("ContentPane°ú JFrame");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = f.getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("cancle"));
		contentPane.add(new JButton("Ignore"));
		
		f.setSize(300, 150);

		
		for(;;) {
			int a = scan.nextInt();
			
			if(a == 1) {
				f.setVisible(false);
				f.setVisible(true);
			}
			if(a == 2) {
				f.setVisible(false);
			}
			if(a == 3) {
				contentPane.add(new JButton("ganna"));
				f.setVisible(true);
			}
			if(a == 4) {
				break;
			}
		}
	}

}
