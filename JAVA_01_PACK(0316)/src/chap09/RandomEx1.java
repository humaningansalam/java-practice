package chap09;

import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random(1);
		Random rand2 = new Random(3);
		

		System.out.println("= rand =");
		for(int i=0; i<5; i++) {
			System.out.println(i + ":" + rand.nextInt());
			
		}
		System.out.println();
		System.out.println(" =rand2 =");
		for(int i=0; i<5; i++) {
			System.out.println(i + ":" + rand2.nextInt());
		}
	}

}
