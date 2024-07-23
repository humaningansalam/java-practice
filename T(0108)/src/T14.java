
class Korea{
	String nation = "대한민국";
	String name;
	String ssn;
	
	public Korea() {
		System.out.println("public Korea()로생성");
	}
	
	
	public Korea(String n, String s) {
		name = n;
		ssn = s;
		System.out.println("public Korea(String n, String s)로생성");
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

		Korea k1 = new Korea("박자바", "011101010");
		k1.show();
		
		Korea k2  = new Korea("김자바", "606565610");
		k2.show();
	}

}
