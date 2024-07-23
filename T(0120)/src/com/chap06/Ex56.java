package com.chap06;

import java.util.StringTokenizer;

public class Ex56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "삶이 그대를 속일지라도 슬퍼하거나 노여워말라.";
		
		StringTokenizer st = new StringTokenizer(str, " ");
		
		System.out.println("space 몇개?? "+ st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
