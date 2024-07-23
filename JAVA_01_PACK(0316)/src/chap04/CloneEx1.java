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
 * clone() �ڽ��� �����Ͼ�. ���ο� �ν��Ͻ��� �����ϴ� ���� �Ѵ�.
 * cloneable �������̽��� ������ Ŭ������ �ν��Ͻ���, clone�� ���� ������ �����ϴ�.
 * �� ������ ��Ʈ��Ʈ �����͸� ��ȣ�ϱ� ���ؼ��̴�.
 */
public class CloneEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point original = new Point(3,5);
		Point copy = (Point)original.clone(); //����(clone) �ؼ� ���ο� ��ü�� ����
		System.out.println(original.toString());
		System.out.println(copy.toString());

	}

}
