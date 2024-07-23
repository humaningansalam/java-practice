
public class Ex12 {

	void show() {
		System.out.println("show 메소드");
	}
	
	int show(int a) {
		System.out.println(a + "show 메소드 실행");
		return a;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex12 ex = new Ex12();
		ex.show();
		ex.show(1);
		

	}

}
