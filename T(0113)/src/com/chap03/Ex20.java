package com.chap03;
//Ŭ����, ������, ����ʵ�, �޼ҵ�
//��ü����
class Data{
	String name;
	int age;
	
	public Data() {
		name = "�ʱⰪ";
		age = -1;
		System.out.println("������ �Ϸ�");
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
