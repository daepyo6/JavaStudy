package days11;

// 클래스
// 프로그램에서 처리하고자 하는 대상(유기체, 무기체 또는 문자 숫자 자료등)을 자료화하여 정의한 것
// 자료화 : 대상의 세부내용을 변수로 만들고 그들을 class에 묶어서 사용하는 것
// ex) 학생 class에 이름, 국어, 영어, 수학, 총점, 평균을 변수로 정의하고 이를 하나의 자료로서 Student라고 이름을 부르는 것을 의미

// 클래스를 만드는 문법적 순서
class 클래스이름{
	//멤버변수
	int 변수1;
	double 변수2;
	String 변수3;
	
	//멤버메서드
	//멤버메서드 제작시 메인클래스 내부의 메서드냐 아니면 내가 새로정의하는 클래스의 메서드냐에 따라 static을 쓸지 안쓸지를 결정 
	//위의 제약사항은 현재의 단원에서만 유효합니다. 
	public void 메서드1() {
		
	}
	
	public void 메서드2() {
		
	}
	
	// 생성자
	클래스이름(){
		
	}
}

class Human{  // 클래스의 특징을 잡아서 변수로 만들면 된다.
	String name;
	int age;
	String phone;
} // 현재의 클래스 정의는 설계도와 같은 정의영역, 정의된 클래스만 갖고는 아무것도 할 수 없음.
   // 그 클래스 형태의 객체(object)가 생성되야 정의된 내용이 실제 구현되어 실행된다고 할 수 있습니다.


public class Class001 {

	public static void main(String[] args) {
		
		Human h1; // Human 자료형의 변수가 생성 : 참조변수
		// 참조변수 -> 객체(object)로 승격되려면 new에 의한 메모리 할당이 필요 (배열처럼)
		h1 = new Human();
		Human h2 = new Human();
		// new에 의해서 name과 age를 저장할 Human 데이터형의 공간이 Heap영역에 생성되고
		// 그 공간의 주소가 참조변수(h1, h2)에 저장됩니다.
		Human h3 = new Human();
		
		
		String [] name = new String[3];
		int [] age = new int[3];
		String [] phone = new String[3];
		// name[0] age[0] phone[0]이 1번사람의 자료 .....
		// name[1] age[1] phone[1]이 2번사람의 자료 .....
		// name[2] age[2] phone[2]이 3번사람의 자료 .....
		
		// 클래스를 사용함으로서 자료처리의 단위가 변경됩니다.
		// 프로그램이나 자료중심의 처리 -> 개발자 중심의 처리
		System.out.println(h1.name+"\t\t"+h1.age+"\t"+h1.phone);
		// new로 만든 공간은 정수 0, 실수는 0.0, 문자는 null로 초기화 됩니다.
		
		h3.name = "홍길남";
		h3.age = 30;
		h3.phone = "010-1111-2222";
		System.out.println(h3.name+"\t\t"+h3.age+"\t"+h3.phone);
		
	}

}
