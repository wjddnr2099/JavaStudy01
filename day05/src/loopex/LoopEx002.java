package loopex;
/*
 *  주민등록번호를 입력받아 8번째 자리로 출생지를 알아보는 프로그램을 구현하시오
 * 
 *  0:서울, 1:경시,인천 2:부산,3:강원도,4:충청도,5:전라도,6:대구,광주 ,7:경북,경남
 *  8:경남,9:제주도
 * 
 */

import java.util.*;

public class LoopEx002 {

	public static void main(String[] args){
		
    Scanner sc = new Scanner(System.in);
    System.out.println("주민번호 입력: ");
    
    int ju = sc.next().charAt(7)-48;
    int s = sc.next().charAt(6)-48;
    
    System.out.println(ju);
    String city = "";
   
    switch(ju) {
    case 0:
    	city = "서울";
    	break;
    case 1:
    	city = "경기,인천";
    	break;
    case 2:
    	city = "부산";
    	break;
    case 3:
    	city = "강원도";
    	break;
    case 4:
    	city = "충청도";
    	break;
    case 5:
    	city = "전라도";
    	break;
    case 6:
    	city = "대구,광주";
    	break;
    case 7:
    	city = "경북";
    	break;
    case 8:
    	city = "경남";
    	break;
    case 9:
    	city = "제주";
    	break;
    	
    	default:
    		System.out.println("xxxx");
    		
    }
    System.out.println(s);
    String sun = "";
    switch(s) {
    case 1:
    	sun = "남자";
    	break;
    case 2:
    	sun = "여자";
    	break;
    	
    }
    System.out.println("출생지는:"+city);
    System.out.println("성별은:"+s);
		

	}

}
