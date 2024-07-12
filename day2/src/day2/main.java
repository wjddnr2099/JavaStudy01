package day2;

import java.io.*;
import java.util.*;

public class main {
    
	//버퍼 객체 생성
	public static void main(String[] args) throws IOException{
		
		//버퍼 객체 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//스케너 객체 생성
		Scanner sc = new Scanner(System.in);
		
		sc.nextLine();
		sc.nextInt();
		int input;
		System.out.println("임의의 숫자 입력 :");
		input = sc.nextInt();
		
		/*
		int input2;
		System.out.println("임의의 숫자 입력 :");
		input2 = sc.nextInt();
		*/
		
		if (input==0) { //조건이 참일 경우
			System.out.println("입력하신 숫자는"+input+"입니다.");
		}
		
		else { //조건이 거짓일 경우
			System.out.println("입력하신 숫자는 0이 아닙니다.");         //같은 방법
			System.out.printf("입력하신 숫자는 %d입니다%n",input);
			
			
				
			
			
		}
		
		

	}

}
