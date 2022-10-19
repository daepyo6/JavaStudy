package days09;

import java.util.Scanner;

public class Method11 {

	public static void main(String[] args) {
		
		int year;
		boolean a;
		Scanner sc = new Scanner(System.in);
		System.out.print("연도 입력 : ");
		year = sc.nextInt();
		
		a = yoon(year); // 연도를 전달인수로 전달하여 윤년이면 true, 아니면 false를 리턴
		prn(a); // 변수 a값을 전달 받아 윤년 또는 평년을 출력하는 메서드

	}
	
	/*
	 * 메서드 사용에 따른 메서드 형태
	 * abc() : 전달인수가 없고 리턴도 없는 형태
	 * abc(10,20) : 전달인수가 2개 있고, 리턴 없음
	 * k = abc() : 전달인수가 없고, 리턴값은 있는 형태
	 * k = abc(10,20) : 전달인수가 2개 있고, 리턴값은 있는 형태
	 * ===================================
	 * 개발자 필요에 의해 만들어지는 메서드는 반드시 클래스안에 정의 되어야 함
	 * 생성된 메서드들 간에는 서로를 호출하여 사용가능
	 * 그들은 그들을 둘러싼 클래스에 속해져있는 멤버라고 부름
	 * 다만 서로를 자유롭게 호출하는 대상에서 main메서드는 제외
	 * main을 호출한다는건 프로그램을 시작한다는 뜻, 개발자에 의해 호출 될 수 없음
	 * ===================================
	 */

	private static boolean yoon(int year) {
		boolean check;
		check = year%4==0&&year%100!=0||year%400==0;
		return check;
	}

	private static void prn(boolean a) {
		if(a)
			System.out.println("윤년");
		else
			System.out.println("평년");
	}

}
