package day2;

/*
 * 문제]
 * 임의의 년도를 입력받아 윤년인지 평년인지를 판정하는 프로그램을 구현하시오
 * 
 * 윤년 조건 
 * 4로 나누어 떨어지고 
 * 4로 나누어 떨어지고, 400으로 나누어 떨어지면 평년
 * 4,100,400으로 나누어 떨어지면 윤년
 * 
 */

import java.util.*;
import java.io.*;

public class IfIx13 {

	public static void main(String[] args)throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		
		int year;
		
		System.out.println("연도를 입력하시오:");
		year= sc.nextInt();
		
		if ((year %4==0)&&(year%100 !=0)||year %400 ==0) {
			System.out.println("당신이 입력하신"+year+"은 평년입니다.");	
		}else {
			System.out.println("당신이 입력하신" + year + "은 윤년입니다.");
		}
		
		
		

	}

}
