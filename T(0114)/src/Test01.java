
class Person{
	String name;
	private String add;
	private String number;
	
	public Person() {
		
	}
	
	public Person(String n) {
		this.name = n;
	}
	
    public String getAdd() {
    	return add;
    }
    
    public void setAdd(String n) {
    	this.add = n;
    }
    
    public String getNumber() {
    	return number;
    }
    
    public void setNumber(String n) {
    	this.number = n;
    }
}

class Customer extends Person{
	private String cnumber;
	String mile;
	
	public Customer(String n) {
		this.name = n;
	}
	
    public String getcNumber() {
    	return cnumber;
    }
    
    public void setcNumber(String n) {
    	this.cnumber = n;
    }
}

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

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Tt1().run();
	}

}
