package p584;



public class BeepprintExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Thread thread = new Beepthread();
		
		thread.start();

		
		for(int j=0; j< 5; j++) {
			System.out.println("¶ò");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}

}
