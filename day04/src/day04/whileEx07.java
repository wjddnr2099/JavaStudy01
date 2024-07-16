package day04;

/*
 *  문제]
 *  콜라, 사이다, 마운틴,초코송이,에이스, 웨하스가 나오는
 *  자판기 프로그램을 구현하시오.
 *  
 *  단, 0이 입력되면 종료하시오.
 *  콜라 1, 사이다 2, 마운틴 3,초코송이 4,에이스 5, 웨하스 6, 종료 0
 *   메뉴 외 입력시 "선택하신 상품이 없습니다." 출력 
 */
import java.util.*;

public class whileEx07 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
		int choice;
		
		while(true) {
			
			//메뉴 출력
			System.out.println("메뉴를 선택하세요 :");
			System.out.println("1. 콜라");
			System.out.println("2. 사이다");
			System.out.println("3. 마운틴");
			System.out.println("4. 초코송이");
			System.out.println("5. 에이스");
			System.out.println("6. 웨하스");
			System.out.println("0. 종료");
			
			//사용자 입력 받기
			System.out.print("선택:");
			choice = sc.nextInt();
			
			//선택한 메뉴에 따른 출력
			switch(choice) {
			case 1:
				System.out.println("콜라를 선택하셨습니다.");
				System.out.println("콜라가 나왔습니다.");
				System.out.println("감사합니다.");
				return;
			case 2:
				System.out.println("사이다를 선택하셨습니다.");
				System.out.println("사이다가 나왔습니다.");
				System.out.println("감사합니다.");
				return;
			case 3:
				System.out.println("마운틴를 선택하셨습니다.");
				System.out.println("마운틴이 나왔습니다.");
				System.out.println("감사합니다.");
				return;
			case 4:
				System.out.println("초코송이를 선택하셨습니다.");
				System.out.println("초코송이가 나왔습니다.");
				System.out.println("감사합니다.");
				return;
			case 5:
				System.out.println("에이스를 선택하셨습니다.");
				System.out.println("에이스가 나왔습니다.");
				System.out.println("감사합니다.");
				return;
			case 6:
				System.out.println("웨하스를 선택하셨습니다.");
				System.out.println("웨하스가 나왔습니다.");
				System.out.println("감사합니다.");
				return;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;  //프로그램 종료
				
				default:
				System.out.println("선택하신 상품이 없습니다");
				break;
			}
		
		}
		
	}

}
