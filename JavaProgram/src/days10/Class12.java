package days10;

class Exclass{
	
	public Exclass() {
		System.out.println("Exclass 클래스의 디폴트 생성자 호출");
	}
	public Exclass(int i) {
		System.out.println("Exclass 클래스의 int타입 매개변수를 전달 받는 생성자 호출");
	}
	public Exclass(double d) {
		System.out.println("Exclass 클래스의 double타입 매개변수를 전달 받는 생성자 호출");
	}
	
}

public class Class12 {

	public static void main(String[] args) {
		Exclass e1 = new Exclass();
		Exclass e2 = new Exclass(10);
		Exclass e3 = new Exclass(12.33);
		

	}

}
