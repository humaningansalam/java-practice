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
		//과일 박스 생성
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();
		
		//과일을 박스에 담아주세요
		aBox.set(new Apple());
        oBox.set(new Orange());

		//박스를 과일을 꺼낸다
		Apple ap = (Apple)aBox.get();
		Orange og = (Orange)oBox.get();
		
		System.out.println(ap + "," + og);
		
	}

}