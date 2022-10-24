package days17;

/*
	Call by Reference(주소전달)
	- 전달인수로 주소(참조값)을 보내는 호출
	Call by Value(값전달)
	- 전달인수의 변수값이 매개변수 변수로 "값"만 전달되는 방식
	
	오버로딩 overloading
	- 메서드의 이름은 같고, 매개변수의 타입, 개수, 순서가 다르면 서로 다른 메소드로 인지하는 문법
	오버라이딩 overriding
	- 자식클래스에 물려받은 부모클래스의 메서드를 재정의하여 사용하는 문법
	
	상속(Extends)
	- 각각의 클래스에서 발견되는 공통 변수, 메서드 등을 하나의 클래스로 
	  만들어 다른 클래스에게 물려주는 것
	
	클래스 정의
	- 프로그램에서 처리하고자 하는 대상 (유기체, 무기체 또는 문자 숫자 자료 등)을 자료화하여 정의한 것
*/
class Test{
	
	private int n;
	
	// Singleton pattern
	// 새롭게 인스턴스(new)가 만들어지는 것이 아니라 미리 만들어놓은 인스턴스(getInstance())를 
	// 새로 만들어지는 객체들이 공유해서 사용하게 하는 패턴
	private Test(){ }
	
	private static Test t = new Test();
	
	public static Test getInstance() {
		return t;
	}
	
	// toString 오버라이딩
	@Override
	public String toString() {
		return super.toString();
	}
	
	// equals 오버라이딩
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Test))  // obj가 Test의 자식이 아니라면 false를 리턴, 맞으면 진행
			return false;
		Test t = (Test)obj;
		return this.n == t.n;
	}
	
}

public class Test_221020 {

	public static void main(String[] args) {
		

	}

}
