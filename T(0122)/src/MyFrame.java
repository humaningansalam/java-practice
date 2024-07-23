import java.util.Scanner;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame() {
		setTitle("300x300 스윙 프레임 만들기");
		setSize(300,300);//프레임 크기300x300
		setVisible(true);	//프레임출력	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MyFrame frame =  new MyFrame();
		
		Scanner scan = new Scanner(System.in);
		
		JFrame j = new JFrame("test");
		j.setSize(300, 300);
		j.setVisible(false);
		
		
		JFrame k = new JFrame();
		k.setTitle("title");
		k.setSize(350,350);
		k.setVisible(false);
		
		for(;;) {
			System.out.println("입력");
			int a = scan.nextInt();
			
			if(a == 1) {
				j.setVisible(true);
			}
			if(a == 2) {
				k.setVisible(true);
			}
		}
	}

}
