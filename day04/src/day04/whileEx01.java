package day04;

/*
 * 문제]
 * 사용자로부터 하나의 정수를 입력받아 입력받은 수만큼
 * "Hello World"를 출력하는 프로그램을 구현하시오.
 */

import java.util.Scanner;

	public class whileEx01 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int num;
			System.out.print("정수입력:");
			
			num = sc.nextInt();
			
			int i =1;
//			while(i<=num) {
//				System.out.println("Hello World");			
//				i++;
//			}
		}
	}