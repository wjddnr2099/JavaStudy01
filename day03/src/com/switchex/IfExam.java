package com.switchex;

import java.io.IOException;

/*
 * 삼항 연산자
 * -세개의 항으로 이루어졌다.
 * 
 * 조건항? 항1      : 항2 ;
 *      참일수행    거짓일 때 수행
 * if (조건항){}   else{}
 * 
 * 
 */


public class IfExam { 

	public static void main(String[] args)throws IOException {
		
		int a = 10;
		
		String str = a == 10 ? "같다.": "같지 않다."; 
		
		if(a==10)
			str = "같다.";
		else
			str = "같지않다.";
		
		System.out.println(a==10 ? "같다": "같지않다.");

	}

}
