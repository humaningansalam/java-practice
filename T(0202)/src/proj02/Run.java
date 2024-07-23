package proj02;

public class Run {

	Score sc = new Score();
	

	public Run() {
		for(;;) {
			
			int score = new Input().scinput(sc);


			if(score >= 60 && score <= 100) {
				
				sc.setAstu(sc.getAstu() + 1);
				sc.setStu(sc.getStu() + 1);
			}
			
			if(score < 60 && score >= 0) {
				
				sc.setFstu(sc.getFstu() + 1);
				sc.setStu(sc.getStu() + 1);
			}

			if(score < 0) {
				System.out.println("break");
				break;
			}
			
		}
		new Output().scoutput(sc);
	}
}
