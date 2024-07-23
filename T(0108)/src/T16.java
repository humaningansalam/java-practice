class Data16{
	String name = "test";
	int age = -1;
}

class Car16{
	Data16 d = new Data16();
	
	void show() {
		System.out.println(d.name);
		System.out.println(d.age);
	}
}
public class T16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car16 c = new Car16();
		c.show();
		c.d.name = "haaana";
		c.d.age = 29;
		c.show();
	}

}
