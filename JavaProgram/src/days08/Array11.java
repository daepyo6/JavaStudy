package days08;

import java.util.Scanner;

public class Array11 {

	public static void main(String[] args) {
		// 야구 게임

		// 컴퓨터 숫자 배열, 사용자가 입력할 숫자 배열 생성
		int[] comAnswer = new int[3];
		int[] userAnswer = new int[3];
		Scanner sc = new Scanner(System.in);

		// 야구 게임 생성과 동시에 중복 체크
		int i = 0;
		while (i < comAnswer.length) {
			comAnswer[i] = (int) (Math.random() * 10);

			int j;
			for (j = 0; j < i; j++)
				if (comAnswer[i] == comAnswer[j])
					break;
			if (i != j) continue;
			else i++;
		}
		
		while (true) {
			// 사용자로부터 숫자 입력 받음
			/* 방법 1
			for (int j = 0; j < userAnswer.length; j++) {
				System.out.print((j + 1) + "번째 숫자 (0~9)입력 : ");
				userAnswer[j] = sc.nextInt();
			} */
			
			/*//방법 2
			System.out.print("세자리 숫자(중복x) 입력 : ");
			int temp = Integer.parseInt(sc.nextLine());
			userAnswer[0] = temp / 100;
			userAnswer[1] = (temp%100) / 100;
			userAnswer[2] = temp%10;  */
			
			//방법3
			System.out.print("세자리 숫자(중복x) 입력 : ");
			String temp = sc.nextLine();					// 456
			userAnswer[0] = temp.charAt(0) - '0';  // '4'-'0' = 4
			userAnswer[1] = temp.charAt(1) - '0';
			userAnswer[2] = temp.charAt(2) - '0';
			
			
			// 컴퓨터 숫자와 유저가 적은 숫자를 비교하요 S와 B를 카운트
			int strike = 0, ball = 0;
			for (int j = 0; j < comAnswer.length; j++) {
				for (int k = 0; k < userAnswer.length; k++) {
					if (comAnswer[j] == userAnswer[k])
						if(j==k) strike++;
						else ball++;
				}
			}

			// 카운트 결과 출력
			if (strike == 3) {
				System.out.println("정답입니다.");
				break;
			} else
				System.out.println(strike + "S " + ball + "B");
		}
	}

}
