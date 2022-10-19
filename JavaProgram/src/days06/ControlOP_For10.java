package days06;

import java.util.Scanner;

public class ControlOP_For10 {

	public static void main(String[] args) {
		int sum = 0, i, num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수를 입력하세요 : ");
		num = sc.nextInt();
		
		// 정수 하나를 입력받아서 1부터 입력받은 정수 까지의 짝수 합을 출력
		// 각각의 짝수들이 합산되었을떄의 중간 합계를 모두 출력하고 최종합계를 마지막에 출력
		
		for (i = 2; i <= num; i+=2) {
			sum = sum + i;
			if(i==(num-1)||i==num) System.out.printf("%d",i);
			else System.out.printf("%d + ",i);
		}
		System.out.println(" = "+sum);
		
		int sum1 = 0;
		for (i = 2; i <= num; i+=2) {
			sum1 = sum1 + i;
			System.out.println("1부터 " + i +"까지의 짝수의 합 :" + sum1);
		}
		
		int sum2 = 0;
		for (i = 1; i <= num; i++) {
			if(i%2==1) continue;  // 반복실행 안에서 남아있는 아래 명령들을 실행하지않고 다음 반복으로 이어지는 명령
			sum2 = sum2 + i;
			System.out.println("1부터 " + i +"까지의 짝수의 합 :" + sum2);
		}

	}

}
