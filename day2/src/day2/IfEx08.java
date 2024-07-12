package day2;

/*
 * 문제]
 * 점수와 학년을 입력받아 60점 이상이면 합격, 미만이면 불합격
 * 단, 학년이 4학년인 경우 70점 이상이면 합격, 미만이면 불합격
 * 점수 범위 : 0~100, 학년 범위 1~4
 */


import java.util.*;
import java.io.*;


public class IfEx08 {

	public static void main(String[] args)throws IOException {
		
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		// a= 점수 , b= 학년 c= 판별
	
		int a,b;
		String c;
		
		// 점수
		System.out.println("점수");
		a=Integer.parseInt(br.readLine());
		// 학년
		System.out.println("학년");
		b=Integer.parseInt(br.readLine());
		//조건
		if (a >= 60) {
			
			if(b <= 3) {
				c = "합격";			
			}else if (b==4 && a >= 70) {
		    	c = "합격";	
			}
			else {
				c = "불합격";	
			}
		 }
		
		else {
			c = "불합격";
		}
		//판별
		System.out.println("판별:"+c);

	}

}
