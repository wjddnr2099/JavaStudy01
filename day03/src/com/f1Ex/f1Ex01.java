package com.f1Ex;

/*
 *  for
 *  -특정한 명령들을 정해진 규칙에 따라 반복처리 할 때 사용하는 제어문
 * 
 *  형식
 *  for(초기값; 조건식; 증감값){
 *  반복 수행되는 문장들;
 *  }
 *  
 *  초기값 : 가장 먼저 한번만 수행
 *  조건식 : 초기값 다음으로 수행되는 식이며 반복할 때 마다 
 *         한 번씩 비교하여 반복을 수행할 것인지 아니면 반복을 벗어날 것인지를 결정함
 *  증감식 : 반복 수행할 때마다 조건식에 비교하기 전에 항상 수행되며, 
 *         변수값을 증가 또는 감소시켜서 반복을 수행함
 */

// 1부터 5까지 세로 한 번, 가로 한 번씩 출력하는 프로그램을 구현하시오

public class f1Ex01 {

	public static void main(String[] args) {
		
		
     for (int i = 1; i<=5; i++ ) {
    	 System.out.println(i);
     }
     
     int sum = 0; 
     int j =0;
     
     
     System.out.println();
     for (int i = 1; i<=5; i++ ) {
    	 System.out.print(i+"  ");
     }
     
     System.out.println();
     for(int i = 1; i<= 10; i++) {
    	 sum += i;
     }
     System.out.println("1~10까지의 합계 :"+sum);
     
     System.out.println();
     System.out.println();
     for(int i= 1; i<=10; i++,j--) {
    	 System.out.printf("%d\t\\t%d\n",i,j);
     
     }
	}

}
