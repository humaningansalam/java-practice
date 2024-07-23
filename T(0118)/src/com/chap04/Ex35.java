package com.chap04;
import java.util.Scanner;

class Student{
	
	
	//멤버필드
	String id;
	String name;
	
	public Student() {
		System.out.println("기본 생성자 시작");
	}
	
	

	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	void output() {
		System.out.println(this.id);
	}
}
public class Ex35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student[] stu = new Student[3];//실인수
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<stu.length; i++) {
			stu[i] = new Student();
			System.out.print(" 아이디 입력 :");
			stu[i].id = scan.next();
			System.out.print(" 이름 입력 :");
			stu[i].name = scan.next();
		}
		
		for(int i=0; i<stu.length; i++) {
			System.out.println(stu[i].toString());
		}

	}

}
