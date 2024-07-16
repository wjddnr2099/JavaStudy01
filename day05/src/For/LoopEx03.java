package For;

/*
 * a부터 z까지 출력하는 프로그램 구현
 * 
 */

public class LoopEx03 {

	public static void main(String[] args) {
		
		char c = 'a';
		
		do {
			System.out.println(c);
			c = (char)(c+1);
		}while( c <='z'); 

	}

}
