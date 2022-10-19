package days13;

// toString 메서드의 사용
// Object 클래스에 있는 toString메서드는 "패키지이름.클래스이름@해쉬코드"를 리턴해준다.
// 이를 해당 클래스에 맞게 변경하려면 메서드 오버라이딩 기능을 이용

class Point{
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.x = y;
	}
	
	@Override
	public String toString() {
		String res = "(x=" + this.x + ", y=" + this.y + ")";
		return res;
	}
}

public class Extends09_Object02 {

	public static void main(String[] args) {
		Point p = new Point(20, 30);
		System.out.println("Overriding된 toString() : " + p.toString());
		System.out.println("Overriding된 toString() : " + p);
		String msg = "Point : " + p;
		System.out.println(msg);

	}

}
