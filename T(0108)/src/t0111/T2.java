package t0111;
import java.util.Scanner;

class Data{
	String name;
	int age;
}

class DataDriver{
	Data d = new Data();
	Scanner scan = new Scanner(System.in);
	
	public DataDriver() {
		input();
		output();
	}
	
	void input() {
		System.out.print("이름 입력: ");
		d.name = scan.next();
		System.out.print("나이 입력: ");
		d.age = scan.nextInt();
	}
	
	void output() {
		System.out.println(d.name + "," + d.age);
	}
}

public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new DataDriver();

	}

}
