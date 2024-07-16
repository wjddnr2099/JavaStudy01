package exam;

/*
 *  break label
 *  -break 문과는 달리 여러개의 반복을 빠져 나갈때 사용함
 *  
 *  형식
 *  레이블면:
 *  for(){
 *    for(){
 *    
 *    break 레이블명:
 *    레이블명이 있는 곳까지 한번에 빠져나감
 *    
 *    }
 *  }
 * 
 * 
 */
public class Exam04 {

	public static void main(String[] args) {
		
		One :for(int i=0; i<5; i++) {
		  Two : for(int j=0; j<3; j++) {
			    if(j == 2) //break One;
			    	continue One;
			    System.out.print(j+"x"+i+" ");
		}
		  System.out.println();
	}
}
			

	}

}
