package chap06;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String 클래스는 인스턴스를 생성할때, 지정된 문자열을 변경할수 없다.
		//StringBuffer 클레스는 변경 가능하다.
		//StringBuffer는 내부적으로 문자열을 편집하기 윈한 버퍼를 가지고 있으며, 크기를ㄹ 지정할 수있다.(16)
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		//StringBuffer클래스는 equals메소드를 오버라이딩안함
		System.out.println("sb == sb2 ?" + (sb == sb2));
		System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));
		
		//StringBuffer의 내욜을 String으로 변환한다.
		String s = sb.toString();
		String s2 = sb2.toString();
		
		System.out.println("s.equals(s2) ? " + s.equals(s2));

	}

}
