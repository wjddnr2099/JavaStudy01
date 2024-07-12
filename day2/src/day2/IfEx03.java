package day2;

import java.io.IOException;
/*
 * 문]
 * 임읭의 정수를 입력 받은 후
 * 정수가 짝수인지 홀수인지 판정하는 프로그램을 구현하시오.
 */
import java.util.*;


public class IfEx03 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수입력 :");
		int n = sc.nextInt();

				
			if(n% 2==0) {
				System.out.println(n+" 은 짝수 입니다");
			}
			else {
				System.out.println(n+" 은 홀수 입니다");
			}
			
	}

}
