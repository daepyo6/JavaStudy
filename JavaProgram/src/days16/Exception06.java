package days16;

import java.util.Scanner;

public class Exception06 {

	public static void main(String[] args) {
		// 순수하게 숫자만으로 이루어진 정수를 입력받는 while과 try-catch를 제작하세요
		// 입력값에 문자가 섞이거나 하면 에러가 발생되어 "잘못입력했습니다" 라고 출력
		// Integer.parseInt() 메서드는 숫자로 변환될 입력이 아라비아기호가 아닌 다른 문자등이 입력되면 에러 발생
		Scanner sc = new Scanner(System.in);
		int data;
		
		while(true) {
			System.out.print("정수를 입력하세요 : ");
			try {
				data = Integer.parseInt(sc.nextLine());
				break;
			} catch (Exception e) {
				// 최초 catch에 Exception만 쓰고 일부러 에러를 발생하면 e.printStackTrace();를 통해
				// Exception의 종류를 알아낼 수 있습니다.
				e.printStackTrace();
				System.err.println("잘못 입력했습니다. " + e.getMessage());
			}
			
		}
		System.out.println("입력한 정수 : " + data);
	}

}
