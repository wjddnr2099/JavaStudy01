package For;
/*
 * 문제]
 *     while문을 활용하여  -1이 입력될때까지 정수를 계쏙 입력받아 합계를
 *     구하고 평규능 구하는 프로그램을 작성하시오.
 * 
 */
import java.util.*;
public class LoopEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum=0 , cnt=0;
		int n;
		
		System.out.print("정수 입력:");
		n = sc.nextInt();
		
		int i ;
		
		while(n != -1) {
			sum += n;
			cnt ++;
			System.out.print("정수입력:");
			n = sc.nextInt();
	}
	
	if (cnt ==0) {
		System.out.println("입력된 정수가 없습니다.");
	}else {
		System.out.print("입력된 정수는"+cnt+"입니다");
		System.out.print("입력된 정수는");
		
	}
	}

}
