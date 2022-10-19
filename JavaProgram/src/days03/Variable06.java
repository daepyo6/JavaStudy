package days03;

import java.util.Scanner;

public class Variable06 {

	public static void main(String[] args) {
		/* 기본형 변수
		 	정수형 : byte, short, int, long
		 	실수형 : float, double
		 	문자형 : char
		 	진위형 : boolean
		 	기본형 자료 - 자료형을 코딩했을 때 굵은 자주색 폰트로 표시되는 자료형, 위에 쓴 자료형들이 모두 해당
		 */
		
		int a;
		double b;
		char c;
		boolean d;
		String s; // 문자열(String) : 객체 자료형. 정해진 자료의 용량은 없음.
		
		/* 정수(long)와 실수(float) 자료를 표시하는 별도의 방법
			정수의 기본형은 int 
		*/
		int a1 = 100;
		// byte a2 = a1; < 에러. int는 4바이트 byte는 1바이트, int형 자료를 byte형 변수에 넣으면 
		//	데이터 손실이 일어나 에러를 발생
		
		double b1 = 123.456;
		float b2 = 123.456F;
		
		// 변수의 선언 방법
		// 1. 변수 선언 후 값을 할당(대입)
		int n1;
		n1 = 10;
		// 2. 변수 선언과 값의 대입을 동시에 처리
		int n2 = 10;
		// 3. 다수개의 변수를 한번에 선언하는 방법 (동일한 자료형만 가능)
		int n3, n4, n5;
		// 4. 다수개의 변수를 값을 대입하면서 생성
		int n6 = 60, n7 = 70;
		// 5. 처음부터 모든 변수에 값을 대입할 필요는 없음
		int n8, n9 = 90, n10;
		
		/* 변수의 선언 위치
			변수를 사용하기 전이라면 위치에 상관없이 변수 선언 가능
			변수는반드시 선언 후에 사용가능, 선언 전에 사용하는 변수는 오류
		*/
		
		int v1 = 10;
		System.out.println("v1의 값 : " + v1);
		
		//System.out.println("v3의 값 : " + v3); - 에러. 실행 순서상 만들어지지 않은 변수 사용
		int v3 = 30;
		System.out.printf("v3의 값 : %d\n", v3);
		
		// 변수 선언 이후라도, 값이 대입되지 않으면 사용이 불가
		int v4;
		//System.out.printf("v4의 값 : %d\n", v4); - 에러
		v4 = 40;
		System.out.printf("v4의 값 : %d\n", v4);
		
		// char에는 아스키코드 값이 있어서 char들 간의 산술연산도 가능
		// 대문자 B값에 32를 더하여 소문자 b로 변경
		char ch = 'B';
		System.out.printf("%c + 32 > %c\n", ch, ch+32);
		// 알파벳 'A'의 아스키 코드 : 65, 알파벳 'a'의 아스키 코드 : 97 둘 사이의 차이는 32입니다.
		// 아라비아 기호의 '8'에서 아라비아 기호 '0'을 빼면, 수치 데이터 정수 8의 결과로 나옵니다.
		System.out.printf("'8' - '0' > %d\n", '8'-'0');
		
		/* 실수형 변수의 값 대입 or 초기화
		 	자바에서 보든 실수 들은 별도의 표기가 없으면, 기본적으로 double 타입
		 */
		// float 타입으로 값을 저장하기 위해서는 float형 변수를 선언하고 float형 데이터를 저장.
		// float 변수에 double형 데이터 입력 > 에러
		// float f1 = 123.456;
		//float 변수에 float형 데이터 입력 > 정상
		float f2 = 123.456f;
		
		//float 변수에 형 변환(캐스팅)을 적용한 double형 데이터 입력 > 정상
		double f3 = 1.123;
		float f4 = (float) f3;
		// 용량이 큰 자료형(double)에 작은 자료형(float)을 대입 > 정상
		float f5 = 123.123f;
		double f6 = f5; // 형 변환(캐스팅) 필요없음
		
		//정수들의 값 대입
		int a5 = 100;
		byte b5 = (byte) a5;
		//byte b6 = a;  // 에러. 변수를 이용한 값의 대입은 캐스팅이 필요
		byte b7 = 123; // 일반 값에 의한 대입은 캐스팅 필요없음 (정수에 한해서)
		a5 = b5; // 용량이 작은 자료형을 큰 자료형에 대입은 정상
		// 용량이 큰 변수 값을 작은 변수 값을 넣으려고 하면 캐스팅 필요
		// 반대의 경우는 문제없이 모든 실행 가능
		
		

	}

}
