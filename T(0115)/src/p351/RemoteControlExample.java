package p351;

import java.util.Scanner;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		
		RemoteControl rc = null;

		System.out.println("1.번 텔레비전, 2번 오디오");
		int menu = scan.nextInt();
		
		if(menu == 1) {
			rc = new Television();
		}
		
		if(menu == 2) {
			rc = new Audio();
		}
		
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		

		
	}

}
