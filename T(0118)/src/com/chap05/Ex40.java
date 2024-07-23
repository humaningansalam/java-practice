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
		//���� �ڽ� ����
		AppleBox aBox = new AppleBox();
		OrangeBox oBox = new OrangeBox();
		
		//������ �ڽ��� ����ּ���
		aBox.set(new Apple());
        oBox.set(new Orange());
        
		//�ڽ��� ������ ������
		Apple ap = (Apple)aBox.get();
		Orange og = (Orange)oBox.get();
		
		System.out.println(ap + "," + og);
	}

}
