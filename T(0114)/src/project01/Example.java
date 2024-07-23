package project01;

class Tt1{
	Customer cc = new Customer("ddd");
	
	void show() {
		System.out.println("이름 :" + cc.name);
		System.out.println("주소 :" + cc.getAdd());
		System.out.println("전화번호 :" + cc.getNumber());
		
		System.out.println("고객번호 :" + cc.getcNumber());
		System.out.println("마일리지 :" + cc.mile);
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
