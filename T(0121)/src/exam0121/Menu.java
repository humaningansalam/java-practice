package exam0121;

import java.util.Scanner;;

public class Menu {
    
	Scanner scan = new Scanner(System.in);
	
	public int mainmenu() {
		System.out.println("=======  도서목록 확인 프로그램 =======");
		System.out.println("1.도서입력  2.도서출력  3.도서검색  4.종료");
		
		int menu = scan.nextInt();
		return menu;
	}
	
	public void exit() {
		System.out.println("종료합니다.");
	}
	
	public void err() {
		System.out.println("알수없습니다.");
	}
}
