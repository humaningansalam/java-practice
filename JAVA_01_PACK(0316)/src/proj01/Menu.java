package proj01;



public class Menu {
	

	
	
	
	int menu() {
		int menu = 0;
		
		System.out.println("1. �ζǱ���");
		System.out.println("2. �˻�");
		System.out.println("3. ����");
		System.out.println("4. ������");

		menu = new Input().i();
		
		return menu;
	}
	
	int admenu() {
		int menu = 0;
		
		System.out.println("1. �������� Ȯ��");
		System.out.println("2. �ζ� ��÷ ����");
		System.out.println("3. �ʱ�ȭ������");

		menu = new Input().i();
		

		return menu;
	}


}
