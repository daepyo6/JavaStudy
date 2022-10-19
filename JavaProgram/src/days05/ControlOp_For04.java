package days05;

import java.util.Scanner;

public class ControlOp_For04 {

	public static void main(String[] args) {
		// 구구단 출력
		
		Scanner sc = new Scanner(System.in);
		int dan;
		System.out.printf("출력할 단을 입력 (2-9) : ");
		dan = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " x " + i + " = " +dan*i);
		}
		
	}

}
