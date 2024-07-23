package chap02;

public class HashCodeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 =new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		//문자열 내용이 같은 str1, str2에 대해서 hashCode 호출하면?? 같은결과값
		//System.identityHashCode :객체의 주소값으로 해시코드를 생성 -> 모든 객체에 대해서 다른 해시코드값을 반환
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		/*
		 * 해싱이란?
		 * 데이터 관리 기법중의 하나 / 다량ㅇ의 데이터를 저장하고 검색하는데 유용
		 * 해시함수느 찾고자하는 값을 입력하면, 그값이 저장위치를 알려주는 해시코드를 반환
		 * 32bit = 4Byte // 주소 = 4바이트 JVM
		 * 64bit = 8Byte // 주소 = 4바이트 JVM
		 * 클래스의 인스턴스 변수 값으로 객체의 같고 다름을 판단해야 하는 경우가 있가면??
		 * equals 메소드 + hashCode 메소드도 적절히  활용해서 같고 다름을 판단해야한다.
		 * 
		 * 해싱기법(HashMap, HashSet) : 반드시 hashCode 메소드를 오버라이딩해야 한다.
		 */

	}

}
