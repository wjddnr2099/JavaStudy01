package day2;

import java.io.IOException;

/*
 * 문제]
 * 입력받은 수가 3의 배수인지 판별하는 프로그램을 구현하시오
 * 
 * 정수의 입력 : 129
 * 129 = 3의 배수입니다.
 * 
 */

import java.util.*;


public class IfEx04 {

	public static void main(String[] args)  throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("정수 입력 :");
		
		int n = sc.nextInt();
		
		if (n% 3==0) {
		System.out.println(n+"는 3의 배수입니다.");
		}
		else {
			System.out.println(n+ "는 3의 배수가 아닙니다.");
		}
		

	}

}
