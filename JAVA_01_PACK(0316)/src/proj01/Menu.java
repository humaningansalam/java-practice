package proj01;



public class Menu {
	

	
	
	
	int menu() {
		int menu = 0;
		
		System.out.println("1. 로또구매");
		System.out.println("2. 검색");
		System.out.println("3. 종료");
		System.out.println("4. 관리자");

		menu = new Input().i();
		
		return menu;
	}
	
	int admenu() {
		int menu = 0;
		
		System.out.println("1. 구매정보 확인");
		System.out.println("2. 로또 추첨 시작");
		System.out.println("3. 초기화면으로");

		menu = new Input().i();
		

		return menu;
	}


}
