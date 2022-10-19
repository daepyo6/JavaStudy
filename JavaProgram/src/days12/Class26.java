package days12;

import java.util.Calendar;

// Singleton pattern
// new 인스턴스를 만들려고 할때마다 새롭게 인스턴스가 만들어지는 것이 아니라
// 미리 만들어 놓은 인스턴스를 새로 만들어지는 객체들이 공유해서 사용하게 하는 패턴

// 멤버변수들이 static변수가 아니면서, 각 객체들이 공유해서 일관된 값을 가져야한다면, 
// 덧붙여서 객체도 굳이 두개이상 만들필요가 없는 상황이라면,
// 하나의 인스턴스를 만들고, 그 주소를 새로 만들어지는 참조변수들이 공유해서 사용하게 합니다.

// 시험문제 싱글턴 패턴을 구현하는 코드 작성
class SingletonEx{
	int n1;
	int n2;
	
	//1. 생성자를 private으로 보호합니다
	private SingletonEx() {
		
	}

	// 2. 클래스 내부에서 생성자를 호출해서 객체하나(new 인스턴스)를 생성
	private static SingletonEx itc = new SingletonEx();
	// 이용자가 많을 수 있고, 언제 들어올지 모르기 때문에 미리 하나 만들어서 공유하게 합니다.
	
	// 3. 생성해놓은 객체의 참조변수값을 리턴하는 public형의 메서드를 생성
	public static SingletonEx getInstance() {
		return itc;
	}
}

public class Class26 {

	public static void main(String[] args) {
		
		//SingletonEx m1 = new SingletonEx();  // 생성자가 private라서 에러
		
		// 4. SingletonEx.getInstance()로 생성
		SingletonEx m1 = SingletonEx.getInstance(); 
		SingletonEx m2 = SingletonEx.getInstance(); 
		SingletonEx m3 = SingletonEx.getInstance(); 
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		
		m1.n1 = 150;
		m2.n2 = 200;
		System.out.println(m3.n1 + " " + m3.n2); 
		//m1, m2, m3는 하나의 인스턴스를 공유하고 있다.
		
		/*
		 * 생성자가 private로 보호되어 main메서드 안에서 new SingletonEx()로 새로운 객체 생성이 되지 않습니다
		 * SingletonEx m1 = new SingletonEx(); // 에러
		 * 싱글톤 방식은 클래스 내부에 유일한 객체(itc)를 생성(private static으로 생성)해두고
		 * public static으로 만들어진 getInstance()메서드를 호출하여 itc(생성한 객체)를 리턴받아 객체를 사용
		 * 생성자 메서드는 static인스턴스 itc를 만들때 최초로 실행된 때 말고는 실행되지 않음
		 * 주로 유지되어 할 정보와 메서드를 많이 갖고있는 클래스에서 많이 사용
		 * 두개의 객체가 유지되면 부담스로운 부분을 하나로 공유하고 필요한 내용을 멤버변수로 해결하는 방식
		 * 
		 * 싱글턴 페턴이 구현될 클래스의 활용
		 * 날짜, 시간에 관련된 정보를 제공하는 Calendar 클래스 :
		 * 클래스 싱글턴 패턴이 구현되어 new 인스턴스를 사용하여 객체생성이 안됩니다
		 * 반드시 getInstance 메서드를 사용해야 됨
		 */
		
		//Calendar cal = new Calendar;
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		// 싱글턴은 공동요소가 많고, 메서드를 주로 공유해서 사용할 때 많이 사용
		
		/*
		 * SingletonEx m1 = new SingletonEx();
		 * SingletonEx m2 = new SingletonEx();
		 * 
		 * SingletonEx m3 = m1; // 같은 주소값으로 하나의 인스턴스를 공유하는 방법
		 * 
		 * System.out.println(m1); 
		 * System.out.println(m2); 
		 * System.out.println(m3); 
		 * // 만들어진 객체의 참조변수를 바로 print로 출력하면 
		 * // 패키지이름.클래스이름@해시코드 
		 * // 해시코드 : 중복된 값이 나오지 않게 하기위해 실행된 알고리즘코드에 의해 나온 결과 값
		 */		
		
		
	}

}
