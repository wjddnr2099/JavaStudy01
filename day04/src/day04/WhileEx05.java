package day04;

/*
 *  -1^2+2^2-3^2+4^2-5^2 ~~~~~+100^ 
 *  의 합계를 구하는 프로그램을 작성하시오.
 * 
 */

public class WhileEx05 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		int sign = 1;   // 부호를 결정할 변수 (1이면 양수, -1이면 음수)
		
		while (i <= 100) {
			
			int square = i * i;  // i의 제곱을 계산
			
			// 부호에 따라 합계에 더하거나 빼기
			sum += sign * square;
			
			// 다음 항의 부호를 바꾸기 위해 sign을 변경
			sign = -sign;
			
			// 다음 숫자로 넘어감
			i++;		
		}
		System.out.println("결과" + sum);
		
		
		

	}

}
