import java.util.Scanner;

class Info{
	String name = "이한나";
	
	public Info() {
		System.out.println("생성자!!!");
	}
	void show() {
		String name = "이두나";
		System.out.println(name);
		System.out.println(this.name);
	}
}

//클래스 :대문자                   | class Info{
//-멤버필드                       | String name
//-생성자 :대문자(클래스이름과 동일)    | public Info() {
//-메소드(함수) :소문자             | void show() {

public class T5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner = 클래스 scan = 참조변수 Scanner(System.in) = 생성자
		
		Scanner input = new Scanner(System.in);
		Info f = new Info();
		
		System.out.println(f.name);
		
		int a, b;
		
		System.out.print("정수입력 :");
		a = input.nextInt();
		
		System.out.print("정수입력 :");
		b = input.nextInt();
		
		if(a > b) {
			System.out.println("a가 큽니다.");
		}
		else if(a < b) {
			System.out.println("b가 큽니다.");
		}
		else {
			System.out.println("두수가 같다.");
		}

	}

}
