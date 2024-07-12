package day2;

/*
 * 정수로 된 액수를 입력받아 오만원권, 만원권, 천원권 , 500원짜리 동전, 100원짜리 동전
 * , 50원짜리 동전,10원짜리 동전,1원짜리 동전이 각각 몇개인지 알아보는 프로그램을 구현하시오.
 * 
 * 금액 입력 >>65376
 * 5만원 1장
 * 1만원 1장
 * 1천원 5장
 * 100원 3개
 * 50원 1개
 * 10원 2개
 * 1원 6개
 *  

 */
import java.util.*;
import java.io.*;
public class IfEx14 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		
		final int a = 50000;
		final int b = 10000;
		final int c = 1000;
		final int d = 500;
		final int e = 100;
		final int f = 50;
		final int g = 10;
		final int h = 1;
		
		int i,j; // i=나머지 j=금액
		
		System.out.println("금액을 입력하시오 :");
		j = Integer.parseInt(br.readLine());
		
		i = j / a;
		j = j % a;
		
		if (i > 0) {
			System.out.println("오만원권"+i+"장 입니다.");		//5만원권
		}
		i = j / b;
		j = j % b;
		
		if (i > 0) {
			System.out.println("만원권"+i+"장 입니다.");		//1만원권
		}
		i = j / c;
		j = j % c;
		
		if (i > 0) {
			System.out.println("천원권"+i+"장 입니다.");		//천원권
		}
		i = j / d;
		j = j % d;
		
		if (i > 0) {
			System.out.println("오백원권"+i+"개 입니다.");		//오백원권
		}
		i = j / e;
		j = j % e;
		
		if (i > 0) {
			System.out.println("백원권"+i+"개 입니다.");		//백원권
		}
		i = j / f;
		j = j % f;
		
		if (i > 0) {
			System.out.println("오십원권"+i+"개 입니다.");		//오십원권
		}
		i = j / g;
		j = j % g;
		
		if (i > 0) {
			System.out.println("십원권"+i+"개 입니다.");		//십원권
		}
		i = j / h;
		j = j % h;
		
		if (i > 0) {
			System.out.println("일원권"+i+"개 입니다.");		//일원권
		}

		
	}

}
