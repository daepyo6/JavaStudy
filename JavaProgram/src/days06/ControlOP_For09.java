package days06;

import java.util.Iterator;
import java.util.Scanner;

public class ControlOP_For09 {
	public static void main(String[] args) {
		// 10개의 정수를 입력받아 그들의 합계와 평균을 출력
		// 10개를 입력하는 중간에 종료를 원하면 0을 입력하여 종료하고 최종합계를 출력합니다.
		
		int sum = 0, i, num = 0;
		double avg = 0.0;
		Scanner sc = new Scanner(System.in);
		
		for (i=1;i<=10;i++) {
			System.out.printf("%d번째 정수를 입력하세요 : ",i);
			num = sc.nextInt();
			if(num==0) break;
		}
		
		/* NaN 나왔을때 초기화 방법
		 * if(sum == 0){ 
		 * sum = 0; avg = 0.0; 
		 * }else avg = sum / (double)i;
		 */
		avg = sum / (double)i;
		System.out.println("합계 : " + sum + ", 평균 : " + avg);	
	}
}
