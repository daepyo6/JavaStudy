package days07;

import java.util.Scanner;

public class ControlOp_DoWhile01 {

	public static void main(String[] args) {
		int i = 0;
		
		for(i=11;i<=10;i++) {
			System.out.printf("%d ",i);
		}
		System.out.println("for문 반복 종료후 i 값 : "+i);
		System.out.println("===================");
		
		i=11;
		while(i<=10) {
			System.out.printf("%d ",i);
			i++;
		}
		System.out.println("while문 반복 종료후 i 값 : "+i);
		System.out.println("===================");
		
		i=11;
		do {
			System.out.printf("%d ",i);
			i++;
		} while (i<=10);
		System.out.println("do-while문 반복 종료후 i 값 : "+i);
		System.out.println("===================");
		
		/*
		 *  do while의 특이점 while(조건)을 후미에 기술
		 *  while(조건)뒤에 ';'을 찍습니다.
		 *  if(조건) x
		 *  for(i=1;i<=10;i++) x
		 *  while(i<10) x
		 *  do{ } while(조건) o
		 *  do에 속한 { }안에 명령을 한번 먼저 실행 후 조건을 테스트합니다. 
		 *  
		 *  while (true){
		 *  	if() break;
		 *  }
		 */
		
		Scanner sc = new Scanner(System.in);
		int input, sum = 0;
		do {
			System.out.print("정수를 입력하세요 : ");
			input=sc.nextInt();
			sum += input;
		}while(input!=100);
		System.out.println("입력한 정수의 합 : " + (sum-100));
		System.out.println("프로그램 종료");

	}

}
