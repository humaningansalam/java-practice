package com.chap03;
import java.util.Scanner;
//������ �����ε�

class Info21{
	String name;
	int age;
	
	
	public Info21() {
		this.name = "�ʱⰪ";
		this.age = -1;
	}
	
	public Info21 (String n, int a) {
		this.name = n;
		this.age = a;
	}
	
	void print() {
		System.out.println(name + "," + age);
	}
}
public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info21 in = new Info21();
		Scanner scan = new Scanner(System.in);
		
		in.print();
		
		Info21 in2 = new Info21("asd", 66);
		in2.print();
		

	}

}
