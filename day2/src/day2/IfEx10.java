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


public class IfEx10 {

	public static void main(String[] args)  throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		
		
		int a,b,c;
		int temp;
		
		//입력
		System.out.println("첫번째 정수를 입력하시오 :");
		a = sc.nextInt();
		
		System.out.println("두번째 정수를 입력하시오 :");
		b = sc.nextInt();
		
		System.out.println("세번째 정수를 입력하시오 :");
		c = sc.nextInt();
		
	
		//조건
		// temp = 빈공간
		
		if (b>=a && b>=c) {
			 temp = a;  //첫번째 정수가 임시공간 저장
			 a = b; //두번째 정수가 첫번째 공간에 저장됨
			 b = temp;  //두번째 공간에 임시공간에 저장되어 있는 첫번째 정수가 저장됨		 			
		}
		else if (c>=a && c>=b) {
			temp= a;  //첫번째 정수가 임시공간 저장
			 a = c;  //세번째 정수가 첫번째 공간에 저장됨
			 c = temp; //임시공간에 저장된 정수가 세번째 정수가 저장된 공간에 저장됨		
		}
		if (c>=a && c>=b) {
			temp =b;
			b=c;
			c=temp;	
		}
		
		//판별
		System.out.println(a+">="+b+">="+c);
		
		}
		
	}

