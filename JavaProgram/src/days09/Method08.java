package days09;

import java.util.Scanner;

public class Method08 {

	public static void main(String[] args) {
		
		int [] a = {56, 54, 87, 89, 25, 36, 57, 98};
		Scanner sc = new Scanner(System.in);
		System.out.print("출력 내용 선택(1. 합계, 2. 평균, 3. 합계+평균) : ");
		int input = sc.nextInt();
		sumavg(input, a);
		// 전달인수가 1이면 합계, 2이면 평균, 3이면 총점 평균 출력
	}

	public static void sumavg(int cnt, int[] arr) {
		// cnt : 메서드 호출시 전달된 정수 value, arr : 메서드 호출시 전달된 정수배열의 시작주소
		int s = 0;
		double avg = 0.0;
		
		for (int i = 0; i < arr.length; i++)
			s+=arr[i];
		avg = s / (double)arr.length;
		
		switch(cnt) {
		case 1:
			System.out.println("sum : " + s);
			break;
		case 2:
			System.out.println("avg : " + avg);
			break;
		case 3:
			System.out.println("sum : " + s +", avg : " + avg);
			break;
		}
		
		
	}

}
