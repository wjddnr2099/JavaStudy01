package day04;

/*문제]
 * -50에서 부터1까지 수를 출력하는 프로그램을 작성하시오.
 * 단, 한 라인에 5개의 수만 출력하고, 수들 사이의 간격의 탭으로 조절하시오.
 * 
 * -50 -49 -48 -47 -46 
 * -45 -44 -43 -42 -41
 * .
 * .
 *   0   1
 */
public class whileEx06 {

	public static void main(String[] args) {
		
		int start = -50;
		int current = start;
		int end = 1;
		int count = 0;
		
		while(current <= end) {
			System.out.print(current);  // 숫자 출력
			
			// 마지막 숫자일 경우 줄바꿈을 하지 않고 종료
			if(current == end) {
				break;
			}
			
			System.out.print("\t");   // 숫자 출력 후 탭(\t) 추가
			count++;
			current++;
			
			
			if (count == 5) {   // 한 라인에 5개의 수 출력하고 줄바꿈
				System.out.println();   // 줄바꿈
			    count = 0;
				
			}
			
		}

	}

}
