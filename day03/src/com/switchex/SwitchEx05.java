package com.switchex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 
 * 
 * 
 * 
 */
import java.util.*;

public class SwitchEx05 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		 int i,j;
		 char op;
		 
		 System.out.print("첫번째 정수 입력:");
		 i=Integer.parseInt(br.readLine());
		 System.out.print("연산자 입력:");
		 op=(char) System.in.read(); 
		 System.in.read();
		 System.in.read();
		 System.out.print("두 번째 정수입력");
		 j = Integer.parseInt(br.readLine());
		 
		 switch(op) {
		 case '+':
			 System.out.printf("%d%c%d =%d",i,op,j,(i+j));
		 break;
		 case '-':
			 System.out.printf("%d%c%d =%d",i,op,j,(i-j));
		 break;
		 case '/':
			 System.out.printf("%d%c%d =%d",i,op,j,(i/j));
		 break;
		 case '*':
			 System.out.printf("%d%c%d =%d",i,op,j,(i*j));
		 break;
		 case '%':
			 System.out.printf("%d%c%d =%d",i,op,j,(i%j));
		 break;
		 default :
			 System.out.println("연산자가 아닙니다.");
			 System.exit(0);
			 return;
		 
		 }
	}

}
