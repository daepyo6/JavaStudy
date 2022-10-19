package days04;

import java.util.Scanner;

public class ControlOp_IF01 {

	public static void main(String[] args) {
		// 사용자로부터 정수하나를 입력받아서 짝수인지 홀수있지 출력하려고한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수를 입력하세요 : ");
		int a = sc.nextInt();
		int b = a % 2;
		
		/*
		 * if : if 명령 옆에 있는 ()안에 관계연산식을 넣고 그 결과가 참이냐 거짓이냐에 따라 
		 * 		{}의 명령을 실행할지, 실행하지 않고 뛰어 넘을지를 결정하는 명령
		 */
		if(b==0) {
			System.out.println("짝수입니다.");
		}else if (b==1) {
			System.out.println("홀수입니다.");
		}
		
		/*
		 *	if문의 특징
		 *	()안의 연산 결과 또는 값이 true 이면 {}안의 명령을 실행 false이면 실행하지 않는 명령
		 *	()안의 값이 true면 실행해야될 명령이 두개 이상일수 있으므로, {}로 그 경계를 구분해줍니다. 
		 *																					실행하거나 실행하지 않을 영역 구분
		 *	()안의 값이 true일때 실행할 명령이 한개라면 {}를 생략 할 수 있습니다.
		 *	만약 ()안에 일부러 true를 썼다면 -> if(true){ },  {}안의 내용은 무조건 실행됩니다.
		 * 반대의 경우 if(false){ }이면 {}안의 내용을 실행하지않고 건너뜁니다.
		 */
		
		if(b==0) 
			System.out.println("짝수입니다.");
		
		if(b==0) System.out.println("짝수입니다.");
		
		
		boolean result = b==0;
		// 아래 3개다 같은 표현
		if(result == true) System.out.println("짝수입니다.");
		if(result) System.out.println("짝수입니다.");
		if(a%2 == 0) System.out.println("짝수입니다.");
		
		// 홀수의 여려 표현
		if (b==1) System.out.println("홀수입니다.");
		
		result = b==1;
		if (result==true) System.out.println("홀수입니다.");
		if (result) System.out.println("홀수입니다.");
		
		if (a%2==1) System.out.println("홀수입니다.");
		if (a%2!=0) System.out.println("홀수입니다.");
		if (!(a%2==0)) System.out.println("홀수입니다.");
	}
}
