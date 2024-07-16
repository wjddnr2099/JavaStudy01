package exam;
/*
 *   continue
 *  - 반복문을 빠져 나가지 않으면서 즉시 다음 
 *    반복으로 넘어가고자 할 때 사용하는 제어문
 * 
 * 
 * 
 */
public class Exam02 {

	public static void main(String[] args) {
		
		int n=0,s=0;
		
		while(n<100) {
			n++;
			if(n%2==0)  // n값이 짝수일 경우
				continue; // 건너뛴다
			s+=n; // 홀수의 합
		}System.out.println(""+s);

	}

}
