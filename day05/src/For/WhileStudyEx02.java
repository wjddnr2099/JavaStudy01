package For;
// 1~100까지 출력하고 이어서 거꾸로 100~1까지 출력하는 프로그램을 작성해라

public class WhileStudyEx02 {

	public static void main(String[] args) {
		
		int i=1;
		int j=100;
		
		while(i <=100) {
			System.out.print(i);
			i++;
		}
		System.out.println();
		
		while(j>=1) {
			System.out.print(j);
			j--;
			
			
		}System.out.println();
	}
		

}


