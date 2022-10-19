package days02;

public class Variable01 {

	public static void main(String[] args) {
		System.out.println(35 + " + " + 38 +" = " + (35+38));
		System.out.println(35 + " － " + 38 +" = " + (35-38));
		System.out.println(35 + " × " + 38 +" = " + (35*38));
		System.out.println(35 + " ÷ " + 38 +" = " + (35/38.0));
		System.out.println(35 + " % " + 38 +" = " + (35%38));
		
		/* 변수() : 프로그램 실행 중 발생 또는 입력되는 데이터를 저장할 목적으로 만든 임시저장소
		 	프로그램 실행 명령시 생성, 프로그램 종료시 소멸 */
		
		//변수의 생성
		int a; // a 라는 이름의 정수형 변수를 생성
		/* 변수의 이름 만드는 규칙
		 	1. 인터넷 사이트 회원가입시 만드는 아이디 이름 규칙과 유사
		 	2. 영문과 숫자, 그리고 일부 특수문자(_)를 섞어 사용가능
		 	3. 첫글자는 반드시 영문으로 사용
		 	4. 중간에 공백이 있을 수 없음
		 	5. 너무 짧지 않게 약간의 의미를 부여하여 이름을 생성
		 	6. 변수의 이름이 너무 짧으면, 변수의 갯수가 많아졌을 때 서로의 용도를 구분하기 힘듬
		 	7. 변수의 이름이 너무 길면, 사용할 때마다 긴 이름을 타이핑해야하는 불편함이 있음
		 	8. 두가지 의미의 단어가 조합되어 변수이름이 만들어진다면 천단어는 소문자로, 두번째 단어 첫글자는 대문자로 생성
		 		ex) 덧셈의 결과를 저장할 변수이름 : plusResult
		 	9. 변수는 자료형(정수, 실수, 문자)에 따라 만드는 명령이 달라짐
		 	
		 	int : 정수 double : 실수 String : 문자등
		 	int a;
		 	double b;
		 	String c; 
		 */
		int b;
		int plusResult, minusResult, mutiplyResult; // 한번에 여러 정수형 변수를 생성
		double divideResult; // divideResult라는 실수형 변수를 생성
		
		//a = 123.12; // 정수형 변수에 실수자료를 대입하면 소수점 아래 데이터 손실이 일어나기 때문에 에러
		divideResult = 10; // 실수형 변수에 정수를 저장하는건 데이터 손실이 없으므로 정상 실행
		
		a = 47;
		b = 38;
		
		plusResult = a+b; // 연산에 변수 이름을 쓰면 변수에 저장된 값이 연산됩니다.
		// 연산의 결과가  = 연산자에 의해 plusResult 변수에 저장
		minusResult = a-b;
		mutiplyResult = a*b;
		divideResult = a/b;
		
		// System.out.println 안에 변수이름을 쓰면, 그 변수에 저장된 값이 출력
		System.out.println(a + " + " + b +" = " + plusResult);
		//System.out.println(a + " + " + b +" = " + (a+b));
		System.out.println(a + " － " + b +" = " + minusResult);
		System.out.println(a + " × " + b +" = " + mutiplyResult);
		System.out.println(a + " ÷ " + b +" = " + divideResult);
		
		boolean b1; // 참(true) 또는 거짓(false) 중 하나를 저장하는 자료형 변수
		b1 = true;  // 또는 false를 지정할 수 있음
		System.out.printf("변수 b1의 값 : %b\n", b1);
		System.out.println("변수 b1의 값 : " + b1);
		// boolean 자료를 printf로 출력할때 %b를 사용합니다.
		
		/* int : 정수형 자료형 4Byte형 정수
		 	long : 정수형 자료형 8Byte형 정수
		 	float : 실수형 자료형 4Byte형 정수
		 	double : 실수형 자료형 8Byte형 정수
		 	char : 문자(글자) 자료형 '', 'a', 'b'   2Byte, String과는 다름
		 	Stirng : 문자열 자료형 "", "a", "abc" 0글자에서 글자갯수 제한 없이 저장 할 수 있는 자료형
		 				String은 현재 자료형이라고 부르지만 엄밀히 보면 자료형이라기 보다 클래스(객체)라고 부르는게 정확한 표현
		 	boolean : 진위형 자료, 1Byte형 자료 (true/false만 저장 가능)  
		 	
		 	byte : 1Byte형 정수   
		 	short : 2Byte형 정수   
		 	
		 	저장용량의 최소 단위 : 1bit ( 0 또는 1(이진수) 중 하나를 저장 )
		 	2bit > 00 01 10 11(4개 중 하나 저장)  
		 	3bit > 000 001 010 011 100 101 110 111(8개 중 하나 저장)
		 	3bit는 10진수로 쳤을때  0~7까지 저장가능
		 	8bit = 1byte 00000000 ~ 11111111 (256개 중 하나 저장가능) 0~255
		 */
			
		byte b2; // -128 ~ 127
		
		/* 16bit = 2byte 0000000000000000 ~ 1111111111111111 
		 	65536개 중 하나 저장가능 0~65535(십진수)   -32768~32767(정수) 
		 	int(4byte) = -2147483648 ~ 2147483647 
		 	
		 	예전 시스템의 int - 2byte  (-32768 ~ 32767)
		 	현재 시스템의 int - 4byte  (-2147483648 ~ 2147483647 )
		 	
			double - 8byte 0.00002 => 0.2 x 10의 -4승  : 변수에 저장되는 값 > 2와 -4
			10의 약 -308승 ~ 308승	
		 */
		
		char c;
		c = 'A';
		System.out.printf("변수 c의 값 : %c\n",c);
		System.out.println("변수 c의 값 : " + c);
		
		String string;
		string = "ABCD";
		System.out.printf("변수 string의 값 : %s\n",string);
		System.out.println("변수 string의 값 : " + string);
		
		a=16;
		b=52;
		
		c='+';
		plusResult = a+b; 
		System.out.printf("%d %c %d = %d\n", a, c , b, plusResult);
		
		c='-';
		minusResult = a-b;
		System.out.printf("%d %c %d = %d\n", a, c , b, minusResult);
		
		c='x';
		mutiplyResult = a*b;
		System.out.printf("%d %c %d = %d\n", a, c , b, mutiplyResult);
		
		c='÷';
		divideResult = a/b;
		System.out.printf("%d %c %d = %.2f\n", a, c , b, divideResult);
		
	}

}
