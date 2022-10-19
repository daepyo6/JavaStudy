package days15;

// 추상클래스의 작성방법
// 클래스 생성구문 앞에 abstract 키워드를 붙여서 생성
// 추상메서드가 포함된 클래스 : 추상 메서드를 하나이상 포함하면 추상클래스라고 부릅니다.
// 추상메서드 : 메서드의 원형만 존재하고 실제 내용은 없는 메서드
abstract class AbstractAnimal{
	public abstract void sound(); 
	// 메서드의 정의만 있고, 메소드의 body 구현은 없습니다.
}

// 추상메소드의 작성방법
// 접근지정자 abstract 리턴 값의 타입 메서드명(매개변수)
// 추상클래스는 일반클래스와 동일하게 일반멤버변수 일반메서드, 생성자 등을 포함할 수 있습니다.
// 단, 추상 메서드를 포함 할 수 있는 특징이 추가된 클래스입니다.
// 추상 클래스는 상속을 통한 다형성 구현을 위해서 생성됩니다.

class DogA extends AbstractAnimal{
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class CatA extends AbstractAnimal{
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
// 추상클래스를 상속받은 자식클래스는 반드시 물려받은 추상메서드를 오버라이드 해야 에러가 발생하지 않습니다.
// - 오버라이딩에 강제성 부여
public class Abstract02 {

	public static void main(String[] args) {
		
		// AbstractAnimal a = new AbstractAnimal();
		// 에러 : 추상클래스는 상속 전용으로 만들어졌기 때문에, 객체를 생성할 수 없음
		
		// 추상클래스를 상속받은 자식클래스는 객체 생성이 가능
		DogA d1 = new DogA();
		CatA c1 = new CatA();
		d1.sound();
		c1.sound();
		
		AbstractAnimal a; // 객체는 생성이 불가하지만, 참조변수는 생성이 가능
		// new AbstractAnimal();은 여전히 에러
		// 부모참조변수에 자식인스턴스주소를 담을 수도 있습니다.
		AbstractAnimal a1 = new DogA();
		AbstractAnimal a2 = new CatA();
		a1.sound();
		a2.sound();

	}

}














