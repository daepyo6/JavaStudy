package days14;

import java.util.Calendar;

public class CalendarClass04 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(2022, 9, 17);
		System.out.println(dateToString(date));
		
		System.out.println("= 1일 후 =");
		date.add(Calendar.DATE, 1);
		System.out.println(dateToString(date));
		// add 메서드의 증감은 하나의 요소를 변경하지만, 그로인해 다른필드에 영향을 줄 수 있습니다.
		// 일을 변경하여 달이 바뀌거나, 월을 변경하여 년도가 바뀌는 변경등
		// 음수를 입력하면 이전날짜 또는 월, 년으로 설정할 수 있습니다.
		System.out.println("= 3달 전 =");
		date.add(Calendar.MONTH, -3);
		System.out.println(dateToString(date));
		
		System.out.println("= 40일 후 =");
		date.roll(Calendar.DATE, 40);
		// 다른필드에 영향을 주지 않고 해당 필드만으로 더하고 빼는 메서드,
		// 3월 1일에서 30을 더하면 3월 31일(30일)이 되고, 이후 10일이 더해서 다시 10이 나옴
		// 월에는 영향을 주지 않음 결과 3월 10일
		System.out.println(dateToString(date));
		
		
		
		
	}

	private static String dateToString(Calendar c) {
		String cDate = c.get(Calendar.YEAR)+"년 "
							+(c.get(Calendar.MONTH)+1)+"월 "
							+c.get(Calendar.DATE)+"일";
		return cDate;
	}

}
