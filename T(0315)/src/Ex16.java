
import java.io.IOException;
import java.util.Scanner;

class Data{
	String name; 	
	int age;
}

class Input{
	Scanner scan = new Scanner(System.in);
	Data d ;
	
	public Data add() {
		d = new Data();
		System.out.println("�̸� �Է� :"); d.name = scan.next();
		System.out.println("���� �Է� :"); d.age = scan.nextInt();
		return d;
	}
}

class Output{
	public void print(Data[] dd, int size) {
		for (int i = 0; i < size ; i++) {
			System.out.println(dd[i].name);
			System.out.println(dd[i].age);
		}
	}	
}


public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data[] d = new Data[5];  //�迭
		int menu, count = 0;
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("\n�޴� \n1.�Է� 2.��� \n�޴�����>>");
			menu = scan.nextInt();
			if(menu == 1) {
				d[count] = new Input().add();
				count++;
			}
			
			if(menu == 2) {
				new Output().print(d, count);
			}
		}//while(true) {


	}

}
