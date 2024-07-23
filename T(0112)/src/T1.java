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
	Info1 in1 = new Info1("광해", 6000);
	Info1 in2 = new Info1("내부자들", 5500);
	Info1 intmp = new Info1();
	
	int a, b, c, pp ,tt, ms;
	
	
	
	public InfoDrive1(){
		System.out.println("--------------");
		System.out.println("영화 예매 프로그램");
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
		System.out.println("1.광해\t2.내부자들");
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
			System.out.println("다시선택해주세요");
			tmp = 0;
		}
		
		if(intmp.count == 0) {
			show();
			System.out.println("예매가능 인원이 없습니다.");
			tmp = 0;
		}
		
		return tmp;
	}
	
	int sepeople() {
		int tmp;

		while(true) {
			show();
			System.out.println("명수선택(최대3명)");
			tmp = select();
			if((in1.count-tmp) > -1) {
				break;
			}
			else {
				System.out.println("예약할수있는 사람을 초과했습니다.");
			}
		}
		return tmp;
	}
	
	void seseat(int x) {

		for(int i=0; i<x; i++) {
			System.out.println("좌석선택");
			c = select();
			if(intmp.seat[(c-1)] == 0) {
				intmp.seat[(c-1)] = 1;
				show();
				intmp.count--;
			}
			else {
				System.out.println("이미예약되어있습니다.");
				i--;
			}
		}
		
	}
	
	int seprice(int x) {
		int tmp;
		System.out.println("할인권이 있습니까?");
		System.out.println("1.있다\t2.없다");
		tmp = select();
		
		return tmp;
	}
	
	void pay(int x, int y) {
		double tmp;
		int tmp2;
		
		System.out.println("결제금액 확인");
		if(y == 1) {
			tmp = (intmp.price*(x-1)) + intmp.price*0.9;
		}
		else {
			tmp = intmp.price*x;
		}
		
		System.out.println("결제금액은" + tmp + "입니다.");
		
	    System.out.println("결제하시겠습니까??");
	    System.out.println("1.결제완료\t2.결제취소");
	    tmp2 = select();
	    if(tmp2 == 1) {
	    	System.out.println("결제완료되었습니다.");
	    	if(ms == 1) {
	    		in1 = intmp;
	    	}
	    	if(ms == 2) {
	    		in2 = intmp;
	    	}
	    	
	    }
	    else if(tmp2 == 2) {
	    	System.out.println("결제취소되었습니다.");
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
