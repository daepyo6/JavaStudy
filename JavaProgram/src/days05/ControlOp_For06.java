package days05;

import java.util.Scanner;

public class ControlOp_For06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fact = 1;
		int i, k;
		System.out.printf("출력할 팩토리얼을 입력 : ");
		k = sc.nextInt();

		System.out.printf("%d! = ",k);
		// k! = 을 출력
		for (i = 1; i <= k; i++) {
			// i<k로 지정하고 마지막 k번째 팩토리얼을 마지막에 출력
			// i<k일 경우 1x2x3x....xk-1x까지 출력
			fact = fact * i;
			// 아래의 경우 1x2x3x.....x k-1 x k까지 출력
			if(i==k) System.out.printf("%d = ",i);
			else System.out.printf("%dx",i);
		}
		// i<k의 경우 여기서 k = (fact의 계산값) 출력
		// System.out.println(k + " = " + fact);
		// 아래의 경우 fact의 계산값 출력
		System.out.println(fact);
		System.out.println(k+ "! = " + fact);
		
	}
}
