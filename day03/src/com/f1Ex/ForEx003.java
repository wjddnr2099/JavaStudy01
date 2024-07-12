package com.f1Ex;

/*
 * 문제 ]
 * 
 * 무한대로 두 개의 정수를 입력받아서 합을 구하는 프로그램을 구현하시오
 * 
 */

import java.util.*;

public class ForEx003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int n1, n2 ;   //변수 선언
		
		for(;;){ // 무한 수식
			System.out.println("첫번째 정수 :");
			n1 = sc.nextInt();
			if(n1==0) //조건 n1이 0과 같을 떄
				break;                 // 멈춘다.
			System.out.println("첫번째 정수 :");
			n2 = sc.nextInt();
			System.out.println("두 수의 합계는"+(n1+n2)+"입니다");	
		}
		

	}

}
