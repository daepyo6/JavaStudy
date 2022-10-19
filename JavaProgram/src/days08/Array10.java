package days08;

import java.util.Scanner;

public class Array10 {

	public static void main(String[] args) {
		// 시험문제
		// 정수를 입력받아서 해당 학점 출력
		// 배열 이용
		
		char [] grade = {'F', 'F', 'F', 'F', 'F', 'F', 'D', 'C', 'B', 'A', 'A'};

		Scanner sc = new Scanner(System.in);
		System.out.printf("점수 입력 (0 ~ 100) : ");
		int score = sc.nextInt();
		int index = score/10;
		// int index = (score==0) ? 0 : score/10; // 자바 아래버전에서는 이렇게 사용
		System.out.println("학점 : " + grade[index]);
		
	}

}
