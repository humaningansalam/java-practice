package t0111;
import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String id = "hanna";
		String pwd = "1234";
		
		String id2, pwd2;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���̵� �Է�:");
		id2 = scan.next();
		System.out.print("��� �Է�");
		pwd2 = scan.next();
		
		if(id.equals(id2) && pwd.equals(pwd2)) {
			System.out.println("���� �����ϴ�.");
		}
		else {
			System.out.println("���� �ٸ��ϴ�.");
		}
		

	}

}
