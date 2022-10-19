package days14;

import java.util.Calendar;

public class CalendarClass03 {
	
	public static void main(String[] args) {
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		time1.set(Calendar.HOUR_OF_DAY, 10);
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);
		
		time2.set(Calendar.HOUR_OF_DAY, 11);
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		
		printTime(time1);
		printTime(time2);
		
		System.out.println(time1.getTimeInMillis());
		// 밀리초 - 초 - 분 - 시 - 날짜를 모두 밀리초로 변경
		System.out.println(time2.getTimeInMillis());
		
		long dif = time2.getTimeInMillis() - time1.getTimeInMillis();
		
		
		System.out.println("time1과 time2의 차이는" + dif + "밀리초 입니다.");
		System.out.println("time1과 time2의 차이는" + dif/1000 + "초 입니다.");
		
		
	}

	private static void printTime(Calendar time) {
		System.out.println(time.get(Calendar.HOUR_OF_DAY)+"시 "
									+time.get(Calendar.MINUTE)+"분 "
									+time.get(Calendar.SECOND)+"."
									+time.get(Calendar.MILLISECOND)+"초");
		
		
	}
	
}
