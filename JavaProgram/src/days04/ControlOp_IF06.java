package days04;

import java.util.Scanner;

public class ControlOp_IF06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String level = "";
		int pay;
		
		System.out.printf("직급 입력(과장/대리/사원) : ");
		level = sc.nextLine();
		
		System.out.printf("판매실적금액 입력 : ");
		pay = sc.nextInt();
		
		double r = 0, total = 0.0; // r : 활동비를 계산할 비율 저장 변수, total : 판매실적 + 활동비를 저장할 변수
		
		// 판매실적금액에 과장 50%, 대리 25%, 사원 15%의 활동비를 합산하여 출력해주세요.
		
		if(level.equals("과장")) {
			r = 0.5;
		}else if(level.equals("대리")) {
			r = 0.25;
		}else if(level.equals("사원")) {
			r = 0.15;
		}
		total = pay * (1 + r);
		System.out.println( level + "님의 판매실적 + 활동비 합산금액은 " + total + "원 입니다.");
	}

}
