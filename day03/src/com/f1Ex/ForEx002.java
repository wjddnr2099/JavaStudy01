package com.f1Ex;

import java.io.IOException;

/*
 * 문제]
 *  양의 실수만 입력받아 입력받은 합의 평균을 구하는 프로그램을 구현하시오
 *  단, 음의 실수를 입력하면 계산하시오.
 * 
 *  양의 실수 : 1.1 
 *  양의 실수 : 2.2 
 *  양의 실수 : 3.3 
 *  양의 실수 : 4.4 
 *  양의 실수 : -5.5
 *  평균 : 2.2 
 */


import java.util.*;

public class ForEx002 {

	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);

		double avg =0,cnt=0, sum=0, n =0;  // 변수 cnt, sum, n 생성 및 0 값 할당
		
		for(;n>=0;) {   // n이 0보다 큰 동안 반복
			
			// 1 실수 입력
			System.out.println("수입력:");
			n = sc.nextDouble();
			
			
			cnt = cnt + 1; // cnt++;
			
			// 2-1 입력이 양수이면 총합계산
			if(n >= 0 ) {
				sum = sum + n;	
			} else { // 음수 
				// 2-2 입력이 음수 이면 평균 계산
				avg = sum / cnt;
			}
		}
		System.out.println(avg);
		
	
	}

}
