package proj01;



public class Ad {

	
	public Ad()  {
		System.out.println("ad����");
		
		String adpw = "9999";
		
		System.out.println("������ ����� �Է��ϼ���");
		String pw = new Input().s();
		
		if(adpw.equals(pw)) {
			menu();
			
		}
		else{
			System.out.println("�����ں���� Ʋ�Ƚ��ϴ�.");
		}

	
	}
	
	void menu() {

		for(;;) {
			int menu = 0;
			menu = new Menu().admenu();
			
			if(menu == 1) {
				System.out.println("ad1������");
				break;
			}
			if(menu == 2) {
				System.out.println("ad2������");
				break;
			}
			if(menu == 2) {
				System.out.println("ad3������");
				break;
			}
			
			
		}
	}

}
