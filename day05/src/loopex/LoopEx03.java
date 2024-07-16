package loopex;

/*
 * 문제]
 *     계산프로그램을 구현하시오.
 *     한번 계산 후 다시 계산할 것인지르르 물어보고
 *     수행을 계속 할 것인지를 결정하는 프로그램을 구현
 * 
 *     출력
 *     
 *     첫번째 정수 : 100
 *     연산자(+,-,*,/,%): +
 *     두번째 정수 : 200
 *     
 *     100 + 200 = 300
 *     
 *     계속 하시겠습니까? y
 *     
 *     번째 정수 : 50
 *     연산자(+,-,*,/,%): +
 *     두번째 정수 : 20
 *     
 *     50 + 20 = 70
 *     
 *     계속 하시겠습니까? n
 *     
 *     
 *     /,% 연산자 두번쨰 정수 값이 0일 경우
 *     
 *     "0으로 나누거나 나눈 나머지를 구할 수 없습니다." 출력.
 *     
 *     "계속 진행하시겠습니까?'" 출력.
 *     
 */

import java.io.*;

public class LoopEx03 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		char end = 'n';
		
		
		
		int i=0, j=1, sum=0,result = 0;
		char op=0;

		

		System.out.print("첫번쨰 정수:");
	    i = Integer.parseInt(br.readLine());
	    
	    do {
	    System.out.println("연산자 입력:");
	    op= (char)System.in.read();
	    System.in.read();
	    System.in.read();
	    }while(op != '+' && op!='-' && op != '/' && op != '%' && op!= '*');
	    
	    while(true) {
	    	System.out.print("두 번쨰 정수:");
	    	j = Integer.parseInt(br.readLine());
	    	if((op == '/'||op== '%')&& j == 0) {
	    		System.out.println("0으로 나누거나 나눈 나머지를 구할 수 없습니다.");
	    		continue;
	    	}
	    	break;
	    }
	    
	    	switch(op) {
	    	case '+': result = i+j; break;
	    	case '-': result = i-j; break;
	    	case '*': result = i*j; break;
	    	case '/': result = i/j; break;
	    	case '%': result = i%j; break;
	    	}
	    	System.out.println(i+" "+op+" "+j+"="+result);
//	    	
	    	 do {
	    		    System.out.print("계속 하시겠습니까? (y/n)");
	    		    op= (char)System.in.read();
	    		    System.in.read();
	    		    System.in.read();

	    	 }while(op == 'y' && op =='Y' && op == 'n' && op == 'N') ;
	    	 
	    	 
	    	 //다시 위로 
	    	 
	    	 System.out.println("계산기 프로그램을 종료합니다.");
	}
}
	    

	    
	    
	    

	


