package project01;

import java.util.ArrayList;
import java.util.Scanner;

public class Studele {
	Scanner scan = new Scanner(System.in);

	public void show(ArrayList<StudentInfo> list) {
		if(list.size() == 0) {
		    System.out.println("����� ������ �����ϴ�.");
		}
		else {
			System.out.println("���� �̸� �Է� :");
			String name = scan.next();
			
			for(int i=0; i<list.size(); i++) {
				if(name.equals(list.get(i).name)) {
					list.remove(i);
				}
			}
		}
	}
}
