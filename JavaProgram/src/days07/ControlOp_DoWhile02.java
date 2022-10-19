package days07;

import java.util.Scanner;

public class ControlOp_DoWhile02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, res = 0, operator;
		int isExit;
		
		// 두개의 숫자와 연산자를 입력받아 해당숫자를 입력할 연산자로 연산한 결과를 출력
		do {
			System.out.print("첫번째 정수를 입력 : ");
			n1=sc.nextInt();
			System.out.print("두번째 정수를 입력 : ");
			n2=sc.nextInt();
			System.out.print("계산에 쓸 연산자 입력 (+:1, -:2, *:3, /:4) : ");
			operator=sc.nextInt();
			
			switch(operator) {
			case 1: 
				res = n1+n2;
			break;
			case 2: 
				res = n1-n2;
			break;
			case 3: 
				res = n1*n2;
			break;
			case 4: 
				res = n1/n2;
			break;
			}
			System.out.println("결과 : " + res);
			
			System.out.println("계속할거냐? (Yes : 1, No : 2)");
			isExit = sc.nextInt();
		}while(isExit==1);
		System.out.println("종료쓰");
		
	}

}
