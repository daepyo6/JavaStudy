package days04;

import java.util.Scanner;

public class ControlOp_IF02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.printf("정수를 입력하세요 : ");
		int a = sc.nextInt();
		int b = a % 2;
		
		if(b==0) {
			System.out.println("짝수입니다.");
		}else{
			System.out.println("홀수입니다.");
		}
		
		//	이전 예제가 조건에 따라 명령을 실행할지 안할지를 결정하는 경우였다면,
		//	현재는 조건에 따라 if절을 실행할지, else절을 실행할지는 결정합니다. 
		 
		
		if(b==0) 
			System.out.println("짝수입니다.");
		else
			System.out.println("홀수입니다.");

		if(b==0) System.out.println("짝수입니다.");
		else System.out.println("홀수입니다.");
		System.out.println();
		*/
		int kor = 70, eng = 98, mat = 95;
		double avg = (kor+eng+mat)/3.0;
		
		/*
		 * //if(avg>=80) System.out.println("합격");
		 * 
		 * if(avg>=80) System.out.println("합격"); 
		 * else System.out.println("불합격");
		 */
		
		// 평균 60이상 이거나, 영어점수가 80이상이라면 합격, 아니면 불합격
		boolean res = (avg>=60) || (eng>= 80);
		if(res) System.out.println("합격");
		else System.out.println("불합격");
		
		// 평균 40이상 이면서, 모든과목점수가 40이상이라면 합격, 아님 불합격
		res = (avg>=40) && (kor>= 40) && (eng>= 40) && (mat>= 40);
		if(res) System.out.println("합격");
		else System.out.println("불합격");
		
		// 년도 하나를 입력받아서 변수에 저장하고 입력한 년도가 윤년인지 평년인지를 출력
		System.out.printf("원하는 연도를 입력하세요 : ");
		int year = sc.nextInt();
		boolean searchYear = (year%4 == 0) && (year%100 != 0) || (year%400 == 0);
		
		if (searchYear) System.out.println("윤년");
		else System.out.println("평년");
		
		/*
		 * 연산의 우선순위
		 * 1. ( )
		 * 2. 변수 앞에 사용되었다는 가정하에 ++a, --a
		 * 3. *, /, %
		 * 4. +, -
		 * 5. 비교(관계)연산
		 * 6. 논리연산
		 * 7. 대입연산 (=)
		 */
		
		
	}
}
