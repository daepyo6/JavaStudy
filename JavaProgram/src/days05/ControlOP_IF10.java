package days05;

import java.util.Scanner;

public class ControlOP_IF10 {

	public static void main(String[] args) {
		
		// 2022년 1월 1일은 토요일
		// 2022년에 한해서 월과 일을 입력받은 후 해당날짜의 요일을 출력하세요.
		int month, day, days = 0;
		Scanner sc = new Scanner(System.in);
		System.out.printf("월 입력 : ");
		month = sc.nextInt();
		System.out.printf("일 입력 : ");
		day = sc.nextInt();
		
		if(month==1) days = 0;
		else if(month==2) days = 31;
		else if(month==3) days = 31+28;
		else if(month==4) days = 31+28+31;
		else if(month==5) days = 31+28+31+30;
		else if(month==6) days = 31+28+31+30+31;
		else if(month==7) days = 31+28+31+30+31+30;
		else if(month==8) days = 31+28+31+30+31+30+31;
		else if(month==9) days = 31+28+31+30+31+30+31+31;
		else if(month==10) days = 31+28+31+30+31+30+31+31+30;
		else if(month==11) days = 31+28+31+30+31+30+31+31+30+31;
		else if(month==12) days = 31+28+31+30+31+30+31+31+30+31+30;
		
		days = days + day;
		int temp = days % 7;
		
		if(temp == 1) System.out.println("토요일입니다.");
		else if(temp == 2) System.out.println("일요일입니다.");
		else if(temp == 3) System.out.println("월요일입니다.");
		else if(temp == 4) System.out.println("화요일입니다.");
		else if(temp == 5) System.out.println("수요일입니다.");
		else if(temp == 6) System.out.println("목요일입니다.");
		else if(temp == 0) System.out.println("금요일입니다.");
	}

}
