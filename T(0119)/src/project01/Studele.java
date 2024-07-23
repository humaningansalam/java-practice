package project01;

import java.util.ArrayList;
import java.util.Scanner;

public class Studele {
	Scanner scan = new Scanner(System.in);

	public void show(ArrayList<StudentInfo> list) {
		if(list.size() == 0) {
		    System.out.println("출력할 정보가 없습니다.");
		}
		else {
			System.out.println("삭제 이름 입력 :");
			String name = scan.next();
			
			for(int i=0; i<list.size(); i++) {
				if(name.equals(list.get(i).name)) {
					list.remove(i);
				}
			}
		}
	}
}
