package com.chap03;
//클래스, 생성자, 멤버필드, 메소드
//갹체생성
class Data{
	String name;
	int age;
	
	public Data() {
		name = "초기값";
		age = -1;
		System.out.println("새성자 완료");
	}
	
	void print() {
		System.out.println(name + "," + age);
	}
}

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data = new Data();
		data.print();

	}

}
