import java.util.Scanner;

class Info{
	String name = "���ѳ�";
	
	public Info() {
		System.out.println("������!!!");
	}
	void show() {
		String name = "�̵γ�";
		System.out.println(name);
		System.out.println(this.name);
	}
}

//Ŭ���� :�빮��                   | class Info{
//-����ʵ�                       | String name
//-������ :�빮��(Ŭ�����̸��� ����)    | public Info() {
//-�޼ҵ�(�Լ�) :�ҹ���             | void show() {

public class T5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner = Ŭ���� scan = �������� Scanner(System.in) = ������
		
		Scanner input = new Scanner(System.in);
		Info f = new Info();
		
		System.out.println(f.name);
		
		int a, b;
		
		System.out.print("�����Է� :");
		a = input.nextInt();
		
		System.out.print("�����Է� :");
		b = input.nextInt();
		
		if(a > b) {
			System.out.println("a�� Ů�ϴ�.");
		}
		else if(a < b) {
			System.out.println("b�� Ů�ϴ�.");
		}
		else {
			System.out.println("�μ��� ����.");
		}

	}

}
