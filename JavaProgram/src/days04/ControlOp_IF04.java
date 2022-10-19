package days04;

import java.util.Scanner;

public class ControlOp_IF04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.printf("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("A학점");
		}else if (score >= 80 && score <= 89) {
			System.out.println("B학점");
		}else if (score >= 70 && score <= 79) {
			System.out.println("C학점");
		}else if (score >= 60 && score <= 69) {
			System.out.println("D학점");
		}else{
			System.out.println("F학점");
		}
		
		if(score >= 90) System.out.println("A학점");
		else if (score >= 80) System.out.println("B학점");
		else if (score >= 70) System.out.println("C학점");
		else if (score >= 60) System.out.println("D학점");
		else System.out.println("F학점");
		
		// 잘못된 사용 예
		if(score < 60) System.out.println("F학점");
		else if (score >= 60) System.out.println("D학점");
		else if (score >= 70) System.out.println("C학점");
		else if (score >= 80) System.out.println("B학점");
		else System.out.println("A학점");

		if(score < 60) System.out.println("F학점");
		else if (score < 70) System.out.println("D학점");
		else if (score < 80) System.out.println("C학점");
		else if (score < 90) System.out.println("B학점");
		else System.out.println("A학점");
	}
}
