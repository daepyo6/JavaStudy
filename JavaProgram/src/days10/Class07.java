package days10;

// 멤버메서드를 제작하는 주된 목적은 private로 보호되는 멤버변수 값을 저장하거나 얻어오거나...
// 그 둘의 목적이 가장 큽니다.
// 따라서 특정 멤버 메서드(값을 저장하거나 얻어오는 메서드)를 별도의 사유없이 필요한 만큼 만들고 시작하는 경우가 많음
// 메서드의 이름은 getter setter와 멤버변수 이름을 조합해서 만듭니다.

class GetSetTest {
	private int intVar;
	private double doubleVar;
	private String stringVar;
	private boolean booleanVar;

	// getter와 setter의 자동생성
	// 마우스 우클릭 > source > Generate Getters and Setters > Select All 클릭 > Generate 클릭
	
	public boolean isBooleanVar() {
		return booleanVar;
	}
	public void setBooleanVar(boolean booleanVar) {
		this.booleanVar = booleanVar;
	}
	public int getIntVar() {
		return intVar;
	}
	public void setIntVar(int intVar) {
		this.intVar = intVar;  
		// 매개변수와 멤버변수가 이름이 같은경우 둘을 구분하기 위해 멤버변수에 this. 을 붙여서 사용합니다.
	}
	
	public double getDoubleVar() {
		return doubleVar;
	}
	public void setDoubleVar(double doubleVar) {
		this.doubleVar = doubleVar;
	}
	
	public String getStringVar() {
		return stringVar;
	}
	public void setStringVar(String stringVar) {
		this.stringVar = stringVar;
	}
	
	
}

public class Class07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
