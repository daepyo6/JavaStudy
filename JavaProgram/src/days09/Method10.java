package days09;

import java.util.Scanner;

public class Method10 {
	
	public static void main(String[] args) {
		int ban;
		double n, d;
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 입력 : ");
		ban = sc.nextInt();
		sc.close();
		
		n = calculate1(ban); // 원의 넓이 메서드
		d = calculate2(ban); // 원의 둘레 메서드
		prn(n, d); // 넓이 둘레 출력 메서드
		
	}

	private static void prn(double n, double d) {
		System.out.printf("원의 넓이 : %.2f, 원의 둘레 : %.2f",n,d);
	}

	private static double calculate2(int ban) {
		double cir = 2 * ban * 3.14;
		return cir;
	}

	private static double calculate1(int ban) {
		double cir = ban * ban * 3.14;
		return cir;
	}
}
