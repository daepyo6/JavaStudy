package days10;

// 멤버 메서드 : 클래스에 소속되어 클래스 객체에 종속된 메서드
// 멤버 메서드는 특별한 경우를 제외하곤 static을 사용하지 않음
// static : 정적멤버를 선언할 때 사용
// 정적(static) : "처음부터 만들어지는"이라는 뜻

class Animal{
	String name;
	int age;
	
	public void output() {
		System.out.println("나의 이름은 " + name +", 나이는 " + age + "입니다.");	
	} // 같은 클래스 내부에 정의 되어있는 메서드에서는 변수를 사용할때, 앞에 객체이름을 붙이지 않습니다.
	   // 객체이름을 쓰는 경우는 클래스 외부에서 실제 객체가 만들어지고, 멤버변수안 멤버메서드가 사용될때 붙입니다.
	public void input() {
		name = "바둑이";
		age = 7;
		// 이 메서드를 호출하는 객체는 모두가 같이 name 변수가 "바둑이", age가 7로 값이 저장됩니다.
		output();
		// 멤버메서드들 간에도 서로간 자유로운 호출이 가능
		// input()메서드를 호출한 객체의 name과 age를 이용하여 output 메서드가 호출됩니다.
	}
	// 멤버메서드는 클래스형으로 생성된 객체"전용" 메서드입니다.
	// 메서드의 실행이 객체전용으로만 사용이된다는 뜻
	// 멤버메서드의 내용은 해당 객체와 상관없는 명령이 들어갈 수도 있지만
	// 보통은 멤버변수들의 조작, 출력, 입력을 위한 명령들로 주로 구성
	
	public void inputWithParam(String n, int a) {
		name = n;
		age = a;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	} 
	// 현재 프로그램에서만 사용한다는 가정하에 public은 생략 가능합니다.
	// 안쓰면 현재 프로그램 내에서는 자동으로 public으로 인신됩니다.
}

// 어떤 멤버 메서드를 만들고 사용해야하는가에 대한 정답은 없음
// 개발자의 판단 및 프로그램의 필요성에 의해 설계하고 제작되는 메서드를 잘 만들고 잘 사용하면 됩니다.

public class Class03 {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.output(); // 멤버 메서드는 멤버변수처럼 객체가 만들어지고, 그 객체 앞에(.)과 같이 있어야 사용이 가능
		// a1객체내에 생성된 name, age 변수값을 이용하여 output 멤버 메서드가 실행됩니다.
		// name과 age는 각각의 객체에 따로 만들어지지만, 멤버메서드는 각 객체들에게 공유됩니다.
		// 다른객체가 실행할때도 각자 자신의 name과 age값으로 output이 실행됩니다.
		Animal a2 = new Animal();
		a2.name = "댕댕이";
		a2.age = 10;
		a2.output();
		
		Animal a3 = new Animal();
		Animal a4 = new Animal();
		a3.input();
		a4.input();
		
		
		Animal a5 = new Animal();
		a5.inputWithParam("누렁이", 13);
		a5.output();
		
		//a5.name = "누렁이";
		//a5.age = 13;
		//System.out.println("나의 이름은 " + a5.name +", 나이는 " + a5.age + "입니다.");
		// 이렇게 각 변수를 직접 지정한 값으로 저장하거나 출력하지 않는 이유
		// 1. 멤버메서드를 통해 공통으로 처리할 내용을 한번에 정의하고 호출해서 사용하기 위해
		// 		- 위 명령에서 메서드를 이용하면 좋은 점 : a5 안쓰는거, a5.output()이라고 간단히 호출하는 것
		// 2. 차후 만들어지는 클래스의 멤버변수는 클래스 외부에서 직접접근을 차단할 예정 (a5.name = "누렁이"; X)
		//		- 반드시 멤버 메서드를 통해서만 접근이 가능할 예정
		
		Animal a6 = new Animal();
		a6.setName("백구");
		a6.setAge(15);
		a6.output();
		
		Animal a7 = new Animal();
		a7.setName("검둥이");
		a7.setAge(5);
		
		System.out.println("이름 : " + a3.name + ", 나이 : " + a3.age);
		String name = a3.getName();
		int age = a3.getAge();
		System.out.println("이름 : " + name + ", 나이 : " + age);
		System.out.println("이름 : " + a3.getName() + ", 나이 : " + a3.getAge());

	}

}
















