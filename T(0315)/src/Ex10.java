import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문바입력");
		String str = scan.next();
		System.out.println("숫자입력");
		int a = scan.nextInt();
		
		System.out.println(str);
		System.out.println(a);
		
		scan.close();

	}

}
