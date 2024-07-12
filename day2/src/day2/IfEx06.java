package day2;

/*
 * 문]
 * 국,영,수,사,과 과목의 점수를 입력받아
 * 총점과 평균을 구하고, 평균을 이용하여 학점을 판정하는 프로그램을 구현하시오.
 * 
 * A :90이상
 * B :80~89
 * C :70~79
 * D :60~69
 * F :60이하는 F로 처리
 */

import java.util.*;
import java.io.*;

public class IfEx06 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner(System.in);
		
		
		int a,b,c,d,e,f,g,grade;
		char op;
		
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
		
		// 90보다 크면 A
		if (g >=90) {
			grade ='A';
		}
		// 89작거나 80보다 크면 B
		
		// 79작거나 70보다 크면 C
		// 76작거나 60보다 크면 D
		// 60보다 작으면 F
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		if (g>=90) {
			grade = 'A';
		}
		else if (g >80&&g<=89 ) {
			grade='B';
		}
		else if (g >90&&g<=79 ) {
			grade='C';
		}
		else if (g >70&&g<=69 ) {
			grade='D';
		}
		else {
			System.out.println("F입니다.");
		}
	
	

	}

}
