import java.util.Scanner;

class Datap{
	String name;
	String number;
}

class DatapDrive{
	Scanner scan = new Scanner(System.in);
	Datap[] d = new Datap[10];
	int count = 0;
	int a = 0;
	
	public DatapDrive() {
		for(int i=0; i<10; i++) {
			d[i] = new Datap();
		}
	}
	
	void input() {
		System.out.print("�̸��� �����ּ���");
		d[count].name = scan.next();
		System.out.print("��ȣ�� �����ּ���");
		d[count].number = scan.next();
		count++;
	}
	
	void search() {
		if(count == 0) {
			System.out.println("�ԷµȰ��� �����ϴ�.");
		}
		for(int i=0; i<count; i++) {
			System.out.println((i+1) + ". �̸� :" + d[i].name + "��ȣ :" + d[i].number);
		}
		
	}
	
	void retouch() {
		String tmp;
		int x = 0;
		System.out.println("ã�� �̸��� �Է��ϼ���.");
		tmp = scan.next();
		
		for(int i=0; i<count; i++) {
			if(d[i].name.equals(tmp)) {
				 System.out.print("������ �̸��� �Է��ϼ���.");
				 d[i].name = scan.next();
				 System.out.print("������ ��ȣ�� �Է��ϼ���.");
				 d[i].number = scan.next();
				 x++;
			}
		}
		
		if(x == 0) {
			System.out.println("ã���̸��� �����ϴ�.");
		}
	}
	
	void delete() {
		String tmp;
		String tmp2;
		int x = 0;
		System.out.println("������ �̸��� �Է��ϼ���.");
		tmp = scan.next();
		
		for(int i=0; i<count; i++) {
			if(d[i].name.equals(tmp)) {
				
				 System.out.print("�����ϰڽ��ϱ�?\tY or N");
				 tmp2 = scan.next();
				 if(tmp2.equals("Y") || tmp2.equals("y")) {
					 for(int j=i; j<count; j++) {
						 d[j] = d[j+1];
					 }
					 System.out.println("��������");
					 count--;
				 }
				 if(tmp2.equals("n") || tmp2.equals("N")) {
					 System.out.println("�������");
				 }
				 x++;
			}
		}
		
		if(x == 0) {
			System.out.println("ã���̸��� �����ϴ�.");
		}
	}
	

	int menu() {
		int tmp;
		System.out.println("1.�Է�\t 2.Ȯ��\t 3.����\t 4.����");
		tmp = scan.nextInt();
		
		return tmp;
	}
	void run() {
		for(;;) {
			a = menu();
			
			if(a == 1) input() ;
			if(a == 2) search();
			if(a == 3) retouch();
			if(a == 4) delete();
		}
	}
}


public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new DatapDrive().run();
	}

}
