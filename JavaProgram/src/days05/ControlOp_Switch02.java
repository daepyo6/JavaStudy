package days05;

import java.util.Scanner;

public class ControlOp_Switch02 {

	public static void main(String[] args) {
		// 2022년에 한해서 월과 일을 입력받은 후 해당날짜의 요일을 출력하세요.
		int month, day, days = 0;
		Scanner sc = new Scanner(System.in);
		System.out.printf("월 입력 : ");
		month = sc.nextInt();
		System.out.printf("일 입력 : ");
		day = sc.nextInt();
		
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
			case 3: days = days+28;
			case 2: days = days+31;
			case 1: days += 0;
		}
	
		days = days + day;
		int temp = days % 7;
		
		switch(temp) {
		case 1:
			 System.out.println("토요일입니다.");
			break;
		case 2:
			 System.out.println("일요일입니다.");
			break;
		case 3:
			 System.out.println("월요일입니다.");
			break;
		case 4:
			 System.out.println("화요일입니다.");
			break;
		case 5:
			 System.out.println("수요일입니다.");
			break;
		case 6:
			 System.out.println("목요일입니다.");
			break;
		case 0:
			 System.out.println("금요일입니다.");
			break;
		}

	}

}
