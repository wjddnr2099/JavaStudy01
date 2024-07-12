package com.switchex;
/*
 * 문제]
 * 사용자로부터 알파벳 한 문자를 입력받아
 * 소문자를 입력 했을 경우 대문자로 or
 * 대문자를 입력 했을 경우 대문자로
 * 변환하는 프로그램을 구현하시오.
 * 
 * 문자 입력 :A 
 * 값 : a
 *
 * 문자 입력 : a
 * 값 : A
 * 
 */
import java.io.*;

public class IfExam01 {

	public static void main(String[] args)throws IOException {
		
		//주요 변수 선언
		char ch;
		int n;
		
		System.out.println("문자 입력:");
		
		n = System.in.read();
		// System.out.println(n);
		ch = (char)n;
		
		if(n >= 'A' && ch <='Z' ) {//입력값이 대문자라
			ch+=32; //65는 아스키코드 값으로 대문자 A--> A + 65 = 97
			       //97은 아스키 코드값 소문자 a임
			ch=(char)(n); //정수형 문자로 변환시킨
			System.out.println(ch);
		}
		else if (n >= 'a' && n <='z') { //입력 값이 소문자 라면
			ch+=32; 
		    ch=(char)(n); 
		    System.out.println(ch);
		}
		else {
			System.out.println("입력 오류");
		}
	}
	
}