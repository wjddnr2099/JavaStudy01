package day2;

/*
 * 문제]
 * 두 정수를 입력받아 큰 수를 알아맞히는 프로그램을 구현하시오
 * 세개의 정수를 입력받아 큰 순서대로 프로그램을 구현하시오
 * 
 * 첫번째 정수 :5
 * 두번째 정수 :2
 * 세번째 정수 :4
 * 
 *  순서5 4 2
 * 
 * 큰수 :5, 작은수:2
 * 
 */


import java.util.*;

import java.io.*;

public class IfEx09 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		// 정수 a,b,
		//큰수 c
		//작은수 d
		
		int a,b,c,d;
		
		// a입력
	  System.out.println("첫번째 정수를 입력하시오 :");
	  a= sc.nextInt();
	   // b입력
	  System.out.println("두번쨰 정수를 입력하시오 :");
	  b= sc.nextInt();
	// c입력
		  System.out.println("세번쨰 정수를 입력하시오 :");
		  c= sc.nextInt();
	  
	 
	  if (a > b) {
		  System.out.println("첫번째 정수"+a+"이 두번째 정수"+b+"보다 큰 수입니다." );
	  }
	  if (b> a) {
		  System.out.println("두번째 정수"+b+"이 첫번째 정수"+a+"보다 큰 수입니다." );
	  }
	  
		
	  
	 
	  
	  
	 
	

	}

}
