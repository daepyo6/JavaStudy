package days12;

class StaticD{
	// private으로 지정된 static멤버는 클래스의 내부에서만 사용가능한 멤버입니다
	private static int count;
	
	// private으로 지정된 static 변수를 이용하고자 한다면, 
	// public으로 지정된 멤버메서드(static, 인스턴스)를 만들고 이용해야 합니다.
	public static void setCount(int count) {
		StaticD.count = count;
	}
	public static int getCount() {
		return count;
	}
	
	//인스턴스 메서드에서도 접근은 가능하지만 객체 생성 이후에 이용 가능
	public void setCount1(int count) {
		StaticD.count = count;
	}
	public int getCount1() {
		return count;
	}
	
}

public class Class25 {

	public static void main(String[] args) {
		// private으로 지정된 static멤버는 클래스 외부에서는 접근이 차단됩니다.
		//StaticD.count = 50; //에러
		StaticD.setCount(15);
		System.out.println("StaticD.count : " + StaticD.getCount());
		
		StaticD d1 = new StaticD();
		d1.setCount(30);
		System.out.println("StaticD.count : " + d1.getCount());
	}

}
