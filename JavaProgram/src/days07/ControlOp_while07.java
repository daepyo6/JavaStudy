package days07;

import java.util.Scanner;

public class ControlOp_while07 {

	public static void main(String[] args) {

		// 연도와 월을 입력받아 입력 받은 달의 달력 출력
		Scanner sc = new Scanner(System.in);
		System.out.printf("년 입력 : ");
		int year = sc.nextInt();
		System.out.printf("월 입력 : ");
		int month = sc.nextInt();

		while (true) {

			int days = 365 * (year - 1);

			for (int i = 1; i <= year; i++) {
				if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0))
					days++;
			}

			switch (month) {
			case 12:
				days = days + 30;
			case 11:
				days = days + 31;
			case 10:
				days = days + 30;
			case 9:
				days = days + 31;
			case 8:
				days = days + 31;
			case 7:
				days = days + 30;
			case 6:
				days = days + 31;
			case 5:
				days = days + 30;
			case 4:
				days = days + 31;
			case 3:
				if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
					days = days + 29;
				else
					days = days + 28;
			case 2:
				days = days + 31;
			case 1:
				days += 0;
			}

			days += 1; // 입력한 달의 1일자 요일을 구하기 위해 날짜합산에 1을 더함
			int temp = days % 7; // 0(일)~6(토)

			System.out.println();
			System.out.println(year + "년 " + month + "월");
			System.out.println("---------------------------------------");
			System.out.println(" 일\t 월\t 화\t 수\t 목\t 금\t 토");
			System.out.println("---------------------------------------");

			int k;
			for (k = 1; k <= temp; k++) {
				System.out.printf("\t");
			}

			int lastDay = 0;
			switch (month) {
			case 12:
			case 10:
			case 8:
			case 7:
			case 5:
			case 3:
			case 1:
				lastDay = 31;
				break;
			case 11:
			case 9:
			case 6:
			case 4:
				lastDay = 30;
				break;
			case 2:
				if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
					lastDay = 29;
				else
					lastDay = 28;
				break;
			}

			for (int i = 1; i <= lastDay; i++) {
				System.out.printf("%2d\t", i);
				if (k % 7 == 0)
					System.out.println();
				k++;
			}

			System.out.printf("\n\n[1. 이전 달]\t[2. 다음 달]\t[3. 종료] : ");
			int input = sc.nextInt();
			if (input == 3) {
				System.out.println("종료.");
				break;
			}else if(input == 2) {
				if(month == 12) {
					month = 1;
					year++;
				}else month++;
			}else if(input == 1) {
				if(month == 1) {
					month = 12;
					year--;
				}else month--;
			}
				
		}

	}

}
