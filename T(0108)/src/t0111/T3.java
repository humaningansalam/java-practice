package t0111;
import java.util.Scanner;

class Member{
	String name;
	String id;
	private String pwd;
	int age;
	
	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
}

class MemDrive{
	Member mem = new Member("이한나", "hanna");
	Scanner scan = new Scanner(System.in);

	public MemDrive(){
		input();
		output();
	}
	
	void input() {
		System.out.println("패스워드 입력");
		mem.setPwd(scan.next());
	}
	
	void output() {
		System.out.println(mem.name);
		System.out.println(mem.id);
		System.out.println(mem.getPwd());
		System.out.println(mem.age);
	}
	
}
public class T3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MemDrive();
	}

}
