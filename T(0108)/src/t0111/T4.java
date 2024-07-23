package t0111;
import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String id = "hanna";
		String pwd = "1234";
		
		String id2, pwd2;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디 입력:");
		id2 = scan.next();
		System.out.print("비번 입력");
		pwd2 = scan.next();
		
		if(id.equals(id2) && pwd.equals(pwd2)) {
			System.out.println("둘은 같습니다.");
		}
		else {
			System.out.println("둘은 다릅니다.");
		}
		

	}

}
