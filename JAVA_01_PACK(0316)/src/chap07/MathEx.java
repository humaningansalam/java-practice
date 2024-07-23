package chap07;
//import java.lang.Math.*;
import static java.lang.Math.*;

public class MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double val = 90.77775;
		System.out.println(round(val));  //반올림
		System.out.println();
		
		System.out.printf("%f %f \n", 1.1, ceil(1.1));//올림
		System.out.printf("%f %f \n", 1.5, floor(1.5));//버림
		System.out.printf("%f %d \n", 1.1, round(1.1));//반올림
	}

}
