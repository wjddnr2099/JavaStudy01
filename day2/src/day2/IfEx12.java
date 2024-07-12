package day2;

import java.io.IOException;

/*
 * 문제]
 * 
 * 임의의 알파벳 한 문자를 입력받아
 * 입력받은 알파벳이 모음일 경우 
 * 모음 그 외에는 자음을 출력하는 프로그램을 구현하시오.
 * 단, 알파벳 범위 : 대소문자의 범위임
 * 알파벳이 아닌경우
 * '입력오류'라고 출력하시오.
 * if문을 활용
 * 
 */


public class IfEx12 {

	public static void main(String[] args)throws IOException {
		
		char ch;
		System.out.print("글자를 입력하시오 :");
		ch = (char)System.in.read();
	

		if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='A')) {
			if(ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				System.out.println("모음 입니다");
			}
			else {
				System.out.println("자음입니다.");
			}	    
		}
		else {
			System.out.println("오류입니다.");
		}
	
	    
		
		
		
		
		

	}

}
