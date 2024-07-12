package com.f1Ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 두 개의 정수를 입력받아 그 사이에 존재하는 정수들의 합계를
 * 구하는 프로그램을 구현하시오.
 * 
 * ex)
 * 3,5 => 3+4+5 = ?
 * 5,3 => 3+4+5 = ?
 * 
 */

import java.util.*;
public class ForEx004 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		// n1,n2 변수 선언      //sum 변수 0값 할당.
		int n1, n2, i, sum=0;
		
         //문구 입력
		 System.out.print("첫번째 정수 입력:");
		 n1= sc. nextInt(); // n1 스케너로 구동
		 
		 System.out.print("두 번째 정수입력");
		 n2 = sc. nextInt(); // n2 스케너로 구동
		 
		 //조건
		 if (n1 > n2 ) { // n1이 n2 보다 클 경우 구동
			 n1= n1^n2;  
			 n2= n2^n1;
			 n1= n1^n2;		
			}
		 //반복처리 
		 for(i= n1; i <= n2; i++) { // i를 n1으로 할당 - i가 n2 보다 작거나 같을때 - i를 더한다
			 sum += i;   //  sum = sum +i; - 합계에 n1의 숫자부터  반복하여 더한다.
		 }
		System.out.println("두 수의 사이의 합계:"+sum); 
	
	}

}
