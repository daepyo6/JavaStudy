package days05;

public class ControlOp_For01 {

	public static void main(String[] args) {
		
		/*
		 * for 명령 : 반복실행 명령 
		 * 사용양식 
		 * for (  ;  ;  ) {  }
		 * ()안에 반복의 횟수를 조절할 수 있는 문구들을 ';'로 구분해서 입력
		 * 그리고 그 조절된 횟수만큼 {}안에 내용을 반복 실행
		 * 
		 * ()안은 ';'로 구분해서 세가지의 내용을 입력
		 * 작성되는 세가지의 내용은 반복횟수를 지정할 구성요소들이며, 그 안에는 반복횟수를 조절하는데 이용될 변수가 존재
		 * 
		 * 첫번째 요소 : 반복을 제어할 변수의 최초값을 대입
		 * 두번째 요소 : 반복을 계속할 조건이 되는 관계 연산식을 입력
		 * 					 관계연산식의 결과가 true면 반복을 계속 이어나가고 false이면 반복을 멈춥니다.
		 * 세번째 요소 : 첫번째 요소에서 최초값이 대입된 변수의 증감량(반복 1회마다 조정됨)을 지정
		 */
		int i;
		for (i = 0; i < 5; i++) {
			System.out.println("겁나 쉬운 자바 프로그래밍");
		}
		System.out.println(i);
		System.out.println();
		/*
		 * 첫번째 요소 : i변수가 0을 최초로 갖고 반복이 시작됩니다.
		 * 두번째 요소 : i값이 10보다 작으면 현재의 반복실행을 진행합니다.
		 * 세번째 요소 : 반복이 특정횟수를 실행하고 끝날수 있게 매 반복시마다 계산할 i변수의 증감연산을 실행
		 * 					 1증가 i++, 1감소 i--, 2증가 i=i+2(i+=2), 2감소i=i-2(i-=2)
		 */
		for (int j = 0; j < 5; j++) { //반복실행 제어변수는 반복문 안에서 선언과 동시에 초기화 가능
			System.out.println("1겁나 쉬운 자바 프로그래밍");
		}
		//System.out.println(j);  에러. j는 for문안에서 생성된 지역변수이기 때문에 for문이 끝나면 없어짐
		System.out.println();
		
		for (i = 0; i < 5; i++) {
			System.out.println("2겁나 쉬운 자바 프로그래밍");
		}
		System.out.println(i);
		System.out.println();
		
		//for문에 속한 반복대상 명령이 하나라면 {} 생략가능
		for(i=0;i<5;i++)
			System.out.println("3겁나 쉬운 자바 프로그래밍");
		
		/*
		 * 반복제어 변수의 위치에 대한 부연설명
		 * 변수의 수명 : 자신을 생성한 영역 {}이 끝나면 변수도 소멸
		 * 반복실행문 안쪽에 생성한 변수는 반복실행후 제어변수를 실행문이후에 사용하지 않을 때 사용
		 */
		
		
	}

}
