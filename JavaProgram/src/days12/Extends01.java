package days12;

class PersonA{
	String name;
	int age;
	String stdNum; //학번
}

class PersonB{
	String name;
	int age;
	String empNum; //학번
}

class Person{
	String name;
	int age;
} // 중복되는 멤버들이나 메서드등 코드를 구성한 요소로한 부모클래스 생성

// 부모의 멤버들은 상속한 클래스에는 별도의 언급이 없어도 부모의 멤버변수/메서드가 있는걸로 인식
class PersonC extends Person{
	String stdNum;
}

class PersonD extends Person{
	String empNum; 
}



public class Extends01 {

	public static void main(String[] args) {
		PersonC c = new PersonC();
		PersonD d = new PersonD();
		c.name = "홍길동";
		c.age = 30;
		
		d.name = "홍길서";
		d.age = 20;
		
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(d.name);
		System.out.println(d.age);
		
		
		
		
		
	}

}
