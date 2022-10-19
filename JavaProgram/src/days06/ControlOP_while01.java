package days06;

import java.util.Scanner;

public class ControlOP_while01 {

	public static void main(String[] args) {
		// while 반복문
		// for 반복문은 정해진 횟수의 반복을 괄호안에 미리 정의 해놓고 반복하는 특징
		// while문은 정해지지않은 횟수의 반복을 처리하는데 주로 사용
		// 특정조건이 만족할때까지 무한 반복
		// while(true) { } -> 이 반복문은 종료되지 않습니다. (무한 반복)

		// for문 10회 반복
		for (int i = 1; i <= 10; i++) {
			System.out.println("for : " + i);
		}
		System.out.println();
		// i<=10 : 반복을 계속할 조건. 이 조건이 false가 되면 반복실행을 중단.
		// while문의 조건도 똑같이 사용
		int i = 0;
		while (i <= 10) { // for문과 달리 ()안에 다른건 다 빼고, 반복할 조건만 씁니다.
			System.out.println("while : " + i);
			i++;
		}
		System.out.println();
		// 괄호안의 관계연산식의 참/거짓 유무를 먼저 판단후 반복을 계속할지 결정

		// while문의 경우 위에 경우처럼 i++ 명령에 의해 반복유지유무가 결정되는것보단
		// 특정조건에 의해 순서와 반복횟수에 상관없이 반복이 결정되는 상황에 더 적절히 사용됨

		i = 0;
		for (;;) {
			System.out.println("for : " + i);
			i++;
			if (i > 10)
				break;
		}
		System.out.println();

		i = 0;
		while (true) {
			System.out.println("while : " + i);
			i++;
			if (i > 10)
				break;
		}
		System.out.println();

		Scanner sc = new Scanner(System.in);
		System.out.printf("\n 메뉴선택 : 1.저장 2.불러오기 3.종료");
		int input = sc.nextInt();

//		while (true) {
//			if(input == 3) {
//				System.out.println("종료"); 
//				break;
//			}
//			switch (input) {
//			case 1: System.out.println("저장"); break; 
//			case 2: System.out.println("불러오기"); break; 
//			//case 3: System.out.println("종료"); break; 
//			}
//			System.out.printf("\n 메뉴선택 : 1.저장 2.불러오기 3.종료");
//			input = sc.nextInt();
//		}

		while (input != 3) {
			switch (input) {
			case 1:
				System.out.println("저장");
				break;
			case 2:
				System.out.println("불러오기");
				break;
			// case 3: System.out.println("종료"); break;
			}
			System.out.printf("\n 메뉴선택 : 1.저장 2.불러오기 3.종료");
			input = sc.nextInt();
		}
		System.out.println("프로그램을 종료");
		
	}

}
