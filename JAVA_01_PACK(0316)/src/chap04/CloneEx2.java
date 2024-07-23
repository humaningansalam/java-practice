package chap04;

import java.util.Arrays;

public class CloneEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int[] arrCopy = arr.clone();
		/*
		 * 예를 들어 ,배열의 경우
		 * 복제된 인스턴스도 같은 배열의 주소를 갖기 때문에 복제된 인스턴스의 작업이 원래의 인트선트에 영향을 미치게 된디.
		 * 이런경우 clone메소드를 옵라이딩해ㅐ서 새로운 배열을 생성하고 배열의 내용을 복사하도록 해야한다.
		 * 
		 * 배열도 객체이다.
		 * Oject 클래스를 살속ㄱ받았다. 동시에 Cloneable 인터페이스가 구현되어 있다/
		 * 그래서 Object 클래스의 멤버들은 모두 상속받는다.
		 * 이예제는 원본과 같은 타입으로 반환하기 때문에 형변환이 필요 없는 상태이다.
		 */
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrCopy));
		
		arrCopy[0] = 6;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrCopy));

	}

}
