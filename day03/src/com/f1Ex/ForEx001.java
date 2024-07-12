package com.f1Ex;

/*
 * 문제]
 * 0에서부터 입력한 정수의 합계를 구하는 프로그램을 구현하시오.
 * 
 * 정수 입력 : 20
 * 0 부터 20까지의 합 : 210
 * 
 */
import java.util.*;
import java.io.*;

public class ForEx001 {

	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
         int n,sum =0;
		System.out.println("정수입력 :");
		n = sc.nextInt();
		
		for (int i =0; i<=n;  i++) {
			sum += i;	
		}
		System.out.println("0부터"+n+"까지의 합계 :"+sum);
	
		
	}
}
