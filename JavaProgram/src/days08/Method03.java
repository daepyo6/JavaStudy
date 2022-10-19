package days08;

import java.util.Arrays;
import java.util.Scanner;

public class Method03 {
	
	public static void googoodan(int n) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(n+"x"+i+"="+n*i);
		}
	}
	
	public static void main(String[] args) {
		// 정수 하나를 입력 받아서 그 정수에 해당하는 구구단을 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력 : ");
		int dan = sc.nextInt();
		
		googoodan(dan);
	}

}
