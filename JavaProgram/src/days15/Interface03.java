package days15;

interface InterSuper1 {
	public abstract void InterSuper1_Test();
}

interface InterSuper2 {
	public abstract void InterSuper2_Test();
}

// 인터페이스를 implements 한다는 것은 부모인터페이스에 있는 추상메서드를 자식클래스에서 구현을 해,
// 더 이상 추상메서드가 아닌 완벽한 메서드로 완성한다는 뜻이기도 합니다.

// 그러나, 인터페이스들끼리의 상속은 상속 받는 곳도 인터페이스이기 때문에(아직 implements를 하기 전이기 때문에)
// 구현의 implements 의미보단 상속 extends의 의미로 물려주는 관계가 가능합니다.
// 또한 인터페이스들끼리는 다중 상속이 가능합니다.
interface InterSub extends InterSuper1, InterSuper2{
	// 상속 받았기 때문에 (구현하지 않고 물려받았기 때문에) 아래와 같이 추상메서드가 존재하는 셈입니다.
	//public abstract void InterSuper1_Test();  InterSuper1에서 상속받은 추상메서드
	//public abstract void InterSuper2_Test();  InterSuper2에서 상속받은 추상메서드
	public abstract void InterSub_Test(); // InterSub 인터페이스 자체의 추상메서드
}
// 멀지않은 미래에 InterSub를 implements한 클래스는 InterSub가 보유하고 있는 세개의
// 추상메서드를 모두 오버라이딩 해야합니다.
class SubC2 implements InterSub{
	@Override
	public void InterSuper1_Test() {}
	@Override
	public void InterSuper2_Test() {}
	@Override
	public void InterSub_Test() {	}
}

// 두 개이상의 인터페이스를 implements한 클래스는 그들에게 있는 추상메서드를 모두 오버라이딩 합니다.
class SubC1 implements InterSuper1, InterSuper2{
	@Override
	public void InterSuper2_Test() {}
	@Override
	public void InterSuper1_Test() {}
}


public class Interface03 {

	public static void main(String[] args) {
		SubC2 c2 = new SubC2(); // 원래 자식객체
		
		// SubC2클래스는 InterSuper1, InterSuper2, InterSub를 모두 implements한 셈이기 때문에
		// 아래동작이 모두 가능
		// 부모클래스가 셋이며, 어느 부모 참조변수에 저장해도 무방합니다.
		InterSuper1 s1 = new SubC2();		// 다형성 객체1
		InterSuper2 s2 = new SubC2();		// 다형성 객체2
		InterSub s3 = new SubC2();			// 다형성 객체3
		
		// 다만, 부모참조변수로 사용시에는 자신이 물려준 메서드만 사용이 가능
		s1.InterSuper1_Test();
		s2.InterSuper2_Test();
		s3.InterSub_Test();
		s3.InterSuper1_Test();
		s3.InterSuper2_Test();
		
		// s1.InterSuper2_Test(); //에러 : InterSuper2_Test()는 InterSuper1가 물려준 메서드가 아닙니다.
		// s2.InterSuper1_Test(); //에러 : InterSuper1_Test()는 InterSuper2가 물려준 메서드가 아닙니다.
		
		SubC1 c1 = new SubC1();
		InterSuper1 s4 = new SubC1();		
		InterSuper2 s5 = new SubC1();
		s4.InterSuper1_Test();
		s5.InterSuper2_Test();
		//s4.InterSuper2_Test(); // x
		//s5.InterSuper1_Test(); // x
		
		// c1 : InterSuper1와 InterSuper2를 implement한 SubC1의 객체
		// c2 : InterSuper1, InterSuper2, InterSub를 implement한 SubC2의 객체
		test1(c1);
		test1(c2);
		
		test2(c1);
		test2(c2);
		
		test3(c2);
		// test3(c1); // c1은 SubC1클래스의 객체이며, InterSub 인터페이스를 구현하지 않았습니다.
	}
	private static void test1(InterSuper1 i1) {
		
		
	}
	private static void test2(InterSuper2 i2) {
		
		
	}
	private static void test3(InterSub i3) {
		
		
	}
	
}
