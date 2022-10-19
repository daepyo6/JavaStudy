package days04;

public class Operator04 {
	
	public static void main(String[] args) {
		// 캐스팅 연산 & 자료의 형변환
		
		byte b1 = 10;
		/*
		 * 정수 데이터에 별도의 표시가 없으면 그 데이터는 int형 입니다.
		 * 위 명령의 byte변수에 int형 자료를 대입하는 동작은 원래 에러가 발생하고 캐스팅연산이 필요하지만 정수에 한해서 생략가능
		 * byte b1 = (byte)100; 원래는 이과 같이 써야 맞습니다.
		 * 생략이 가능한건 단순 정수데이터를 정수형(byte, short)변수에 대입하는 동작까지만 가능합니다.
		 */
		byte b2 = 30;
		byte b3 = (byte)(b1 + b2); // 에러
		// 정수(int, byte, short)들의 산술연산의 결과는 모두 int 이기 때문에 위의 연산은 에러입니다.
		System.out.println(b3);
		
		// double -> int
		double d1 = 1.123456;
		int a = (int)d1;
		// int -> double
		double d2 = (double)a;  // d2 변수에 1.0이 저장
		System.out.println(d2);
		// double d2 = a; // 데이터 손실이 일어나지 않는 형변환은 캐스팅 연산이 생략 가능
		
		// char -> int
		char c ='A';
		a = (int)c;      // 65
		System.out.println(a);
		// int -> char
		a = 97;
		c = (char)a;	  // 'a'
		System.out.println(c);
		
		// long -> int
		long a2 = 10000000000L;
		// int의 범위값은 L을 생략 가능
		int a3 = (int) a2;
		System.out.println(a3);
		
		// double -> float
		double f1 = 123.123;
		float f2 = (float)f1;
		
		// String -> int 아라비아기호로만 구성된 String을 int형으로 변환
		String s1 = "1234";
		
		// 잘못된 예 
		// int a4 = (int)s1; // 에러
		// String 변수가 사용될 때 저장된 문자들이 사용되는 때는 다른 자료와 연산할 때이지만,
		// 지금처럼 혼자 연산될 때에는 문자들이 저장된 위치정보가 사용됨. 따라서 위의 내용은 에러입니다.
		
		// 반대의 경우에도 에러입니다.
		// 잘못된 예 (int -> String)
		int a5 = 12345;
		//String str2 = (String)a5; //에러
		
		// 호환이 되지 않는 자료들 간의 형 변환은 별도의 메서드가 필요
		// String -> int
		String str1 = "123456";
		int a4 = Integer.parseInt(str1);
		// int -> String
		int a6 = 123456;
		String str2 = String.valueOf(a6);
		
		// double -> String
		double d3 = 123.123;
		String str3 = String.valueOf(d3);
		
		// String -> double 
		String str4 = "123.123";
		double d4 = Double.parseDouble(str4);
		
		// String -> char
		String str5 = "ABCDEFG";
		char ch1 = str5.charAt(1);
		System.out.println(ch1);
		
		char c6 = 'A';
		String str6 = String.valueOf(c6);
		System.out.println(str6);
		
		
		
	}
}
