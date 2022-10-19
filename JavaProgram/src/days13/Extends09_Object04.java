package days13;

class Human{
	
	private String name;
	private int age;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		String info = "[이름:" + this.name + ", 나이:" + this.age + "]";
		return info;
	}
	
	// equals 시험문제
	// 오버라이딩되는 메서드의 조건 : 리턴값의 유형, 매개변수의 유형-갯수-순서가 같아야 함.
	// equals 메서드는 어떤 클래스 내부에서도 오버라이딩 될 준비를 해야하므로
	// 매개변수를 모든 클래스가 전달 가능하도록 모든 클래스의 부모인 Object 자료형으로 정해져 있습니다.
	@Override
	public boolean equals(Object obj) {
		// s1.equals(s2)
		// this <- s1, obj <- s2
		// this.name과 obj.name의 비교, this.age와 obj.age의 비교
		// obj는 부모 참조변수이므로 자식클래스의 멤버변수에 접근이 안됩니다. 
		
		// Human이 아닌 다른클래스의 인스턴스 주소가 전달인수로 전달되었다면, 바로 return false로 종료
		if(!(obj instanceof Human))
			return false;
		// if문 조건이 false여서 지나쳤으면 형변환
		Human target = (Human) obj;
		
		// 아까와는 사정이 달라졌어요
		// this.name과 target.name의 비교, this.age와 target.age의 비교합니다.
		boolean flag_name = this.name.equals(target.name);
		boolean flag_age = this.age == target.age;
		boolean result = flag_name && flag_age;
		
		return result;
	}
}


public class Extends09_Object04 {

	public static void main(String[] args) {
		
		Human s1 = new Human("홍길동", 21);
		Human s2 = new Human("홍길동", 21);
		Human s3 = new Human("홍길서", 22);
		System.out.println("Human1의 정보 - " + s1);
		System.out.println("Human2의 정보 - " + s2);
		System.out.println("Human3의 정보 - " + s3);
		
		if(s1 == s2) 
			System.out.println("s1변수와 s2변수는 같습니다. (s1==s2)");
		else
			System.out.println("s1변수와 s2변수는 다릅니다. (s1==s2)");
		
		if(s1.equals(s2)) 
			System.out.println("s1변수와 s2변수는 같습니다. (s1.equals(s2))");
		else
			System.out.println("s1변수와 s2변수는 다릅니다. (s1.equals(s2))");
		// 결과 : s1 변수와 s2 변수는 다릅니다. s1.equals(s2)
		// Object 클래스의 equals 메서드는 기본적으로 두 객체의 레퍼런스 값을 비교하는 연산만을 수행합니다.
		if(s1.equals(s3)) 
			System.out.println("s1변수와 s3변수는 같습니다. (s1.equals(s3))");
		else
			System.out.println("s1변수와 s3변수는 다릅니다. (s1.equals(s3))");
		
		
		
		
		

	}

}
