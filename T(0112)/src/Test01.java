
public class Test01 {

	static void show() {
		System.out.println("show ����");
	}
	
	static void test() {
		System.out.println("test����");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test();
		test();
		show();
		System.out.println("main����");
		
		Test01 t =new Test01();
		t.test();
		t.show();
		
		Test01.test();
		Test01.show();
		
	}

}
