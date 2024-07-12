package com.f1Ex;

/*
 * 팩토리얼을 계산하는 프로그램을 구현하시오.
 * 
 * 사용자로부터 n이라는 수를 입력받아
 * n까지의 팩토리얼을 구하시오.
 * 
 * n! = 1*2*3*4*5*6 ~ *n
 * 
 * 7! = 1*2*3*4*5*6*7 = 
 * 7의 팩토리얼은 5040 입니다.
 */

import java.util.*;  
public class ForEx005 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  // Scanner 객체를 new로 생성 
		
		// 
		int  n, i,  sum = 1;
		
		System.out.print("팩토리얼을 입력하시오 :");
		n = sc.nextInt();
		
		for(i = 1; i <= n; i++) {
			sum*=i;  
			// sum = sum * i;
		}
		// 1 * 1
		// 1 * 2
		// 2 * 3
		// 6 * 4 =  24 = 1 * 2 * 3 *4
		// 24 * 5
		// 120 * 6
		// 720 * 7 = 5040
		// sum = 24 
		
		System.out.println(n+"의 팩토리얼은"+sum+"입니다.");
		

	}

}
