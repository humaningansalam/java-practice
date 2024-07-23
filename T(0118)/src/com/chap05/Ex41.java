package com.chap05;

class Box<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}
public class Ex41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� �ڽ� ����
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();
		
		//������ �ڽ��� ����ּ���
		aBox.set(new Apple());
        oBox.set(new Orange());

		//�ڽ��� ������ ������
		Apple ap = (Apple)aBox.get();
		Orange og = (Orange)oBox.get();
		
		System.out.println(ap + "," + og);
		
	}

}