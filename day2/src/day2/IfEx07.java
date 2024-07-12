package day2;
 
/*
 * if(조건식){
 *    조건식1의 결과 true일때 수행
 *   if(조건식){
 *   조건식 1과 조건식2가 모두 true일때 수행  
 *   }else{
 *     조건식1은 true이고 조건식2는 false일때 수행
 * }
 * else{
 * 조건식1 이 false 일때 
 * }
 */

import java.util.*;
import java.io.*;

public class IfEx07 {
	

			public static void main(String[] args) throws IOException{
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				Scanner sc = new Scanner(System.in);
				
				
				int a,b,c,d,e,f,g =0;
				char grade = ' ', op;
				
				// 1 국어점수 입력
				System.out.println("국어 :");
				a=Integer.parseInt(br.readLine());
				// 2 영어점수 입력
				System.out.println("영어 :");
				b=Integer.parseInt(br.readLine());
				// 3 수학점수 입력
				System.out.println("수학 :");
				c=Integer.parseInt(br.readLine());
			    // 4 사회점수 입력
				System.out.println("사회 :");
				d=Integer.parseInt(br.readLine());
				// 5 과학점수 입력
				System.out.println("과학 :");
				e=Integer.parseInt(br.readLine());
				
				// 6 총점 구하기	
				f = a+b+c+d+e;
			
				// 7 평균 구하기
				g = f/5;
				
				// 등급
	
		
				if(g >= 90) {
					grade = 'A';  //A+ : 98점 이상일떄는 A+, A : 95~97 ,94점 미만일 경우 :A-
					if (g>=98) {
						op='+';
					}else if (g<94)
						op='-';					
				}
				else if(g >= 80) {
					grade = 'B'; 
				}
				else if(g >= 70) {
					grade = 'C'; 
				}
				else {
					grade = 'F';
				}
				
				System.out.printf("당신의 학점은" + g  + grade +  "입니다." );

	}

}
