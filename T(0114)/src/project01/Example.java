package project01;

class Tt1{
	Customer cc = new Customer("ddd");
	
	void show() {
		System.out.println("�̸� :" + cc.name);
		System.out.println("�ּ� :" + cc.getAdd());
		System.out.println("��ȭ��ȣ :" + cc.getNumber());
		
		System.out.println("����ȣ :" + cc.getcNumber());
		System.out.println("���ϸ��� :" + cc.mile);
	}
	
	void run() {

		cc.setAdd("005454");
		cc.setNumber("5555555");
		cc.setcNumber("1231321");
		
		cc.mile = "22";
		
		show();
	}
}

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Tt1().run();
		
	}

}
