package proj02;

public class Output {

	public void scoutput(Score sc) {
		System.out.println("총 학생수 :" + sc.getStu());
		System.out.println("통과 학생 :" +  sc.getAstu());
		System.out.println("미통과 학생 :" +  sc.getFstu());
	}
}
