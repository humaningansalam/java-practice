package com.chap02;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex14 {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		System.out.print("문자를 입력하세요 :");
		String str = br.readLine();
		System.out.println("문자 " + str);
		
		//문자는 안되서 Integer.parseInt() 사용
		int num = Integer.parseInt(str);
		System.out.println("숫자 " + num);
		
	}

}
