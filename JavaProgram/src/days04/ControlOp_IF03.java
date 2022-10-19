package days04;

import java.util.Scanner;

public class ControlOp_IF03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();
		
		if(a > 0) {
			System.out.println("양수");
		}else if (a < 0) {
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
		// 맨 위의 ()안의 비교연산식으로 계산한 결과가 true인 경우 {} 안의 내용이 실행
		// false인 경우 다음 else if의 비교연산식을 계산하고 true인 경우 {} 안의 내용이 실행
		// 위의 두개의 if가 다 false라면 else부분을 실행하고 종료
		
		// 중괄호 안의 명령이 한개면 생략가능
		if(a > 0) System.out.println("양수");
		else if (a < 0) System.out.println("음수");
		else System.out.println("0");
		
		int kor = 70, eng = 79, mat = 75;
		// 평균점수가 80이상이면 합격, 70이상 79이하면 대기순번, 70미만은 불합격
		double avg = (kor+eng+mat)/3.0;
		
		if(avg >= 80) {
			System.out.println("합격");
		}else if (avg >= 70 && avg <= 79) {
			System.out.println("대기순번");
		}else {
			System.out.println("불합격");
		}
		
	}

}
