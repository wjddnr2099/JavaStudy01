package For;

public class StarEx04 {

	public static void main(String[] args) {


		int k=0;
		
		for(int i=1; i<=9; i++) {
			
			if(i>=1 &&i<=5) {
				for(int j=i; j<5; j++) {
					System.out.print(" ");
				}
				for(int j = 1; j<=i*2-1;j++ ) {
					System.out.print("*");
				}
				System.out.println();
				
				
			}else {
				for(int j=5; j<i; j++) {
					System.out.print(" ");
				}
				for(int j = i; j>=k;j-- ) {
					System.out.print("*");
				}
				k+=3;
				System.out.println();
				
				
				
				
			}
			
			
			
			
			System.out.println();
			
		}

	}

}
