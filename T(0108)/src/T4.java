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
		System.out.print("�̸��Է� :");
		name = scan.nextLine();
		System.out.print("�����Է� :");
		age = scan.nextInt();
		System.out.print("�̸��Է�2 :");
		name2 = scan.next();  
		System.out.print("�����Է�2 :");
		age2 = scan.nextInt();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(name2);
		System.out.println(age2);
		System.out.println("ù��° :" + name + age);
		System.out.println("�ι�° :" + name2 + age2);
	}

}
