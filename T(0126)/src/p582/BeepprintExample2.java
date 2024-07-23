package p582;

import java.awt.Toolkit;

public class BeepprintExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable beepTask = new Beeptask();
		Thread thread = new Thread(beepTask);
		
		thread.start();

		
		for(int j=0; j< 5; j++) {
			System.out.println("¶ò");
			try {Thread.sleep(500);} catch(Exception e) {}
		}

	}

}
