package com.chap06;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date today  = new Date();
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(dateForm.format(today));
		
		SimpleDateFormat dateForm2 = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm��");
		System.out.println(dateForm2.format(today));
	}

}
