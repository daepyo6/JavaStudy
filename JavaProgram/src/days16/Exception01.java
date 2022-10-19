package days16;

// 예외 처리

// 에러(Error) : 잘못된 것, 에러가 존재하는 경우 실행이 될 수 없음
// 예외(Exception) : 잘못된 것, 특정 상황 또는 조건이 만족되는 경우 프로그램이 종료되는 현상
// 예외는 다양한 상황에 대해서 발생하는 현상으로 모든 예외를 대처할 수는 없습니다.
// 다만, 예외가 발생한 경우 프로그램이 종료되지 않고 저장과 같은 기능을 제공할 수 있어야합니다.
// (예외가 발생해도 프로그램이 강제 종료되지않고 사용자에게 선택권 또는 처리기회를 주는 것을 말합니다.)
// 예외처리 : 예외가 발생한 경우 프로그램이 강제 종료되지 않도럭 방지하는 것

public class Exception01 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			int k = (int)(Math.random()*10);
			try {	// 에러발생이 예상되는 곳부터 에러발생시 실행되면 안되겠다라고 생각되는 곳까지
				double res = 100 / k;
				// try 구문에 있는 명령이라도 에러가 발생한 구문 다음에 위치하는 명령은 실행하지 않습니다.
				System.out.println(100 + "/" + k+" = "+res );
			} catch (ArithmeticException e) {
				System.err.println("0으로 나눴습니다.");
			} catch (Exception e) {
				e.printStackTrace(); // 시스템 메세지로 에러내용을 표시하는 메서드 : 지금은 콘솔창에 표시
			}
			// try에서 에러가 발생하면 바로 catch 구문으로 이동해서 안의 명령을 대신 실행하고 프로그램 실행을 계속합니다.
			
			// ArithmeticException : 수학적 에러
			// try 불럭안에서 에러가 발생하면 해당 에러가 catch()안에 있는 에러의 종류인지 확인후
			// 종류가 맞으면 catch블럭 안의 명령 실행
			
			// Exception는 모두를 포함-수용하는 최상위 예외 클래스
		}

	}

}
