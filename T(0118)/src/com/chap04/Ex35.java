package com.chap04;
import java.util.Scanner;

class Student{
	
	
	//����ʵ�
	String id;
	String name;
	
	public Student() {
		System.out.println("�⺻ ������ ����");
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

		Student[] stu = new Student[3];//���μ�
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<stu.length; i++) {
			stu[i] = new Student();
			System.out.print(" ���̵� �Է� :");
			stu[i].id = scan.next();
			System.out.print(" �̸� �Է� :");
			stu[i].name = scan.next();
		}
		
		for(int i=0; i<stu.length; i++) {
			System.out.println(stu[i].toString());
		}

	}

}
