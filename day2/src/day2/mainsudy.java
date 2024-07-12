package day2;

import java.util.*;


import java.io.*;

public class mainsudy {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		int input;
		System.out.println("숫자를 입력하세요:");
		input = sc.nextInt();
		
		
		if(input == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		else {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
         	System.out.printf("입력하신 숫자는" + input + "입니다.");
		}

	}

}
