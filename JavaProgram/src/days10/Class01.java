package days10;

// 번호	이름 	국어	영어	수학	총점	평균
//------------------------------------------
//	1	   홍길동	 78	 89	76		256	78.2	
// 2	   홍길동	 78	 89	76		256	78.2	
// 3	   홍길동	 78	 89	76		256	78.2	

// 1. 각 자료를 각각의 낱개의 자료로 취급
// 2. 위 표에서 자료를 열별로 묶어서 같은 자료형끼리, 관련 자료형끼리 묶어서 취급 (관련 자료들을 그룹으로)
// 3. c언어의 구조체(Struct) 사용(여러 자료형을 갖는 자료 그룹으로 취급)
// 4. 구조체 그룹에 기능적인면을 추가해서 그 자체만으로도 프로그램으로 사용할 수 있게 취급, 자료와 메서드가 하나로.

/*
 	클래스
 	프로그램으로 처리하고자 하는 대상을 자료화하여 하나의 자료형으로 정의한 사용자 정의 자료형
 	쉽게말해 필요에 의해 기본자료형(int, double, char)외에 새롭게 정의한 자료형
 	한개 이상의 자료, 하나 이상의 자료형을 저장할수 있는 복합 자료형
 	활용되기 이전 정의만 되어있는 클래스는 정의영역(설계도, 원본)입니다.
 */

// 그동안 사용해오던 클래스 Scanner
// Scanner sc = new Scanner(System.in); 변수선언 (참조변수)

// 자바의 프로그램 단위는 클래스입니다.
// 하나의 프로그램 파일(xxx.java) 안에는 여러개의 클래스를 넣어서 사용할 수 있습니다.
// 여러개의 클래스 중 파일이름과 같은 클래스를 public으로 지정
// 그 클래스에는 보통 public static void main(){}이 존재
// 그 클래스에는 자료형으로서의 클래스이기보단 프로그램 실행 단위로서의 클래스입니다.

// 앞으로 우리가 만들어서 사용하거나, import해서 사용할 클래스는 자료저장&가공용 클래스입니다.
// 만드는 방법 : class (클래스이름)이라는 키워드를 사용
class Car{ //class 클래스이름 {}
	// 중괄호안에 필요한 변수들을 사용하고 선언
	int 변수1;
	double 변수2;
	String 변수3;
	int [] 배열1 = new int[5];
	// 멤버필드, 속성, 멤버변수, 필드 등....
	
	// 클래스내부에는 클래스 전용으로만 사용할 수 있는 멤버 메서드가 있습니다.
	public void 메서드1 () {
		
	}
	// 멤버 메소드는 대부분(특별할 경우를 제외하고) static 키워드를 사용하지 않습니다.
	// static으로 만들어진 메서드안에서 호출할일이 아직은 없기 떄문에 static을 붙이지 않습니다.
	public static void 메서드2 () {
		
	}
}

class First{
	int n1;
	int n2;
	// 속성(멤버필드, 멤버변수, 필드) : 클래스에 속한 정보(변수)들.
	// 속성은 변수로 생성하며 클래스의 멤버필드라고도 호칭
}


public class Class01 {
	
	public static void 메서드3() {
		
	} // static인 main에서 호출하려면 그 메서드는 static으로 만들어져야 합니다.
	
	public static void main(String[] args) {
		// 클래스를 만들면 그들을 프로그램에 적용하기 위해 클래스 변수를  클래스의 이름으로 생성
		First a1;
		// 생성된 변수는 레퍼런스(참조)변수 입니다.
		
		// 배열때와 마찬가지로 new 명령을 이용하여 heap영역에 적정공간(클래스가 정의한 크기만큼)을 확보한 후
		// 그 주소를 a1변수에 저장하여 사용, 레퍼런스 변수와 new에 의해 만들어진 공간이 합쳐지면, 이를 객체라고 함.
		a1 = new First();
		// 공간이 할당되면 이제부터, n1,n2 변수가 a1이라는 이름과 함께 사용이 가능
		
		First a2 = new First();
		// 객체가 두개가 만들어지면, a1에도 n1,n2가 생성이되고 a2에도 n1,n2가 생성되므로
		// 그들을 구분하기위해 a1.n1  a1.n2  a2.n1  a2.n2로 사용
		
		System.out.println(a1.n1);
		System.out.println(a1.n2);
		a2.n1 = 30;
		a2.n2 = 40;
		System.out.println(a2.n1);
		System.out.println(a2.n2);

	}

}
