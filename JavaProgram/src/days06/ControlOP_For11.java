package days06;

import java.util.Scanner;

public class ControlOP_For11 {

	public static void main(String[] args) {
		// 입력 받은 두개의 공약수들을 출력하세요
		// 공약수 : 두개의 숫자를 나눴을때 동시에 나눠떨어지는 숫자
		
		int i, num1 = 0, num2 = 0, small;
		Scanner sc = new Scanner(System.in);
		System.out.printf("첫번째 정수를 입력 : ");
		num1 = sc.nextInt();
		System.out.printf("두번째 정수를 입력 : ");
		num2 = sc.nextInt();
		
		if(num1<=num2) 
			small = num1;
		else 
			small = num2;
		
		for(i=1;i<=small;i++) {
			if(num1%i==0 && num2%i==0) {
				System.out.printf("%d ",i);
			}
		}
	}
}
