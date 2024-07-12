package day2;







import java.util.*;

import java.io.*;


public class IfEx11 {

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
		
		if (a < b) {
			//첫번째 정수가 두번째 정수보다 큰 경우
			//두 정수의 자리를 바꾼다.
			a = a^b;
		    b = b^a;
		    a = a^b;
		}
		if (a < c ) {
			//첫번째 정수가 세번째 정수보다 큰 경우
			//두 정수의 자리를 바꾼다.
			a = a^c;  
		    c = c^a;
		    a = a^c;
		}
		if (b < c) {
			//두번째 정수가 세번째 정수보다 큰 경우
			//두 정수의 자리를 바꾼다.
			b = b^c;
		    c = c^b;
		    b = b^c;
		}
		
		System.out.println("결과 :" +a+","+ b +","+c);
		
		
	}
}