import java.util.Scanner;

class Info1{
	String name;
	int[] seat = new int[10];
	int price;
	int count = 10;
	
	public Info1() {
		
	}
	
	public Info1(String n, int a) {
		this.name = n;
		this.price = a;
	}
}

class InfoDrive1{
	Scanner scan = new Scanner(System.in);
	Info1 in1 = new Info1("����", 6000);
	Info1 in2 = new Info1("�����ڵ�", 5500);
	Info1 intmp = new Info1();
	
	int a, b, c, pp ,tt, ms;
	
	
	
	public InfoDrive1(){
		System.out.println("--------------");
		System.out.println("��ȭ ���� ���α׷�");
		System.out.println("--------------");
	}

	
	int select() {
		int tmp = scan.nextInt();
		
		return tmp;
	}
	
	void show() {
		showseat();
		movieseat();
	}
	
	void showseat() {
		for(int i=0; i<10; i++) {
			System.out.print(" " + (i+1) + " ");
		}
		System.out.println();
		System.out.println("-------------------------------");

	}
	
	void movieseat() {
		for(int i=0; i<intmp.seat.length; i++) {
			System.out.print(" " + intmp.seat[i] + " ");
		}
		System.out.println();
	}
	
	int semovie() {
        int tmp;
		System.out.println("1.����\t2.�����ڵ�");
		ms = select();
		
		if(ms == 1) {
			intmp = in1;
			tmp = 1;
		}
		else if(ms == 2){
			intmp = in2;
			tmp = 1;
		}
		else {
			System.out.println("�ٽü������ּ���");
			tmp = 0;
		}
		
		if(intmp.count == 0) {
			show();
			System.out.println("���Ű��� �ο��� �����ϴ�.");
			tmp = 0;
		}
		
		return tmp;
	}
	
	int sepeople() {
		int tmp;

		while(true) {
			show();
			System.out.println("�������(�ִ�3��)");
			tmp = select();
			if((in1.count-tmp) > -1) {
				break;
			}
			else {
				System.out.println("�����Ҽ��ִ� ����� �ʰ��߽��ϴ�.");
			}
		}
		return tmp;
	}
	
	void seseat(int x) {

		for(int i=0; i<x; i++) {
			System.out.println("�¼�����");
			c = select();
			if(intmp.seat[(c-1)] == 0) {
				intmp.seat[(c-1)] = 1;
				show();
				intmp.count--;
			}
			else {
				System.out.println("�̹̿���Ǿ��ֽ��ϴ�.");
				i--;
			}
		}
		
	}
	
	int seprice(int x) {
		int tmp;
		System.out.println("���α��� �ֽ��ϱ�?");
		System.out.println("1.�ִ�\t2.����");
		tmp = select();
		
		return tmp;
	}
	
	void pay(int x, int y) {
		double tmp;
		int tmp2;
		
		System.out.println("�����ݾ� Ȯ��");
		if(y == 1) {
			tmp = (intmp.price*(x-1)) + intmp.price*0.9;
		}
		else {
			tmp = intmp.price*x;
		}
		
		System.out.println("�����ݾ���" + tmp + "�Դϴ�.");
		
	    System.out.println("�����Ͻðڽ��ϱ�??");
	    System.out.println("1.�����Ϸ�\t2.�������");
	    tmp2 = select();
	    if(tmp2 == 1) {
	    	System.out.println("�����Ϸ�Ǿ����ϴ�.");
	    	if(ms == 1) {
	    		in1 = intmp;
	    	}
	    	if(ms == 2) {
	    		in2 = intmp;
	    	}
	    	
	    }
	    else if(tmp2 == 2) {
	    	System.out.println("������ҵǾ����ϴ�.");
	    }
	}
	
	void run() {
		
		for(;;) {
			a = semovie();
			
			if(a == 1) {
					
				pp = sepeople();
					
				seseat(pp);
					
				tt = seprice(pp);
						
				pay(pp, tt);
						
			}
				
		}
		
	}
}

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new InfoDrive1().run();
		

	}

}
