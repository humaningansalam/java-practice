import java.util.Scanner;


class Car{
	
	String company = "�����ڵ���";
	String model = "�׷���";
	String color = "����";
	int maxSpeed = 350;
	int speed = 20;
	
	public Car(){
		System.out.println("��ü ����");
	}
	
}

public class T13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
    
		Car mycar = new Car();
		
		//�ʵ� �� �б�
		System.out.println("����ȸ�� :" + mycar.company);
		System.out.println("�𵨸� :" + mycar.model);
		System.out.println("���� :" + mycar.color);
		System.out.println("�ְ�ӵ� :" + mycar.maxSpeed);
		System.out.println("����ӵ� : " + mycar.speed);
		
		System.out.print("������ �ӵ� :");
		mycar.speed = scan.nextInt();

		System.out.println("������ �ӵ�:" + mycar.speed);
		
	}

}
