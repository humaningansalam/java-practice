package project02;

import java.util.*;

public class Stuoutput {
	Scanner scan = new Scanner(System.in);
	
	public void show(ArrayList<Stuinfo> list) {
		if(list.size() == 0) {
			System.out.println("�Էµ� ������ �����ϴ�.");
		}
		else {
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
			
		}
	}

	
	public void search(ArrayList<Stuinfo> list) {
		
		if(list.size() == 0) {
			System.out.println("�Էµ� ������ �����ϴ�.");
		}
		else {
			System.out.println("�˻��� ���̸� �Է��ϼ���");
			int tmpage = scan.nextInt();
			
			for(int i=0; i<list.size(); i++) {

				if(tmpage == list.get(i).age) {
					System.out.println(list.get(i));
				}

			}
			
		}
		
	}
}
