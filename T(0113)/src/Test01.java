import java.util.Scanner;

class Data{
	String name =  "�ʱⰪ";
}
class Student{
	Data d = new Data();
	Scanner scan = new Scanner(System.in);
	
	void input() {
		System.out.println("�̸��Է�: ");
		d.name = scan.next();
	}
	
	void output() {
		System.out.println(d.name);
	}
}
class StudentDriver{
	Student s = new Student();
	Scanner scan = new Scanner (System.in);
	int menu;
	public StudentDriver(){
		for(;;) {
			System.out.println("�޴����� >>");
			menu = scan.nextInt();
			
			if(menu == 1) {
				s.input();
			}
			if(menu == 2) {
				s.output();
			}
			if(menu == 3) {
				break;
			}
		}
	}
}


public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new StudentDriver();
	}

}
