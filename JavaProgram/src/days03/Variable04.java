package days03;

import java.util.Scanner;

public class Variable04 {
	public static void main(String[] args) {
		// 반지름을 입력받아 원의 넓이와 둘레를 출력
		// 넓이 : r * r * pie , 둘레 : 2 * r * pie
		// 소수점 둘째짜리까지만 표시
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("원의 반지름을 입력하시오 : ");
		int radius = scanner.nextInt();
		
		double circleArea = radius * radius * 3.141592;
		double circleFormula = 2 * radius * 3.141592;
		System.out.printf("원의 넓이 : %.2f 원의 둘레 : %.2f\n", circleArea, circleFormula);
		System.out.println("원의 넓이 : " + (int)(circleArea*100)/100.0 
				+ " 원의 둘레 : "  + (int)(circleFormula*100)/100.0);
	}
}
