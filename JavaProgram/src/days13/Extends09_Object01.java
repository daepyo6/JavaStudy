package days13;

// Object 클래스
// 개발자가 클래스 하나를 새롭게 만들면 자동으로 상속(extends)되는 클래스입니다.
// 자바 내부에 존재하는 그리고 새롭게 만들어지는 모든 클래스는 보이진 않는 곳에 extends Object가 존재
// 자바 내부에 존재하는 그리고 새롭게 만들어지는 모든 클래스의 부모클래스입니다.
// 자바의 클래스는 한클래스당 하나의 부모클래스만 가질 수 있습니다.
// Object가 아닌 다른 클래스를 상속하면 그 클래스는 extends Object가 지워집니다.
// 이렇게 extends Object가 없는경우 다른 클래스를 상속하는 경우이며, 그 부모클래스가 이미 Object를 상속하고 있기때문에
// 결국 또 Object의 자식(손자)클래스가 됩니다.

class UserClass /* extends Object */{
	
}

public class Extends09_Object01 {

	public static void main(String[] args) {
		UserClass obj = new UserClass();
		// getClass메소드는 해당 객체의 클래스 이름을 리턴해주는 메서드, Object 클래스에서 상속 받은 메서드입니다.
		System.out.println(obj.getClass());
		
		// hashCode 메서드는 해당 객체의 해시코드값(다른 객체와 구분하기위한 고유값)을 리턴해주는 메서드 (JVM에 의해 관리되는 번호)
		System.out.println(obj);
		System.out.println(obj.hashCode());
		
		// toString 메소드는 해당 객체의 정보를 문자열로 리턴해주는 메서드
		System.out.println(obj.toString());
		System.out.println(obj);
		// .toString()은 생략해도 같은출력이 이루어집니다.
		// 패키지이름.클래스이름@해쉬코드
		
		// System.out.println(obj); 이 명령에서
		// 결과적으로 obj 참조변수가 "패키지이름.클래스이름@해쉬코드"를 저장하고 있다가 출력되는게 아니라
		// object에 있는 toString 메서드가 "패키지이름.클래스이름@해쉬코드"를 리턴하고 print가 그 것을 출력해주고 있었습니다.
		
		String s = "가나다라마바사";
		System.out.println(s.toString());
		// String 클래스 안에는 자기 나름의 toString메서드가 오버라이딩 되어있습니다.
		// 그래서 "패키지이름.클래스이름@해쉬코드"아닌 저장된 문자열이 출력됩니다.
		
		
		
		
		
		
		
		
		
	}

}
