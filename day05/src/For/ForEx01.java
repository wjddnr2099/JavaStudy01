package For;

/*
 * 다중(중첩) For문
 *   
 *   for문 안에 for문이 존재하는 경우
 *   
 *   for(초기값;조건식;증감식){          //행
 *      for(초기값;조건식;증감식) {      //열
 *      }   수행문
 *      System.out.println();
 *   }
 * 
 */
public class ForEx01 {

	public static void main(String[] args) {
	
		int i,j,k;
		
		/*
		for(i=2; i<=9; i++) {
			for(j=1; j<=9;j++){
				System.out.printf("%d x %d = %d\n",i,j,i*j);	
			}
			System.out.println();
		}
		*/

		for(i=1; i<=9; i++) {
			for(j=1; j<=i;j++){
				// System.out.printf("%d x %d = %d\n",i,j,i*j);	
				System.out.print("★");
			}
			System.out.println();
		}
	}

}
