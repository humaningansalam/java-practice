package project01;
import java.util.Scanner;

class Info9{
	String name;
	int score;
}

class InfoDriver9{
	Scanner scan = new Scanner(System.in);
	Info9[] in = new Info9[3];
	int sum = 0;
	
	public InfoDriver9() {
		in[0] = new Info9();
		in[1] = new Info9();
		in[2] = new Info9();
		
		input();
		//output();
		
	}
	void input() {
		for(int i=0; i<in.length; i++) {
			System.out.print((i+1) + ".�̸� �Է�");
			in[i].name = scan.next();
			System.out.print((i+1) + ".���� �Է�");
			in[i].score = scan.nextInt();
			sum += in[i].score;
			if(sum >= 100) {
				System.out.println("������ �հ谡 100���� �ѽ��ϴ�.");
				break;
			}
		}
		
	}
	
	void output() {
		
	}
}

public class Pro09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new InfoDriver9();
	}

}
