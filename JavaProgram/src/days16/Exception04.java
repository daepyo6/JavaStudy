package days16;

public class Exception04 {

	public static void main(String[] args) {
		
		try {
			method01();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void method01() throws Exception {
		
		method02();
		/*
		try {
			method02();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	
	}

	private static void method02() throws Exception {
		
		throw new Exception(); // 강제 예외 발생
		// 예외 상황에 마우스를 올리고, 풍선 도움말처럼 표시되는곳에서 메뉴를 선택합니다.
		// 1. Add throw declaration
		// 2. Surround with try-catch
		// 2번을 선택하면 try-catch가 추가되며, 이는 현재 메서드에서 에러처릴 마무리 하겠다는 뜻입니다.
		// 또는 수동으로 try-catch를 사용해줄 수도 있습니다
		/*
		 	try {
			throw new Exception();
			} catch (Exception e) {
			
			}
		 */
		
		// 1번을 선택하면 현재메서드의 이름 옆에 throws Exception이라는 구문이 붙으면서
		// method02를 호출하는 명령에 예외처리 상황이 이동됩니다.
		
		
		
	}

}





