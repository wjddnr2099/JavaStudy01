package For;
/*
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class WhileEx01 {

	public static void main(String[] args) {
		
		int i = 2;
		// int j = 1;
		while(i<=9) {
			int j = 1;
			while(j<=9) {
				System.out.printf("%d x %d = %d\n",i,j,i*j);
				j++;
			}
			i++;
			System.out.println();
		}

	}

}
