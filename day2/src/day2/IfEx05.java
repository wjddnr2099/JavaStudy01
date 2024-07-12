package day2;
/*
 * 문]
 * 두개의 정수와 연산자를 입력받아 계산하는 프로그램을 구현하시오
 * 
 * ex)
 *    첫번째 정수 : 3
 *    연산자 : +
 *    두번째 정수 : 5
 * 
 *    결과 출력 
 *    3+5=8
 * 
 * 
 * 
 */
import java.util.*;

import java.io.*;


public class IfEx05 {
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		 
		/*
		 int first = 0;
		 int second =0 ;
		 String operator = "";
		 

		 System.out.print("숫자 입력 :");
		 first = sc.nextInt();
		 
		 System.out.print("연산자 입력 :");
		 operator = sc.next();
		 
		 System.out.print("숫자 입력 :");
		 second = sc.nextInt();
		 
		 if( operator.equals("+") ) {
			System.out.println(first + second); 
		 }
		 else if (operator.equals("-")) {
			 System.out.println(first - second); 
		 }
		 else {
			 System.out.println("연산자 미식별");
		 }
	*/
		 int i,j;
		 char op;
		 
		 System.out.print("첫번째 정수 입력:");
		 i=Integer.parseInt(br.readLine());
		 System.out.print("연산자 입력:");
		 op=(char) System.in.read();
		 System.in.read();
		 System.in.read();
		 System.out.print("두 번째 정수입력");
		 j = Integer.parseInt(br.readLine());
		 
		 if (op == '+') {
			 System.out.printf("%d %c %d = % d",i ,op, j ,(i+j));		
		}
		 else if (op == '-') {
			 System.out.printf("%d %c %d = % d",i ,op, j ,(i-j));		
		}
		 else if (op == '*') {
			 System.out.printf("%d %c %d = % d",i ,op, j ,(i*j));		
		}
		 else if (op == '/') {
			 System.out.printf("%d %c %d = % d",i ,op, j ,(i/j));		
		}
		 else {
			 System.out.printf("연산자가 아닙니다.");		
		}
		 
		 	 
		
	}

}
