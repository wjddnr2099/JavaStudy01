package loopex;

/*
 *  년도와 월을 입력받아 달력을 출력하는 프로그램을 구현하시오.
 *  단, 윤년과 평년, 요일도 나타나게 하시오.
 *  
 *  년도 입력:
 *  월 입력:
 *  
 *  ------ 2024년 7월 -----
 *  월  화  수  목  금  토  일
 *  1  2   3  4   5  6  7
 *  8  9  10 11  12 13 14
 *  15 16 17 18  19 20 21
 *  22 23 24 25  26 27 28
 *  29 30 31
 *  ----------------------
 * 
 */

import java.io.*;

public class LoopEx004 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int year=1, month=1, start, end;
		boolean bool = false;
		
		int base = 2024; //2024년 1월 1일 일요일 기준
        int pos = 0;
        
        do {
			
		} while (year < 0 || year >9999);
        System.out.println();
        
        
        do {
        	
        }while(month <1 || month >12);
        
        int i =1;
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        while(i<=31) {
        	if(i%7 == 0) {
        		System.out.println(i);
        }else {
        	System.out.print(i+"\t");
        }
		i++;
		
		

	}
	}
}
