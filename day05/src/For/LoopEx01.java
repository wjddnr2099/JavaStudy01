package For;
/*
 * 문제]
 *  for문을 이용하여 1에서 10까지 덧셈으로 표시하고 합계를
 *  출력하는 프로그램을 구현하시오.
 *  
 *  출력
 *  1+2+3+4+5+6+7+8+9+10=55
 *  
 * 
 */

import java.util.*;
public class LoopEx01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력:");
		int n = sc.nextInt();
		
		int i=0;
		int sum=0;
//		sum = i+j;
		
		for( i = 1; i<=n; i++) {
			System.out.print(i);
			sum = sum + i;
		}
			if(i==n){
				System.out.print("=");
			} else if(i<=n){
				System.out.print("+");
			}
			// sum = sum + i;
			
			
		
		System.out.print(sum);
		

	}

}
