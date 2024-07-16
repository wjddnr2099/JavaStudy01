package day04;

/*  문제]
 *  국어,영어,수학 점수를 입력받아 총점, 평균,학점을 구하는 프로그램을 구현하시오.
 *  단, 국어,영어,수학점수는 (0~100)점 범위를 벗어나면 안됨
 *   평균은 소수점 세자리까지만 표시
 */

import java.io.*;

public class dowhileEx02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int kor, eng, math,sum=0;
		char grade =0;
		float avg = 0.0f;
		
		do {
			System.out.println("국어점수:");
			kor = Integer.parseInt(br.readLine());	
		}while (kor < 0 || kor > 100);
			do {
				System.out.println("영어점수:");
				eng = Integer.parseInt(br.readLine());	
			}while (eng < 0 || eng > 100);
			do {
				System.out.println("수학점수:");
				math= Integer.parseInt(br.readLine());	
			}while (math < 0 || math > 100);
			
			sum = kor + eng + math ;
			avg = sum / 3.0f;
			
			switch ((int)(avg/10)) {
				
				case 10:
				case 9:
					grade='A';
					break;
				case 8:
					grade='B';
					break;
				case 7:
					grade='C';
					break;
				case 6:
					grade='D';
					break;
					default:
						grade= 'F';
			}
			System.out.println("총점" +sum);
			System.out.printf("평균 : %.3f\n",avg);
			System.out.println("학점:"+grade);
			
	}

}
