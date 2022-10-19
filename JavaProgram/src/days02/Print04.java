package days02;

public class Print04 {

	public static void main(String[] args) {
		/*	System.out.println();
			위 명령은 System.out.printf();에서 \n이 없어도 모든 출력후에 마지막에 한번 줄바꿈을 하는 기능이 포함
			println()은 printf()의 format 기능이 없기 때문에 "%d %s %f"는 사용하지 못합니다.
			다만 \n \t \' \" 등은 사용이 가능합니다.
			만약 System.out.println(\n); 이라고 한다면, 이는 두줄을 개행하라는 뜻입니다.
		*/ 
		
		// 비교적 printf보다 출력이 간단합니다.
		System.out.println(10); // 정수 10 출력
		System.out.println(10*20); // 10*20 값 출력
		System.out.println(12.123); // 실수 12.123 출력
		System.out.println(12.123/12.3); // 나눗셈 결과 출력
		System.out.println("Java Programming"); // 문자열 출력
		
		//10*20=200
		System.out.println(10 + "x" + 20 + "=" + 10*20);
		// 문자와 문자의 +연산 > 문자의 이어붙이기 결과      문자와 숫자의 +연산 > 이어붙이기 결과
		
		// 10_12.123
		System.out.println(10 + "_" + 12.123);
		/* 문자와 다른 자료형(숫자 등)의 +연산의 결과는 이어붙이기된 문자자료입니다.
			System.out.println();는 한개의 문자자료를 출력하는 것과 마찬가지입니다.
			
			
			문자와 숫자의 다른점
			1. 표면상으로 그 둘은 ""안에 쓰였냐 안쓰였냐로 구분
			2. 123은 백이십삼이라고 읽지만, "123"은 일이삼이라고 읽습니다.
			3. 987은1234보다 작지만, "987"은 "1234"보다 크다라고 말합니다.
			
			- 문자들간의 비교는 첫글자부터 하나씩 같은 위치의 글자와 비교
			- 첫글자에서 크기가 결정되면 그 다음은 비교하지 않음
			- 두번째 글자를 비교하는 경우는 첫번째 글자가 같을때에 한해서만 비교
			- 두번째 글자도 같으면 세번째 글자 비교
			- 사전에서 찾았을때 문저 나오는 글자를 작다라고 하고 뒤에 나오는 글자를 크다라고 함
		*/

		System.out.println("105를 표현하는 여러가지 방법, 비슷한 표현 예시");
		System.out.println("10" + "5");
		System.out.println("10" + 5);
		System.out.println(10 + "5");
		System.out.println(10 + 5); // 15
		
		// 10 + 5 = 15
		System.out.println("10 + 5 = 15");
		System.out.println(10 + " + " + 5 + " = "+ (10+5));
		// 사칙연산처럼 앞에서 부터 계산이 되서 10+5가 105로 나오기 때문에 ()로 묶어줘야 한다.
		
		 System.out.println("10 + 5" + " = " + (10+5));
		 System.out.println("10 + 5 = " + (10+5));
		 System.out.println("10 + 5 = 1" + 5);
		
	}

}
