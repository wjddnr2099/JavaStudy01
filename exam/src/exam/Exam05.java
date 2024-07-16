package exam;
/*
 * for문을 반복 횟수 변수가 배열의 인덱스일 경우 사용하는 반복문
 * 반복 횟수 변수를 제어 해야할 경우에는 사요할 수 없습니다.
 * 
 * 
 * 
 */
public class Exam05 {

	public static void main(String[] args) {
		String[] arr = {"AA","BB","CC","DD","EE"};
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		for (String s: arr) {
		System.out.println(s+"\t");
		}
		}

	}

}
