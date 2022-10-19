package days10;

class Account{
	private double balance ;  // 계좌정보 클레스에 잔액이 저장된 멤버변수

	public void initBalance(int i) {
		balance = i;
	}

	public void display() {
		System.out.println("현재 잔액은 " + Math.round(balance)*100/100.0 +"원 입니다.");
		
	}

	public void withdraw(int i) {
		balance -= i;
		
	}

	public void deposit(int i) {
		balance += i;
		
	}

	// 클래스의 멤버변수와 멤버 메서드는 접근 지정자(private, public, protected)에 의해서
	// 외부에서의 접근을 조절할 수 있습니다.
	// 접근지정자를 사용하지 않는 경우 기본지정으로 public이 설정되며, 클래스 외부에서 직접접근이 가능합니다.
	// 이는 멤버변수의 값이 무분별하게 수정될 수 있다는 뜻
	// 이를 방지하고 무분별한 접을을 막기위해 멤버변수에 private를 지정합니다.
	// private는 자기자신 class 내부의 멤버메서드만 접근 가능
	// 멤버메서드는 대게 public으로 지정되며, 외부에서 자유로운 접근이 가능
	
}
// 접근지정자
// 모든 클래스의 멤버는 현실에 존재하는 대상의 정보로서,
// 직접적인 접근이 허용되는 것도 허용되면 안되는 정보가 있습니다.
// 접근지정자는 클래스의 멤버들에 대한 접근을 제어하는 키워드 입니다.

// private : 클래스 내부에서만 사용가능한 멤버를 정의하는 키워드
// public : 접근에 제한이 없는 멤버를 정의하는 키워드
// protected : child class에서만 자유롭게 접근이 가능. 상속단원에서 자세히 학습
// default : 접근지정자를 지정하지 않으면 자동으로 갖게도는 접근지정자이며, 같은 패키지내에서 자유롭게 접근가능



public class Class05 {

	public static void main(String[] args) {

		Student std = new Student();  // 같은 패키지에 정의된 클래스는 어디서든 객체를 생성하여 사용이 가능

		Account a = new Account();
		//a.balance = 1000000; // Error. private멤버에는 외부에서 직접 접근이 불가능
		// 캡슐화 : 여러자료를 하나로 묶는것 , 은닉화 : 중요자료를 보호하고 감추는 것
		
		a.initBalance(100000); // 잔액초기화
		a.display(); // 화면에 잔액표시
		
		a.withdraw(5000); // 출금
		a.display();
		a.deposit(20000); // 입금
		a.display();
		
		
	}

}
