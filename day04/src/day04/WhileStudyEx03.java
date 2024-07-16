package day04;
//1000이하 자연수 중에서 2의 배수이자 7의 배수인 수를 출력하고, 그 수들의 합을 구해서
//출력하는 프로그램을 구현하시오.

public class WhileStudyEx03 {

	public static void main(String[] args) {
		
		
		int i= 14;
		int sum = 0;
		
		System.out.println("1000이하 자연수 중에서 2의 배수이자 7의 배수인 수:");
		
		while(i <=1000) {
			System.out.println(i);
			sum +=i;
			i += 14;
			
		}
		System.out.println(":+"+sum);

	}

}
