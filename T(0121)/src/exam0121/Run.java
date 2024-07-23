package exam0121;

import java.util.*;


public class Run {
	Scanner scan = new Scanner(System.in);
    ArrayList<Bookinfo> list = new ArrayList<Bookinfo>();
	
	public Run() {
		list.add(new Bookinfo("�ѱ���ɷ°�������", 12000));
		list.add(new Bookinfo("����ι��¿���", 15000));
	}
	
	public void process() {
		
		for(;;) {
			int menu = new Menu().mainmenu();
			
			if(menu == 1) {
				list.add(new Bookinput().bookadd());
			}
			else if(menu == 2) {
				new Bookoutput().bookshow(list);
			}
			else if(menu == 3) {
				new Bookoutput().booksearch(list);
			}
			else if(menu == 4) {
	        	new Menu().exit();
				break;
			}
			else {
				new Menu().err();
			}
		}
	}

}
