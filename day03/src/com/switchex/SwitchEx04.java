package com.switchex;

import java.io.IOException;
/*
 * 
 * 
 * 
 * 
 * 
 */
import java.util.*;

public class SwitchEx04 {

	public static void main(String[] args)throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력:");
		
		
		String jumin = sc.nextLine();	
		char num = jumin.charAt(6);
		
	   switch (num) {
	   case '1': case '3':
		   System.out.println("당신의 성별은 남성입니다.");
		   break;	
	   case '2': case '4':
		   System.out.println("당신의 성별은 여성입니다.");
		   break;
	   default:
	   System.out.println("유효하지 않은 주민번호 입니다.");
	   break;
		   
	   }
		
		
		

	}

}
