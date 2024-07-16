package For;
/*
 * 정수를 입력받아 입력받은 수까지 합계를 구하되,
 * 계속 진핼할 것인지를 물어보고 y/n으로 정한다.
 * y가 입력되면 지행, n이 입력되면 프로그램 종료.
 * 
 * 단, 입력범위는 1~1000까지 정함
 */

import java.io.*;

public class MultiLoopEx {

	public static void main(String[] args)throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//변수 선언
		int n, sum=0;
		char ch;
		
		while(true) {
			
			//입력범위
			do {
				System.out.println("정수입력:");
				n = Integer.parseInt(br.readLine());
			}while (n<1 || n > 1000);
			for(int i =1; i<=1000);
					for(int i =1 ; i<=n; i++) {	
						sum+=1;
					}
					System.out.print("1~"+n+"까지의 합계"+sum);
					System.out.print("계속 진행하시겠습니다>");
					ch = (char)System.in.read();
					if(ch !='y' &&ch!='y')
		}
		
		
		
		
		
		
	

	}

}
