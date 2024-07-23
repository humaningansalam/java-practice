package com.chap03;
import java.util.Scanner;
//생성자 오버로딩

class Info21{
	String name;
	int age;
	
	
	public Info21() {
		this.name = "초기값";
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
