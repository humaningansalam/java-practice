package com.chap03;

class MyDate{
	private int day;
	
	/*
	private MyDate() { //��ü�����ȵ�
		
	}
	*/
	public MyDate() {
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getDay() {
		return day;
	}
}

public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate my = new MyDate();
		
		my.setDay(1234);
		
		System.out.println(my.getDay());
		

	}

}
