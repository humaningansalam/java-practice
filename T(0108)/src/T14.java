
class Korea{
	String nation = "���ѹα�";
	String name;
	String ssn;
	
	public Korea() {
		System.out.println("public Korea()�λ���");
	}
	
	
	public Korea(String n, String s) {
		name = n;
		ssn = s;
		System.out.println("public Korea(String n, String s)�λ���");
	}
	
	void show() {
		System.out.println("name :" + name);
		System.out.println("ssn : " + ssn);
	}
}
public class T14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korea k0 = new Korea();

		Korea k1 = new Korea("���ڹ�", "011101010");
		k1.show();
		
		Korea k2  = new Korea("���ڹ�", "606565610");
		k2.show();
	}

}
