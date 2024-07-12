package com.switchex;

/*
 * 문제]
 * switch 문을 이용하여 커피메뉴의 가격을 출력하는 프로그램을 구현하시오.
 * 커피종류 : 에스프레소, 카푸치노, 카페라떼, 아메리카노
 * 커피가격 :        3500원            1500원
 * 
 * )
 * 무슨 커피를 드릴까요?
 * 카페라떼
 * 금액은 3500원 입니다.
 */

import java.io.*;

public class SwitchEx02 {

	public static void main(String[] args)throws IOException {
		
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
	  String order;
      int price = 0;
      System.out.println("무슨 커피를 드릴까요?");
      order=br.readLine();
      
      switch(order) {
      case "에스프레소":
      case "카푸치노":
      case "카페라떼":
          price=3500;
          break;
      case"아메리카노":
    	  price=1500;
    	  break;
      default:
    		  System.out.println("저희 매장에는 없는 메뉴입니다.");
    		  break;
      }
		if (price !=0) {
			System.out.println("당신이 주문하는"+order+"커피는"+price+"원 입니다.");
			
		}
		
	}

}
