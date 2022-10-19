package days12;

class Mymath{
	int a, b;
	static int c = 0;
	Mymath(){
		c++;
	}
	
	//static변수, static메서드, 인스턴스 변수, 인스턴스 메서드
	
	// 인스턴스 메서드에서는 인스턴스 변수들에 자유롭게 접근 가능
	int add() {
		return a+b;
	}
	int subtract(){
		return a-b;
	}
	int multiply(){
		return a*b;
	}
	double divide(){
		return a/(double)b;
	}
	
	// 인스턴스 메서드들은 static 멤버변수에도 자유롭게 접근이 가능
	void init() {
		a = c * 20;
		b = c * 30;
	}
	
	public static int add(int c, int d) {
		return Mymath.c + c + d;
	}
	
	public static int subtract(int e, int d) {
		return e-d+c;
	}
	public static int multiply(int e, int d) {
		return e*d+c;
	}
	public static double divide(double e, double d) {
		return e/d+c;
	}
}


// 인스턴스 메서드 -> 인스턴스 변수 o
// 인스턴스 메서드 -> static 변수 x
// static 메서드 -> 인스턴스 변수 o
// static 메서드 -> static 변수 o
// -> : 변수 접근 가능/불가능

public class Class23 {

	public static void main(String[] args) {
		Mymath mm = new Mymath();
		mm.init();
		// 인스턴스 메서드는 멤버변수들을 이용할 수 있기 때문에 별도의 전달인수 없이 연산이 가능합니다.
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
		// 매개변수로와 스태틱변수로 연산 : 필요한 값들을 전달인수로 하여 전달합니다.
		System.out.println(Mymath.add(20, 30));
		System.out.println(Mymath.subtract(20, 30));
		System.out.println(Mymath.multiply(20, 30));
		System.out.println(Mymath.divide(20, 30));
	}

}
