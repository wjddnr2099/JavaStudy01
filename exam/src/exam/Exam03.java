package exam;
/*
 *  return
 *  -현재 메소드를 종료할 때 사용되는 제어문
 *   현재 메소드가 void로 지정된 경우, 반환값이 있는 경우로 나뉨
 *   현재 void일 경우 return문 생략
 *   현재 반환값이 잆을 경우는 return문이 필요함.
 * 
 */

import java.util.*;
public class Exam03 {
	public static int add(int a, int b) {
		int c;
		c = a + b;
		return c;
		//System.out.println();
	} 

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int n,s;
		
		System.out.println("정수 입력:");
		n = sc.nextInt();
		
		if(n<0) {
			System.out.println("1이상의 정수를 입력 하셔야 합니다.");
			return;
		}
		s= 0;
		for(int i= 1; i<=n; i++)
			s+=n;
		System.out.println("합계"+s);
		
		
		
		

	}

}
