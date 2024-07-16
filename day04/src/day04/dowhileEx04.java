package day04;

/*
 * 두 개의 정수를 입력받아 그 사이에 존재하는 정수들의 합계를
 * 구하는 프로그램을 구현하시오.
 *  
 */

import java.util.*;

public class dowhileEx04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 두 정수 사이의 합계를 저장할 변수
		int sum = 0;
		
		// 두 개의 정수를 입력받기
		System.out.print("첫번째 정수 :");
		int n1 = sc.nextInt();
		System.out.print("두번째 정수 :");
		int n2 = sc.nextInt();
		
		// 작은 값부터 큰 값까지 반복하기 위해 start와 end를 결정
		int start = Math.min(n1, n2);
		int end = Math.max(n1, n2);
		
		// 두 수가 같은 경우도 처리
		if(start == 0) {
			sum = start;
		}
		else {
			int i = start;
		
			do {
				sum += i;
				i++;
			
		}while(i <= end);
		}
		System.out.println("두 사이의 합계:"+sum);
		
	}

}
