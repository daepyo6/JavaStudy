package days13;

class SuperE{
	int superNum;
	void abc() {
		System.out.println("Super Method");
	}
	
}

class SubE extends SuperE{
	int subNum;

	@Override
	void abc() {
		System.out.println("Sub Method");
	}

}



public class Extends08_TypeCasting02 {

	public static void main(String[] args) {
		
		// 부모클래스의 객체 생성
		SuperE super1 = new SuperE();
		// 자식클래스의 객체 생성
		SubE sub1 = new SubE();
		
		// 객체간의 TypeCasting #1
		// 부모클래스의 참조변수에 자식클래스의 인스턴스 주소는 아무런 조치없이 저장 가능합니다.
		// 부모참조변수 <- 자식 인스턴스의 주소 OK
		super1 = new SubE(); // super1 = sub1; 자식클래스의 주소 저장. 자동캐스팅(스마트캐스팅)
		SuperE super2 = new SubE(); // 새인스턴스의 주소 저장
		
		// 객체간의 TypeCasting #2
		// 자식클래스의 참조변수에 부모클래스의 인스턴스 주소는 아무런 조치없이 저장 할 수 없습니다.
		// 자식참조변수 <- 부모 인스턴스의 주소 x
		// SubE sub2 = new SuperE(); //에러
		SuperE super3 = new SuperE();
		// SubE sub2 = super3 //에러

		// 객체간의 TypeCasting #3
		// 자식클래스의 참조변수에 부모클래스의 인스턴스 주소를 그래도 저장하고 싶다면 강제캐스팅을 이용할 수는 있음
		SuperE super4 = new SuperE();
		//SubE sub4 = (SubE)super4; // 런타임 에러
		// 코드 작성상에는 문제가 없으나, 프로그램을 실행하면 에러가 발생합니다.
		// 부모인스턴스가 강제캐스팅(SubE)를 앞에 두고 아무리 자식인척해도 언젠가는 부모인게 들통난다는 뜻
		
		// 객체간의 TypeCasting #4
		// 만약 #3에서 super4 참조변수가 저장하고 있는 인스턴스 주소가 자식 인스턴스 주소였다면,
		// (부모클래스 참조변수는 자식클래스 인스턴스 주소를 저장 할 수 있습니다.)
		// 그렇다면 SubE sub4 = (SubE)super4; 이 코드는 정상 실행합니다.
		// 결과적으로 자식인스턴스 주소를 자식 참조변수에 저장한 셈이 되므로 정상실행
		SuperE super5 = new SubE();  	// 부모 참조변수 <- 자식 인스턴스 주소
		SubE sub5 = (SubE)super5;		// 자식 참조변수 <- (부모 참조변수 <- 자식 인스턴스 주소)
		
		// 자식 레퍼런스 <- (타입캐스팅) 부모 레퍼런스 <- 자식 인스턴스 주소 - 정상
		// 자식 레퍼런스 <- (타입캐스팅) 부모 레퍼런스 <- 부모 인스턴스 주소 - 런타임에러
		// 자식인스턴스 주소가 부모참조변수에 저장될때는 문제가 없지만,
		// 다시 나와서 자식참조변수에 저장될때는 강제캐스팅이 반드시 필요
		
		// 객체간의 TypeCasting #5
		// #1에서 자식인스턴스 주소를 저장한 부모참조변수는 부모클래스에서 물려준 멤버들에만 접근이 가능
		SuperE super6 = new SubE();	// 부모 참조변수 <- 자식 인스턴스 주소
		super6.superNum = 100;			// 부모가 물려준 멤버변수 사용가능
		//super6.subNum = 200; 			// ***** 에러. 자식 멤버변수에는 접근이 불가능합니다.
		super6.abc();							// ***** 부모클래스 메서드보다 재정의된 자식클래스가 우선 실행됩니다.
		
		// 부모참조변수로 접근이 불가능한 자식멤버변수를 사용하려면...
		// -> 저장된 자식인스턴스 주소를 자식참조변수에 옮겨담고 접근하는 수 밖에 없습니다.
		SubE sub6 = (SubE)super6;
		sub6.subNum = 300;
		
		// 객체간의 TypeCasting #6
		// #4에서 있었던 "자식 레퍼런스 <- (타입캐스팅)부모 레퍼런스 <- 부모 인스턴스의 주소  -  런타임 에러
		// 이 에러를 방지하는 방법.
		SuperE super81 = new SubE();
		SuperE super82 = new SuperE();
		SubE sub8 = new SubE();
		
		if(super81 instanceof SubE) {
			sub8 = (SubE)super81;
			System.out.println("super81 형변환 성공");
		}else System.out.println("super81 형변환 실패");
		
		if(super82 instanceof SubE) {
			sub8 = (SubE)super82;
			System.out.println("super82 형변환 성공");
		}else System.out.println("super82 형변환 실패");
		
		
	}

}
