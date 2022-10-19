package days03;

import java.util.Scanner;
/*
 	import 단축키 ctrl + shift + o 
 	
 */
public class Variable02 {

	public static void main(String[] args) {
		
		int num1, num2;
		int res1;			// 덧셈, 뺄셈, 곱셈의 결과를 저장할 변수
		double res2;	// 나눗셈의 결과를 저장할 변수
		
		/* 프로그래밍을 하다보면 외부에서 기능을 불러다 사용해야하는 경우가 있는데,
		 	사용자로부터 화면 입력을 받으려면 외부에서 화면 입력을 받는 도구를 불러와서 사용
		 	사실 System.out.println()와 printf도 불러와서 사용되는 외부 명령
		 	이는 따로 설정하지 않아도 자바 프로그래밍 시작과 동시에 자동으로 불려져오는 도구라고 보면됨 (java.lang) 
		 */
		Scanner sc = new Scanner(System.in); //화면 입력을 위한 준비 코드
		// 아직 학습하지 않은 자료형의 특별한 변수를 생성
		
		// 그리고 그 변수를 이용해서 사용자로부터 화면으로 입력을 받음
		System.out.printf("첫 번째 정수를 입력하세요 : ");
		num1 = sc.nextInt();
		/* 컴파일러가 sc.nextInt()라는 명령을 만나면 프로그램 실행을 멈추고 사용자의 입력을 무한정 기다림
			화면으로 사용자가 저수를 입력하면, 입력받아 num1 변수에 저장 */
		System.out.println("입력한 첫 번째 정수 : " + num1);
		
		System.out.printf("두 번째 정수를 입력하세요 : ");
		num2 = sc.nextInt();
		System.out.println("입력한 두 번째 정수 : " + num2);
		
		res1 = num1 + num2;
		System.out.printf("%d + %d = %d\n",num1 ,num2, res1);
		res1 = num1 - num2;
		System.out.printf("%d - %d = %d\n",num1 ,num2, res1);
		res1 = num1 * num2;
		System.out.printf("%d x %d = %d\n",num1 ,num2, res1);
		res2 = num1 / (double)num2;
		System.out.printf("%d / %d = %.2f\n",num1 ,num2, res2);

	}

}
