package chap04;

class Point implements Cloneable{
	int x, y;
	
	Point(int x, int y){
		this.x = x; 
		this.y = y;
	}
	
	public String toString() {
		return "x=" + x +", y=" +y;
	}
	
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException e) {}
		return obj;
	}
	
}
/*
 * clone() 자신을 복제하야. 새로운 인스턴스를 생성하는 일을 한다.
 * cloneable 인터페이스를 구현한 클래스의 인스턴스만, clone을 통한 복제가 가능하다.
 * 그 이유는 인트선트 데이터를 보호하기 위해서이다.
 */
public class CloneEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point original = new Point(3,5);
		Point copy = (Point)original.clone(); //복제(clone) 해서 새로운 객체를 생성
		System.out.println(original.toString());
		System.out.println(copy.toString());

	}

}
