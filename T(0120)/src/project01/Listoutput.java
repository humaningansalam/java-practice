package project01;

import java.util.*;


public class Listoutput {
	Scanner scan = new Scanner(System.in);

	
	public void show(ArrayList<Listinfo> list) {
		
		if(list.size() == 0) {
			System.out.println("�Էµ� ������ �����ϴ�.");
		}
		else {
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
			
		}

	}
	
	public void search(ArrayList<Listinfo> list) {
		String tmpname;
		
		if(list.size() == 0) {
			System.out.println("�Էµ� ������ �����ϴ�.");
		}
		else {
			System.out.println("�˻��� ���� �Է��ϼ���");
			tmpname = scan.next();
			char tmpch1 = tmpname.charAt(0);
			
			for(int i=0; i<list.size(); i++) {

				char tmpch2 = list.get(i).name.charAt(0);

				if(tmpch1 == tmpch2) {
					System.out.println(list.get(i));
				}

			}
			
		}
	}
}
