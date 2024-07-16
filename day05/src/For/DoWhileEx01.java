package For;

public class DoWhileEx01 {

	public static void main(String[] args) {
		
		
		int i = 2;
		// int j = 1;
		do {		
			int j = 1;
			while(j<=9) {
				System.out.printf("%d x %d = %d\n",i,j,i*j);
				j++;
			}
			i++;
			System.out.println();
		
		}while(i<=9);

	}

}
