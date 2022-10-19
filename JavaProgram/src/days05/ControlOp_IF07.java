package days05;

import java.util.Scanner;

public class ControlOp_IF07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pay;
		double b = 0, bouns = 0;
		
		System.out.printf("기본급 입력 : ");
		pay = sc.nextInt();
		
		if(pay >= 1000000 && !(pay < 0)) {
			bouns = pay*0.5;
		} /*
			 * else if(pay < 1000000 && !(pay < 0) ){ bouns = pay*0.6; }
			 */
		else {
			bouns = pay*0.6;
			//System.out.println("0이하의 값을 입력하셨습니다.");
		}
		b = pay + bouns;
		System.out.println("총 지급액 : " + (int)b + "원");
		System.out.println("추가보너스 : " + (int)bouns + "원");
		/*
		 * if(pay >= 0) { System.out.println("총 지급액 : " + (int)b + "원");
		 * System.out.println("추가보너스 : " + (int)bouns + "원"); }
		 */
		
	}

}
