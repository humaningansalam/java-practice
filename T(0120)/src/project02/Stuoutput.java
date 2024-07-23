package project02;

import java.util.*;

public class Stuoutput {
	Scanner scan = new Scanner(System.in);
	
	public void show(ArrayList<Stuinfo> list) {
		if(list.size() == 0) {
			System.out.println("입력된 정보가 없습니다.");
		}
		else {
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
			
		}
	}

	
	public void search(ArrayList<Stuinfo> list) {
		
		if(list.size() == 0) {
			System.out.println("입력된 정보가 없습니다.");
		}
		else {
			System.out.println("검색할 나이를 입력하세요");
			int tmpage = scan.nextInt();
			
			for(int i=0; i<list.size(); i++) {

				if(tmpage == list.get(i).age) {
					System.out.println(list.get(i));
				}

			}
			
		}
		
	}
}
