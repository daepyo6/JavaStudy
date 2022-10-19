package days12;

// 상속을 제공해주는 클래스 : 슈퍼클래스, 부모클래스, 상위클래스
// 상속을 받는 클래스 : 서브클래스, 자식클래스, 하위클래스

class Car{
	int 엔진;
	int 배기량;
	int 도어개수;
}

class K7 extends Car{
	public void printInfo() { // 메서드에서 부모에게서 상속 받은 멤버변수를 사용할 수 있습니다.
		System.out.println("엔진 : " + this.엔진);
		System.out.println("배기량 : " + this.배기량);
		System.out.println("도어개수 : " + this.도어개수);
	}
}

public class Extends02 {

	public static void main(String[] args) {
		K7 k = new K7();
		k.엔진 = 6;
		k.배기량 = 3000;
		k.도어개수 = 5;
		k.printInfo();

	}

}
