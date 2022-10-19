package days03;

import java.util.Scanner;

public class Variable03 {

	public static void main(String[] args) {
		int b,h;
		double res;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("삼각형의 높이를 입력하세요 : ");
		h = scanner.nextInt();
		System.out.printf("삼각형의 밑변을 입력하세요 : ");
		b = scanner.nextInt();
		
		res = h * b * 0.5;
		
		System.out.println("삼각형의 넓이 : " + res);

	}

}
