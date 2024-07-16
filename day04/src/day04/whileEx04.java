package day04;

/*
 *문제]
 *정수를 입력받아 짝수이면 다시 입력받고, 홀수 이면 프로그램을 종료하는 프로그램을 구현한다.
 *
 */

import java.util.*;

public class whileEx04 {

	public static void main(String[] args) {

     Scanner sc =new Scanner(System.in);
		
	int n;
	
	while(true) {
		/*
		System.out.println("정수 입력:");	
		n = sc.nextInt();
		if(n % 2 != 0) {
			break;
		}
		*/
		
		System.out.print("나는 자바를 사랑합니다.");
		
		System.out.println("계속 진행하시겠습니다?(y/n)");
		char ch = sc.next().charAt(0);
		
		if(ch=='N' || ch == 'n') {
			break;
		}
	}

	}

}
