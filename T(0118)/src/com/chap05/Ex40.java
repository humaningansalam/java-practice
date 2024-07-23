package com.chap05;

class Apple{
	public String toString() {
		return "I am an apple";
	}
}

class AppleBox{
	private Apple ap;
	
	public void set(Apple a) {
		ap = a;
	}
	
	public Apple get() {
		return ap;
	}
}

class Orange{
	public String toString() {
		return "I am an orange.";
	}
}


class OrangeBox{
	private Orange or;
	
	public void set(Orange o) {
		or = o;
	}
	
	public Orange get() {
		return or;
	}

}
public class Ex40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//과일 박스 생성
		AppleBox aBox = new AppleBox();
		OrangeBox oBox = new OrangeBox();
		
		//과일을 박스에 담아주세요
		aBox.set(new Apple());
        oBox.set(new Orange());
        
		//박스를 과일을 꺼낸다
		Apple ap = (Apple)aBox.get();
		Orange og = (Orange)oBox.get();
		
		System.out.println(ap + "," + og);
	}

}
