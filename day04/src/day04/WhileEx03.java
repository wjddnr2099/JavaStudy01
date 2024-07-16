package day04;

/*
 *  문제]
 *  사용자가 입력하는 정수를 계속 더한다.
 *  단, 0이 입력되면 지금까지 입력된 정수의 합계를 구하는 프로그램을 구현하시오
 *  
 *  while문 사용
 * 
 */
import java.util.*;

public class WhileEx03 {

	public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       int sum = 0; // 입력된 정수의 합계를 저장할 변수
       int n,a;       //사용자가 입력하는 정수를 저장할 변수

       while(true) {
	   System.out.print("정수입력");
	   n = sc.nextInt(); // 사용자가 입력한 정수를 읽음

	   if(n == -1) {
		   break;    // 사용자가 0을 입력하면 반복을 종료
	   }
	   sum += n;     // 입력된 정수를 합계에 더함
    } 
       
       // 지금까지 입력된 정수의 합계를 출력
       System.out.printf("지금까지 입력된 정수의 합계 : %d",sum%n);  
	}

}
