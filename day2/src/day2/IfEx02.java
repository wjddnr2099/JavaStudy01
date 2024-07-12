package day2;

/*
 * 문제]
 * 시험점수를 임의로 입력받은 후 점수가 80점 이상이면
 * 합격처리하는 프로그램을 구현하시오.
 * 
 */

import java.io.*;
import java.util.*;

public class IfEx02 {
	
public static void main(String[] args) throws IOException {
	
	Scanner sc = new Scanner(System.in);
	
  
   System.out.println("점수를 입력하시오:");
   
   int n = sc.nextInt();   
   
   
   if  (n >= 80 ) {
	   
	   System.out.println(n+ "80이상입니다");
   }
   else {	   
	   System.out.println(n+ "불합격입니다."); 
   }
}
}

