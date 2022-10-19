package days15;

// 추상 클래스의 단점
// 추상메서드 구현의 강제성이 아래의 경우 단점이 될 수 있습니다.
// 추상메서드의 갯수가 많으면 상속에 부담을 주게 됩니다.
// 자식클래스에서 사용하지 않을 추상 메서드라도, 객체생성을 위해 반드시 구현해야하는 문제점이 있습니다.

abstract class AbstractA{
	public abstract void test1();
	public abstract void test2();
	public abstract void test3();
	public abstract void test4();
	public abstract void test5();
	public abstract void test6();
}

// AbstractA클래스를 상속 받은 클래스는 필요없는 메서드가 있어도, 추상메서드를 모두 오버라이딩(구현) 해야합니다.
class Sub1 extends AbstractA{
	@Override
	public void test1() {}
	@Override
	public void test2() {}
	@Override
	public void test3() {}
	@Override
	public void test4() {}
	@Override
	public void test5() {}
	@Override
	public void test6() {}
}

// 이 추상 클래스를 예상컨데 자주 사용할 예정이라면, 모든 추상클래스가 구현된 Adapter 클래스를 생성하고,
// 이 클래스를 상속받아 사용하면 필요없는 메서드를 강제로 구현하지 않고 필요한 것만 구현하여 사용 가능
class Adapter extends AbstractA{
	public void test1() {}
	public void test2() {}
	public void test3() {}
	public void test4() {}
	public void test5() {}
	public void test6() {}
}

class Sub2 extends Adapter{
	@Override
	public void test1() {
		System.out.println("test1 오버라이딩");
	}
}

public class Abstract04 {

	public static void main(String[] args) {
		// 어뎁터 클래스를 상속받은 클래스도 추상클래스의 자식(손자)클래스가 됩니다.
		AbstractA obj = new Sub2();
		obj.test1();
		// 할아버지 손자간 다형성을 구현하여 물려주고 오버라이딩된 메서드를 할아버지 래퍼런스가 사용할 수 있습니다.
	}

}
