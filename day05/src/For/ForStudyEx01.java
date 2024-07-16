package For;

import java.util.*;
public class ForStudyEx01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
   int i = 1;
   int sum =0;
   
    while(i <= 99) {
        System.out.print(i);
        sum += i;
        i++;
        
        if(i <= 99) {
        	System.out.print("+");
        }else {
        	System.out.print("=");	
        }
    }
	System.out.println(+sum);
	}

}
