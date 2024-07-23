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
		System.out.print("이름을 적어주세요");
		d[count].name = scan.next();
		System.out.print("번호를 적어주세요");
		d[count].number = scan.next();
		count++;
	}
	
	void search() {
		if(count == 0) {
			System.out.println("입력된값이 없습니다.");
		}
		for(int i=0; i<count; i++) {
			System.out.println((i+1) + ". 이름 :" + d[i].name + "번호 :" + d[i].number);
		}
		
	}
	
	void retouch() {
		String tmp;
		int x = 0;
		System.out.println("찾는 이름을 입력하세요.");
		tmp = scan.next();
		
		for(int i=0; i<count; i++) {
			if(d[i].name.equals(tmp)) {
				 System.out.print("수정할 이름을 입력하세요.");
				 d[i].name = scan.next();
				 System.out.print("수정할 번호를 입력하세요.");
				 d[i].number = scan.next();
				 x++;
			}
		}
		
		if(x == 0) {
			System.out.println("찾는이름이 없습니다.");
		}
	}
	
	void delete() {
		String tmp;
		String tmp2;
		int x = 0;
		System.out.println("삭제할 이름을 입력하세요.");
		tmp = scan.next();
		
		for(int i=0; i<count; i++) {
			if(d[i].name.equals(tmp)) {
				
				 System.out.print("삭제하겠습니까?\tY or N");
				 tmp2 = scan.next();
				 if(tmp2.equals("Y") || tmp2.equals("y")) {
					 for(int j=i; j<count; j++) {
						 d[j] = d[j+1];
					 }
					 System.out.println("삭제성공");
					 count--;
				 }
				 if(tmp2.equals("n") || tmp2.equals("N")) {
					 System.out.println("삭제취소");
				 }
				 x++;
			}
		}
		
		if(x == 0) {
			System.out.println("찾는이름이 없습니다.");
		}
	}
	

	int menu() {
		int tmp;
		System.out.println("1.입력\t 2.확인\t 3.수정\t 4.삭제");
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
