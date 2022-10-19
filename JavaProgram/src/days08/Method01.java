package days08;

public class Method01 {
	// Method : Function이라고도 부르며,
	// 간혈적으로 반복되는 코드들을 별도로 정의 해놓고,
	// 정해놓은 이름으로 그 코드들을 이름불러서 실행하는 단위실행코드
	// 자바에서는 Function보다 Method라는 표현을 주로 씁니다.
			
	/* 특징
		1. 명령들이 모여서 기능을 정의하는 단위
		2. 일련의 실행코드들을 묶어서 재활용
		3. 메서드는 각 메서드마다 고유한 이름이 있음
		4. 메서드가 이름이 불리워져서 실행되라는 명령 (Call-호출)을 받으면,
			그 메서드의 몸체를 이루는 코드들이 실행되는 형식
		5. 자바의 메서드는 이름 옆에 항상 ()를 달고 나옴
		6. 메서드의 생성 :  반드시 클래스의 내부에서만 만들 수 있습니다.
		7. main 메서드 위쪽 또는 아래쪽에 만들 수 있음
	*/

	public static void main(String[] args) {
		
		System.out.println("프로그램이 시작되었습니다.");
		System.out.println("abc 메서드가 호출됩니다.");
		abc(); // 메서드의 이름을 불러서 호출
		// 메서드가 하나 호출되면, 메서드의 몸체로 포커스가 이동한 뒤, 그 몸체를 모두실행하고 원래 자리로 돌아옵니다.
		System.out.println("abc 메서드가 호출하고 돌아왔습니다.");
		abc();
		System.out.println("main 메서드가 실행중입니다  ---------------- ");
		System.out.println("프로그램 실행중입니다  ---------------- ");
		abc();
		System.out.println("프로그램 종료 -----------------");

	}
	
	// 메서드의 정의
	// 개발자가 정의한 메서드의 위치는 main 메서드 위나 아래 모두 정의 가능
	// public static void : 지금은 메서드 정의할 때 앞에 붙이는 문법 요소라고 생각
	// 개발자가 정의한 메서드는 이름도 개발자 마음대로 필요한 이름으로 정의
	public static void abc() {
		System.out.println("1번째 프린트 메서드");
		System.out.println("2번째 프린트 메서드");
		System.out.println("3번째 프린트 메서드");
		System.out.println("4번째 프린트 메서드");
	}

}
