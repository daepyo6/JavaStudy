package days13;

import java.util.Vector;

// 시험 가능성 다수
// 쇼핑 관련 프로젝트
// 클래스로 만들어질 대상 : 판매상품(TV, Computer, Audio), 구매자
// 구매자가 상품을 사고, 환불을 하는 행위가 가능하도록 class와 프로그램을 제작

class Product{
	protected int price;
	protected int bounsPoint;
	public Product(int p) {
		this.price = p;
		this.bounsPoint = p/10;
	}
}

class Computer extends Product{
	public Computer() {
		super(1500000);
	}
	
	@Override
	public String toString() {
		return "Computer";
	}
}

class Tv extends Product{
	public Tv() {
		super(1000000);
	}
	@Override
	public String toString() {
		return "Tv";
	}
}

class SmartPhone extends Product{
	public SmartPhone() {
		super(800000);
	}
	@Override
	public String toString() {
		return "SmartPhone";
	}
}

class Buyer { 
	int money = 10000000;
	int bounsPoint = 0;
	Vector<Product> itemList = new Vector<Product>(); // 구매목록
	// 백터란 배열의 확장형 리스트 구조   -- 객체들을 저장할 수 있는 배열이라고 이해해도 무방
	// 사용자가 만든 클래스의 객체(메모리를 할당받은 레퍼런스값)등이 저장되는 다형성 객체 저장 리스트입니다.
	// 추가된 순서로 번호(index)도 설정이 되어서 번호로 검색이 가능
	// Computer c = new Computer();
	// item.add(c);
	// add : Vector 클래스의 멤버 메서드입니다
	// public boolean add (Object obj) { }
	//public void buy(Computer c) {  }
	//public void buy(Tv t) {	}
	//public void buy(SmartPhone s) {  }
	
	public void buy(Product p) {
		// 구매하려는 물건의 가격보다 내 보유금액이 더 큰가. 잔액은 충분한가
		if( p.price > this.money) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		// 상품 가격만큼 보유금액을 차감합니다.
		this.money -= p.price;
		// 상품의 보너스 포인트 만큼 구매자 보너스 포인트를 합산합니다.
		this.bounsPoint += p.bounsPoint;
		// 상품 객체를 item에 추가합니다.
		itemList.add(p);
		System.out.println(p+"을(를) 구입하셨습니다.");
		// 자식클래스에서 오버라이딩 된 toString이 실행됩니다.
	}
	public void summary() {
		int sum = 0; // 지출 총액을 계산할 변수
		String item = ""; // 구입한 상품을 화면에 나열하기 위해 준비한 String 변수
		
		// itemList.isEmpty()  : Vector가 비어있으면 true, 하나라도 채워져있으면 false를 리턴
		if( itemList.isEmpty() ) {  
			System.out.println("구매하신 제품이 없습니다.");
			return;
		}
		
		// itemList.size() : 저장된 요소의 갯수 리턴
		for (int i = 0; i < itemList.size(); i++) {
			// itemList.get(i) : Vector에서 저장요소를 꺼내는 멤버메서드
			Product p = itemList.get(i);
			// Product p = (Product)itemList.get(i);
			// Vector에 저장될때 Object형으로 저장된 객체를 다시 꺼내서 원래 자료형에 저장하려면
			// 그 클래스 형으로 강제 캐스팅이 필요합니다.
			
			sum += p.price;
			item += "  " + p.toString();
		}
		System.out.print("남은 금액 : " + this.money);
		System.out.println(", 남은 보너스포인트 : " + this.bounsPoint);
		System.out.println("지출총액 : " + sum);
		System.out.println("구매목록 : " + item);
		
	}
	
	// 환불 메서드
	// itemList.remove(상품) : itemList에서 상품을 삭제
	// 		- remove하려는 p가 존재하여 잘 지워 졌다면 true 리턴
	public void refund( Product p ) {
		// 제일먼저 itemList가 비어있으면 구매한 내역이 없습니다.
		if( itemList.isEmpty() ) {  
			System.out.println("구매한 내역이 없습니다.");
			return;
		}
		// 환불하려는 상품이 없으면 해당상품이 없습니다.
		if( !itemList.remove(p) ) {  
			System.out.println("해당상품이 없습니다.");
			return;
		}
		// 잔액이 상품가격만큼 늘어납니다
		this.money += p.price;
		// 보너스 포인트가 줄어듭니다.
		this.bounsPoint -= p.bounsPoint;
		// itemList에서 상품이 삭제됩니다.
		// itemList.remove(p);
		
		System.out.print("남은 금액 : " + this.money);
		System.out.println(", 남은 보너스포인트 : " + this.bounsPoint);
		System.out.print("구매목록 :");
		for (Product product : itemList) {
			System.out.print(" " + product);
		}
		System.out.println();
		
	}
	
}

public class Extends09_Object06 {
	
	public static void main(String[] args) {
		Computer c = new Computer();
		Tv t = new Tv();
		SmartPhone s = new SmartPhone();
		
		System.out.println("c객체의 제품명 : " + c);
		System.out.println("t객체의 제품명 : " + t);
		System.out.println("s객체의 제품명 : " + s);
		
		Buyer b = new Buyer();
		b.buy(c);
		b.buy(t);
		b.buy(s);
		
		b.summary();
		
		b.refund(c);
		b.refund(t);
		b.refund(s);
		
	}
	
}
