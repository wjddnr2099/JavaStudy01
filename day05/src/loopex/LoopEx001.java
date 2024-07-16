package loopex;

/*
 * 문제]
 * 
 *  문자 하나를 입력받아 대문자인지 소문자인지를 
 *  판별하는 프로그램을 구현하시오.
 *  
 *  출력
 *    문자 입력: a
 *    
 *    "a는 소문자입니다."
 * 
 *    단 문자의 범위는 알파벳을 번위로 하고 이 외의 문자가 입력되면
 *     "영문 대,소문자가 아닙니다" 출력.
 */

import java.io.*;

public class LoopEx001 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char ch = (char )br.read();
		
		if(ch >= 'a'&& ch <= 'z') {
		System.out.println("소문자");
		}else if(ch >= 'A'&& ch <= 'Z') {
			System.out.println("대문자");
		}else {
			System.out.println("영문 소,대문자가 아닙니다.");
		}
			
			
		
		
		
		

	}

}
