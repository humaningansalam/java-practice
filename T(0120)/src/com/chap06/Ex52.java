package com.chap06;

public class Ex52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] names = new String[3];
		
		names[0] = "�达";
		names[2] = "�̾�";
		names[1] = "����";

		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		

		
		String[] address = {"����", "����", "����", "�Ǳ�"};
		names = address;
		
		for(String s : names) {
			System.out.println(s);
		}
	}

}
