package days05;

import java.util.Scanner;

public class ControlOp_For08 {

	public static void main(String[] args) {
		// 2022년에 한해서 연도와 월, 일을 입력받은 후 해당날짜의 요일을 출력하세요.
		int year, month, day, days = 0;
		Scanner sc = new Scanner(System.in);
		System.out.printf("연도 입력 : ");
		year = sc.nextInt();
		System.out.printf("월 입력 : ");
		month = sc.nextInt();
		System.out.printf("일 입력 : ");
		day = sc.nextInt();
		
		days = 365 * (year-1);
		// 1부터 y-1까지 반복하면서 해당 숫자가 윤년에 해당하는 연도와 같은 숫자라면 days에 1을 더합니다.
		for (int i = 1; i <= year-1 ; i++) {
			if((i%4 == 0) && (i%100 != 0) || (i%400 == 0)) {
				days = days + 1;
			}
		}
		// 입력한 연도가 윤년이라면 아래 switch문에 2월에 해당하는 숫자를 29로 바꿔서 계산합니다.
		switch(month) {
			case 12: days = days+30;
			case 11: days = days+31;
			case 10: days = days+30;
			case 9: days = days+31;
			case 8: days = days+31;
			case 7: days = days+30;
			case 6: days = days+31;
			case 5: days = days+30;
			case 4: days = days+31;
			case 3: 
				if((year%4 == 0) && (year%100 != 0) || (year%400 == 0)) days = days+29;
				else days = days+28;
			case 2: days = days+31;
			case 1: days += 0;
		}
	
		days = days + day;
		int temp = days % 7;
		
		switch(temp) {
		case 1: System.out.println("월요일입니다.");
			break;
		case 2: System.out.println("화요일입니다.");
			break;
		case 3: System.out.println("수요일입니다.");
			break;
		case 4: System.out.println("목요일입니다.");
			break;
		case 5: System.out.println("금요일입니다.");
			break;
		case 6: System.out.println("토요일입니다.");
			break;
		case 0: System.out.println("일요일입니다.");
			break;
		}

	}

}
