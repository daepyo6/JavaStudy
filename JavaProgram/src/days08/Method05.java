package days08;

public class Method05 {

	public static void main(String[] args) {
		int num = 100;
		System.out.println("main에서의 num : " + num);
		updateValue(200);
		// 메서드 호출시 전달인수로 사용되는 변수는 변수가 저장한 값의 복사본을 전달인수로 보낸다는 뜻
		// 호출된 메서드에서 전달값을 변경하더라도 호출한 곳의 변수값에는 영향을 줄 수 없다.								 
		
		System.out.println("main에서의 num : " + num);
	}
	
	/* 1. 매서드 호출할떄 전달인수로 넣어주는 변수와 updateValue매서드 영역의
		    매개변수로 쓰이는 변수의 이름은 같아도 상관없음
		    위에서 언급한 두 변수는 지역변수라고 부르며, 서로 다른 변수로 사용됨
		2. 전달인수의 변수값이 매개변수 변수로 "값"만 전달되는 방식을 Call by Value라고 부름
	*/
	public static void updateValue(int num) {
		// TODO Auto-generated method stub
		num = 200;
		System.out.println("updateValue의 num : " + num);
		
	}

	
}
