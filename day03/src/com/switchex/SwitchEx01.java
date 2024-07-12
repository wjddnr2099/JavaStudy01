package com.switchex;

/*
 *     switch ~ case 문
 * 
 *    -조건값에 따라 하나의 처리문이나 여러개의 처리문을 한번에 수행
 *    -조건값으로 올 수 있는 자료형 : 정수형, 문자형
 *    -       "올 수 없는 자료형 : long, boolean, float, double 
 * 
 *         avg = sum .5.0;
 *        (int)(avg)
 *        
 *    - break 문은 하나의 조건값마다 필요함
 *      만약 break문이 없을 경우 다음 break문을 만날때까지 계속 수행한다.
 *    - case 문과 일치하는 경우가 없다면 default 문을 수행
 *    
 *      주의사항 ! : case 뒤에 오는 조건값이 중복되지 않도록 해야함        
 * 
 * 문제]
 *   세 과목의 점수를 입력받아 총점과 평균을 구한 뒤
 *   평균을 이용하여 학점을 
 * 
 * 
 */
 import java.io.*;

public class SwitchEx01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int kor,eng,mat,sum = 0;
		float avg;
		
		System.out.println("국어 점수 :");
		kor = Integer.parseInt(br.readLine());
		System.out.println("영어 점수 :");
		eng = Integer.parseInt(br.readLine());
		System.out.println("수학 점수 :");
		mat = Integer.parseInt(br.readLine());
		
		sum = kor + eng + mat ;
		
		avg = sum / 3.f;
		
		System.out.printf("평균은 %f%n", avg);
		
		switch ((int)(avg/10)) {
		case 10 :
		case 9 :
			System.out.println("당신의 학점 A입니다.");
			break;
		case 8 :
			System.out.println("당신의 학점 B입니다.");
			break;
		case 7 :
			System.out.println("당신의 학점 C입니다.");
			break;
		case 6 :
			System.out.println("당신의 학점 D입니다.");
			break;
		default:
			System.out.println("당신의 학점 F입니다.");
		
			
			
		
		}
			

	}

}
