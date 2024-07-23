import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String name;
		int age;
		String name2;
		int age2;
		
		//nextInt  nextLine  next
		System.out.print("이름입력 :");
		name = scan.nextLine();
		System.out.print("나이입력 :");
		age = scan.nextInt();
		System.out.print("이름입력2 :");
		name2 = scan.next();  
		System.out.print("나이입력2 :");
		age2 = scan.nextInt();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(name2);
		System.out.println(age2);
		System.out.println("첫번째 :" + name + age);
		System.out.println("두번째 :" + name2 + age2);
	}

}
