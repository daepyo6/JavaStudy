package days09;

import java.util.Scanner;

public class Method09 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 출력 : ");
		int num = sc.nextInt();
		
		int sq = squar(num); // 전달인수로 전달된 값의 제곱을 계산하는 메서드
		// squar 메서드가 실행되고, 실행된 결과를 squar메서드 내에서 출력하는게 아니라
		// 결과만 되돌려 받아서 호출된 곳에서 결과를 출력
		System.out.println(sq);
		
		int maxValue = max(10, 34, 67);
		System.out.println(maxValue);
		
		max(65,87,12);  // 문법적으로 오류는 아니지만 열심히 계산하고 결과를 버리는 셈
		// 리턴값이 있는 메서드 호출시 반드시 리턴값을 받아는 변수가 있어야하는 것은 아닙니다.
		// 다만 리턴이라는 명령을 쓰는 목적은 실행결과를 되돌려 받아서 쓰려는 목적이므로,
		// 목적에 맞게 사용하는 것이 올바를 사용
		maxValue = max(65,87,12);
		
		// 또한 메서드실행의 리턴값은 변수에 저장 할 수 있을뿐 아니라
		// 다음과 같이 다른 메서드 또는 연산의 일부로 사용 가능
		System.out.println(max(65,87,12));
		// 리턴된 값이 System.out.println의 출력내용으로 사용
		int k = 10 + max(65,87,12);
		// 리턴된 값이 10과 덧셈연산이 실행
		System.out.println(k);
	}
	
	private static int max(int a, int b, int c) {
		int max;
		if(a>b) max = a;
		else max = b;
		if(c>max) max = c;
		
		return max;
	}

	private static int squar(int n) {
		int sqNum = n * n;
		return sqNum; //메서드가 실행된 결과를 되돌려주는 명령 : return
		// 그동안 형식적으로 void라고 썼던곳에 리턴되는 값의 자료형을 써줌
		// 그동안 썼던 void는 리턴값이 없다는 뜻으로 썼던 키워드입니다.
	}

}
