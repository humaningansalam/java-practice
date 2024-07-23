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
			System.out.print((i+1) + ".이름 입력");
			in[i].name = scan.next();
			System.out.print((i+1) + ".성적 입력");
			in[i].score = scan.nextInt();
			sum += in[i].score;
			if(sum >= 100) {
				System.out.println("성적의 합계가 100점이 넘습니다.");
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
