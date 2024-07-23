package proj01;



public class Ad {

	
	public Ad()  {
		System.out.println("ad시작");
		
		String adpw = "9999";
		
		System.out.println("관리자 비번을 입력하세요");
		String pw = new Input().s();
		
		if(adpw.equals(pw)) {
			menu();
			
		}
		else{
			System.out.println("관리자비번이 틀렸습니다.");
		}

	
	}
	
	void menu() {

		for(;;) {
			int menu = 0;
			menu = new Menu().admenu();
			
			if(menu == 1) {
				System.out.println("ad1번선택");
				break;
			}
			if(menu == 2) {
				System.out.println("ad2번선택");
				break;
			}
			if(menu == 2) {
				System.out.println("ad3번선택");
				break;
			}
			
			
		}
	}

}
