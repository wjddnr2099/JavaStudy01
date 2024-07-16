package day04;

/*
 *  do {
 *  실행문;
 *  실행문;
 *  증감
 *   }while();
 *  싱행문 무조건 한번은 실행한다. 
 */


import java.util.*;
public class dowhileEx01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int subject;
		do {
			System.out.println("점수:");
			subject = sc.nextInt();
		}while(subject < 0 || subject >100);

	}

}
