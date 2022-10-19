package days03;

import java.util.Scanner;

public class Variable07 {

	public static void main(String[] args) {
		int apple, boxLimit, res, mod;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("사과의 갯수 : ");
		apple = scanner.nextInt();
		System.out.printf("상자 하나에 담기는 사과 갯수 : ");
		boxLimit = scanner.nextInt();
		
		res = apple / boxLimit;
		mod = apple % boxLimit;
		
		System.out.println("박스 개수 : " + res);
		System.out.println("남은 사과 : " + mod);
	}

}
