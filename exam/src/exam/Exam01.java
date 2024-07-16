package exam;
/*
 * break 
 * -반복문을 즉시 중지할 때 사용
 * 
 * : while, do~ while, for,switch ~ case
 *
 * 
 * 
 */
public class Exam01 {

	public static void main(String[] args) {
		
		int n=0, s=0;
		
		while(true) {
			n++;
			s+=n;
			if(n>=10)
				break;
		}System.out.println("결과"+s);

	}

}
