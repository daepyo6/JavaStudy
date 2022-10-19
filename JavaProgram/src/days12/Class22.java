package days12;

import java.util.Random;

// static 메서드

// static변수와 같이 프로그램 구동전에 메모리에 로딩되어서 객체 생성없이 호출될 수 있는 클래스의 멤버 메서드
// static변수 사용과 같이 메서드 이름 앞에 클래스이름과 (.)으로 연결해서 사용. 객체생성과 상관없이 사용


public class Class22 {

	public static void main(String[] args) {
		// java.lang 패키지에 있는 클래스중 static 메서드들의 실제 사용 예
		// 간단한 수학적 계산을 위해 만들어지 Math 클래스의 static 메서드들
		// sqrt, random, abs등
		// 클래스 내부에 정의된 메서드의 모습은
		// public static int abs(int n){ }
		// abs : 절대값 계산 메서드
		// sqrt : 제곱근 계산 메서드
		// random : 난수 발생 메서드
		
		// Math 클래스의 random과 같은 역할을 하지만 방식이 다르고, 특히 static이 아니라 인스턴트 멤버메서드로
		// 난수를 발생하는 클래스도 있습니다.
		Random rd = new Random();
		int a = rd.nextInt();
		// static 메서드는 클래스이름을 앞에 두고 호출되고, 인스턴스 메서드는 객체이름을 앞에두고 호출됩니다.
		double d = Math.random();
		
		//abs의 사용
		int num = -10;
		System.out.println("num : " +num+", num의 절대값 : "+Math.abs(num));
		
		//sqrt의 사용
		num = 9;
		System.out.println("num : " +num+", num의 제곱근 : "+Math.sqrt(num));
		
		// random의 사용
		System.out.println("Math클래스의 난수발생 static 메서드 값 : " + Math.random());
		System.out.println("0~32 난수 발생 static 메서드 값 : " + (int)(Math.random()*33));
		
		// Integer 클래스(int 타입의 자료형과 매칭되는 클래스)
		System.out.println("Integer의 MAX_VALUE : " + Integer.MAX_VALUE);
		System.out.println("Integer의 MIN_VALUE : " + Integer.MIN_VALUE);
		// 변수 선언시 static 키워드를 붙일 수 있지만 별도로 final이라는 키워드도 붙일 수 있는데
		// 이는 최초에 지정한 값이 끝까지 변경될 수 없는 변수로 만든다는 뜻입니다.
		
		// Integer.parseInt : String형으로 저장된 아라비아 기호들을 실제 숫자로 변환해주는 static메서드
		String strNum1 = "123";
		String strNum2 = "456";
		System.out.println("문자연산 : " +(strNum1+strNum2));
		System.out.println("정수 변환 후 연산 : " +(Integer.parseInt(strNum1)+Integer.parseInt(strNum2)));
		
		// Double 클래스 (double타입의 자료형과 매치되는 클래스)
		System.out.println("Double의 MAX_VALUE : " + Double.MAX_VALUE);
		System.out.println("Double의 MIN_VALUE : " + Double.MIN_VALUE);
		// Double.parseDouble
		strNum1 = "10.75";
		strNum2 = "5.2";
		System.out.println("문자연산 : " + (strNum1+strNum2));
		System.out.println("실수연산 : " + 
									(Double.parseDouble(strNum1)+Double.parseDouble(strNum2)));
		
		// String 클래스 (int -> String, double -> String, boolean -> String, ....)
		System.out.printf("%s, %s, %s\n", 123, 12.345, true);
		
		// int 또는 double형 자료를 String으로 변환 - valueOf()
		int intNum1 = 456;
		int intNum2 = 789;
		System.out.println("int 산술연산 : " + (intNum1+intNum2));
		System.out.println("문자변환 후 연산 : " + 
									(String.valueOf(intNum1)+String.valueOf(intNum2)));
		
		double doubleNum1 = 456.123;
		double doubleNum2 = 789.123;
		System.out.println("double 산술연산 : " + (doubleNum1+doubleNum2));
		System.out.println("문자변환 후 연산 : " + 
									(String.valueOf(doubleNum1)+String.valueOf(doubleNum2)));
		
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("int 산술연산 : " + (b1 && b2));
		System.out.println("문자변환 후 연산 : " + 
									(String.valueOf(b1)+String.valueOf(b2)));
		
		
		
		
		
		
		
	}

}
