package days05;

import java.util.Scanner;

public class ControlOp_QuestionMark {

	public static void main(String[] args) {
		// ? : 간단한 if else를 대신할 수 있는 간략한 명령
		// 점수가 70이상이면 합격, 아니면 불합격
		Scanner sc = new Scanner(System.in);
		/*
		System.out.printf("점수 입력 : "); 
		int score = sc.nextInt();
		 
		
		String prnText;
		if(score >= 70) prnText="합격";
		else prnText="불합격";
		System.out.println(prnText);
		
		String prnText2 = (score>=70) ? "합격" : "불합격"; 
		//관계연산이 true이면 :의 왼쪽, false이면 :의 오른쪽을 선택
		System.out.println(prnText2);
		 */
		
		System.out.printf("기본급을 입력하세요 : "); 
		int pay = sc.nextInt();
		
		// 기본금 100만 이상 50%, 100만 미만 60%를 가산한 지급액을 출력
		double bouns =(pay>=1000000) ? 0.5 : 0.6; 
		//== double bouns =(pay>=1000000) ? (int)(pay+pay*0.5) : (int)(pay+pay*0.6); 
		int total = (int)(pay+bouns*pay);
		System.out.println("지급액 : " + total);
		
	}

}
