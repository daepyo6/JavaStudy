package days13;
// 부모클래스도 여러개 오버로딩
// 자식클래스도 여러개 오버로딩   <- 두개 시험문제

class SuperD{
	public SuperD() {
		this(5);
		System.out.println("SuperD()");			//3
	}
	
	public SuperD(int i) {
		this(5.12);
		System.out.println("SuperD(int)");		//2
	}
	
	public SuperD(double d) {
		System.out.println("SuperD(double)");	//1
	}
	
	public SuperD(String s) {
		this();
		System.out.println("SuperD(String)");	//4
	}
	
}

class SubD extends SuperD{
	public SubD() {
		this("");
		System.out.println("SubD()");			//8
	}
	
	public SubD(int i) {
		super("");
		System.out.println("SubD(int)");		//5
	}
	
	public SubD(double d) {
		this(3);
		System.out.println("SubD(double)");//6
	}
	
	public SubD(String s) {
		this(123.12);
		System.out.println("SubD(String)"); //7
	}
}

public class Extends06 {

	public static void main(String[] args) {
		SubD d = new SubD();

	}

}
