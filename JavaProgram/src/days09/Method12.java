package days09;

import java.util.Scanner;

public class Method12 {
	public static void main(String[] args) {
		int a, b;
		double c;
		
		a = myInput(1); // 밑변 입력 받음
		b = myInput(2); // 높이 입력 받음
		c = calculate(a, b); // 넓이 계산
		prn(c); // 넓이 출력메서드
	}

	private static int myInput(int i) {
		int num;
		Scanner sc = new Scanner(System.in);	
		if(i==1)
			System.out.print("밑변을 입력하세요 : ");
		else if(i==2)
			System.out.print("높이를 입력하세요 : ");
		num = sc.nextInt();	
		return num;
	}

	private static double calculate(int a, int b) {
		return a*b*0.5;
	}

	private static void prn(double c) {
		System.out.println("삼각형의 넓이 : " + c);
	}
}
