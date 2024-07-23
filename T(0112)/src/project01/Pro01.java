package project01;
import java.util.Scanner;

class Data1{
	String name;
	int score;
}
class Driver1{
	Scanner scan = new Scanner(System.in);
	Data1 d = new Data1();
	
	
	void input() {
		System.out.print("이름 입력");
		d.name = scan.next();
		System.out.print("성적 입력");
		d.score  = scan.nextInt();
	}
	
	void output() {
		System.out.println(d.name + "," + d.score);
	}

}
public class Pro01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver1 d = new Driver1();
		d.input();
		d.output();
		

	}

}
