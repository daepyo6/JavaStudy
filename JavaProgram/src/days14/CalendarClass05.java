package days14;

import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class CalendarClass05 {

	public static void main(String[] args) {

		int year, month;
		int input = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("연도 입력 : ");
		year = Integer.parseInt(sc.nextLine());
		System.out.print("월 입력 : ");
		month = Integer.parseInt(sc.nextLine());
		
		// 입력한 월의 1일자와 말일자를 두개의 객체에 설정후 시작날 부터 끝날까지 출력.
		
		// 두개의 객체 생성
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		while(input!=3) {
			//2. 1일자와 말일자를 해당객체에 설정
			sDay.set(year, month-1, 1);
			//eDay.set(year, month-1, sDay.getActualMaximum(Calendar.DATE));
			eDay.set(year, month, 1);
			eDay.add(Calendar.DATE, -1);
		
			//3. 1일자의 요일 호출
			int startWeek = sDay.get(Calendar.DAY_OF_WEEK);
			
			// 달력의 타이틀 출력
			System.out.println(year + "년" + month + "월");
			System.out.println("=======================");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			System.out.println("=======================");
			
			// 4. 1일차 까지 빈칸 출력
			for (int i = 1; i < startWeek; i++) {
				System.out.print("\t");
			}
			
			// 5. 1일자부터 말일자까지 날짜 출력 / startWeek를 날짜마다 늘리면서 7의 배수일때 줄바꿈
			for (int i = 1; i <= eDay.get(Calendar.DATE); i++) {
				System.out.print(i+"\t");
				if(startWeek%7==0)
					System.out.println();
				startWeek++;
			}System.out.println();
			System.out.println("=======================\n");
			
			System.out.print("[1.이전달] [2.다음달] [3.종료]");
			input = Integer.parseInt(sc.nextLine());
			
			if(input==3) {
				System.out.println("종료");
				break;
			}else if(input == 2) {
				//month+=1;
				//if(month==12) { month = 1; year += 1; }
				sDay.add(Calendar.MONTH, 1);
				year = sDay.get(Calendar.YEAR);
				month = sDay.get(Calendar.MONTH)+1;
				eDay.set(year, month-1, sDay.getActualMaximum(Calendar.DATE));
			}else if(input == 1) {
				//month-=1;
				//if(month==1) { month = 12; year -= 1;}
				sDay.add(Calendar.MONTH, -1);
				year = sDay.get(Calendar.YEAR);
				month = sDay.get(Calendar.MONTH)+1;
				eDay.set(year, month-1, sDay.getActualMaximum(Calendar.DATE));
			}else {
				System.out.println("잘못 입력했습니다.");
			}
			
			
			
			
			
		}
		
		
			
		
		
		
		
	}

}
