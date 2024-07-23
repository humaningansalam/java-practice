import java.util.*;

class Datap2Drive{
	ArrayList<Datap> list = new ArrayList<Datap>();
	
	Scanner scan = new Scanner(System.in);
	
	int a = 0;
	
	public Datap2Drive() {

	}
	
	void input() {
		Datap d = new Datap();
		System.out.print("이름을 적어주세요");
		d.name = scan.next();
		System.out.print("번호를 적어주세요");
		d.number = scan.next();
		list.add(d);

	}
	
	void search() {
		if(list.size() == 0) {
			System.out.println("입력된값이 없습니다.");
		}
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).name);
			System.out.println(list.get(i).number);
		}
		
		
	}
	
	
	void delete() {
		String tmp;

		System.out.println("삭제할 이름을 입력하세요.");
		tmp = scan.next();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).name.equals(tmp)) {
				list.remove(i);
			}
		}
	}
	

	int menu() {
		int tmp;
		System.out.println("1.입력\t 2.확인\t 3.삭제");
		tmp = scan.nextInt();
		
		return tmp;
	}
	void run() {
		for(;;) {
			a = menu();
			
			if(a == 1) input() ;
			if(a == 2) search();
			if(a == 3) delete();
		}
	}
}
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Datap2Drive().run();

	}

}
