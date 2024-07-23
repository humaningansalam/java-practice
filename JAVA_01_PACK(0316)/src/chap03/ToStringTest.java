package chap03;

public class ToStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = new String("Hanna");
		java.util.Date today = new java.util.Date();
		
		System.out.println(str);
		System.out.println(str.toString());
		System.out.println(today);
		System.out.println(today.toString());
		
		/*
		 * String 클래스의 toString은
		 * String 인스턴스가 갖고있는 문자열을 반환하도록 오버라이딩 되어 있음
		 * 
		 * Date 클래스의 경우
		 * Date 인스턴스가 갖고 있는 날짜와 시간을 문자열로 변환하여 반환하도록 오버라이딩 도ㅚ 어 있음
		 */

	}

}
