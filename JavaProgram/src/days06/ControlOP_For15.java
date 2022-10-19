package days06;

import java.util.Scanner;

public class ControlOP_For15 {

	public static void main(String[] args) {
		/*
		 * // 정수하나 입력 받아서 입력한 정수가 소수(prime number)인지 아닌지를 출력 
		 * int num = 0; 
		 * Scanner sc =new Scanner(System.in); 
		 * System.out.printf("정수를 입력하세요 : "); 
		 * num = sc.nextInt();
		 * 
		 * int i; int count = 0;
		 * 
		 * for (i = 1; i <= num; i++) { if(num%i == 0) { count++; } } 
		 * if(count==2) System.out.println("입력한 정수 : " +num+"은 소수입니다."); 
		 * else System.out.println("입력한 정수 : " +num+"은 소수가 아닙니다.");
		 */

		// 1부터 100사이의 소수를 출력
		int i, j, count=0;
		for (i = 2; i <= 100; i++) {
			count=0;
			for (j = 1; j <= i; j++) {
				if(i%j==0) count++;
			}
			if(count==2)
				System.out.printf("%d ",i);
		}
		System.out.println();
		
		for (i = 2; i <= 100; i++) {
			count=0;
			for (j = 2; j < i/2; j++) {
				if(i%j==0) count++;
			}
			if(count==0)
				System.out.printf("%d ",i);
		}
	}

}
