package days06;

import java.util.Scanner;

public class ControlOP_while04 {

	public static void main(String[] args) {
		// 구구단 출력
		
		int num, i = 1, fact = 1; 
		Scanner sc =new Scanner(System.in); 
		
		System.out.printf("원하는 구구단 단수를 입력 : "); 
		num = sc.nextInt();
		
		while(num!=0) {
			for (i = 1; i < 10; i++) {
				System.out.println( num + " x "+ i +" = "+ num*i);
			}
			System.out.printf("원하는 구구단 단수를 입력 : "); 
			num = sc.nextInt();
		}
		System.out.println("종료");
	}

}
