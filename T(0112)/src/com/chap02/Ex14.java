package com.chap02;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex14 {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		System.out.print("���ڸ� �Է��ϼ��� :");
		String str = br.readLine();
		System.out.println("���� " + str);
		
		//���ڴ� �ȵǼ� Integer.parseInt() ���
		int num = Integer.parseInt(str);
		System.out.println("���� " + num);
		
	}

}
