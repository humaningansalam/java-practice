package p310;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child child = new Child();

		Parent parent = child;
		parent.method1();
		parent.method2();
		//parent.method3(); 호출불가능

	}

}
