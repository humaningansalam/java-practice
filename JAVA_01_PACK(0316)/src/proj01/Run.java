package proj01;


import java.util.ArrayList;


public class Run {
	
	ArrayList<User> list = new ArrayList<User>();
	User user ;
	

	public Run(){
		new Db().check(list, user);
		process();
	}
	
	void process(){
		System.out.println("");
		
		for(;;){
			int menu = 0;
			menu = new Menu().menu();
			
			if(menu == 1) {
				System.out.println("1������");
				new Sell(list).process(list, user);
			}
			
			else if(menu == 2) {
				System.out.println("2������");
				new Output().show(list);
			}
			
			else if(menu == 3) {
				System.out.println("�����ϰڽ��ϴ�.");
				break;
			}
			
			else if(menu == 4) {
				System.out.println("4������");
				new Ad();
				
			}
			
			else {
				System.out.println("�˼����µ����Դϴ�.");
			}
			
		}
		
	}
	
	
}
