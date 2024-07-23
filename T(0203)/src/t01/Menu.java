package t01;

import java.util.*;

public class Menu {
	Scanner scan = new Scanner(System.in);
	
	int menu(){
		int menu = 0;
		
		System.out.println("1. 학생정보 입력");
		System.out.println("2. 학생정보 출력");
		System.out.println("3. 학생정보 검색");
		System.out.println("4. 학생정보 수정");
		System.out.println("5. 학생정보 삭제");
		System.out.println("6. 프로그램 종료");
		System.out.print("선택 : ");
		menu = scan.nextInt();
		
		return menu;
	}
}
