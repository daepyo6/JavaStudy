package days13;

class SuperC{
	public SuperC() {
		System.out.println("부모클래스의 매개변수가 없는 생성자");
	}
	public SuperC(int num) {
		System.out.println("부모클래스의 매개변수가 있는 생성자");
	}
}

class SubC extends SuperC{
	public SubC(){
		//this(10);					//1. 형제 생성자 형태에 맞춰서 호출(전달인수 10)
		//super();	//super(10);	//2. 부모생성자 호출은 둘중 하나 자유롭게 선택
		super();   	//super(10);	//3. 자식생성자 모두 제각각의 부모생성자를 호출하는 경우
	}
	
	public SubC(int n){
		//super(n);  //super();  //1. 부모생성자 호출은 둘중 하나 자유롭게 선택
		//this();  						//2. 형제 생성자 형태에 맞춰서 호출(전달인수 없음)
		super(n);	//super();		//3. 자식생성자 모두 제각각의 부모생성자를 호출하는 경우
	}
	// 오버로딩된 생성자 모두 첫번째 명령이 this();일수는 없음, 여러 생성자중 하나는 반드시 super();가 있어야 함
	// 자식클래스 생성자에서 super를 호출했으면, 
	// "그에 맞게 오버로딩된 부모 생성자가 있거나", 없으면 "지금 존재하는 부모생성자에 맞춰서 호출하거나"
	
	
	
}

public class Extends05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
