package project01;

import java.util.ArrayList;

public class Stuoutput {

	public void show(ArrayList<StudentInfo> list) {
		if(list.size() == 0) {
			System.out.println("입력된 정보가 없습니다.");
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
