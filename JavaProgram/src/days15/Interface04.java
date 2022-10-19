package days15;
// 시험문제
interface Repairable {
	
}

abstract class Unit{
	private int hp;			// 현재 생명력(체력)
	private int max_hp;	// 최대 체력
	Unit(int hp){
		this.max_hp = hp;		// 캐릭터별 전달된 최대 체력 초기화
		this.hp = (int)(hp*0.9);	// 현재 체력은 최대의 90%로 초기화
	}
	
	public abstract void move(int x, int y);
	//public void move(int x, int y) {
	//	System.out.println("x:" + x + ", y:" + y +" 로 이동합니다.");
	//}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMax_hp() {
		return max_hp;
	}
	public void setMax_hp(int max_hp) {
		this.max_hp = max_hp;
	}	
}

class GroundUnit extends Unit{
	GroundUnit(int hp) {
		super(hp);
	}
	@Override
	public void move(int x, int y) {
		System.out.println("x:" + x + ", y:" + y +" 로 뛰어갑니다.");
	}
	
}

class AirUnit extends Unit{
	AirUnit(int hp) {
		super(hp);
	}
	@Override
	public void move(int x, int y) {
		System.out.println("x:" + x + ", y:" + y +" 로 날아갑니다.");
	}
}

class Tank extends GroundUnit implements Repairable{
	Tank() {
		super(150);
	} 
	@Override
	public String toString() {
		return "Tank";
	}
}
class Dropship extends AirUnit implements Repairable{
	Dropship() {
		super(150);
	} 
	@Override
	public String toString() {
		return "Dropship";
	}
}
class Marine extends GroundUnit{ 
	Marine() {
		super(40);
	} 
	@Override
	public String toString() {
		return "Marine";
	}
}
class SCV extends GroundUnit implements Repairable{ 
	SCV() {
		super(40);
	} 
	@Override
	public String toString() {
		return "SCV";
	}
	
	//public void repair( Tank t ){}
	//public void repair( Dropship d ){}
	//public void repair( SCV s ){}
	public void repair( Repairable r ) {
		// this가 r을 수리합니다.
		// r.getHp(); // getHp()는 인터페이스 Repairable의 멤버가 아니기때문에 사용이 안됩니다.
		// getHp()와 setHp()를 사용하려면 Unit클래스의 참조변수에 옮겨담아야 합니다.
		// "자식참조변수 <- 부모참조 <- 자식인스턴스"가 아니라, 
		// "부모1 참조변수에 담겨있는 자식인스턴스 주소를 부모2 참조변수로 이동"
		if (r instanceof Unit) {	// r에 담겨있는 인스턴스 주소가 Unit으로 형변환이 가능하다면
			Unit u = (Unit)r;
			if(u.getHp() != u.getMax_hp()) {
				while(u.getHp() != u.getMax_hp()) {
					u.setHp(u.getHp() + 1);
					System.out.println("체력 1을 수리합니다. 현재 체력 : "+u.getHp()+"/"+u.getMax_hp());
				}
			}else {
				System.out.println(u + "의 HP는 가득 차있습니다.");
				return;
			}
			System.out.println(u + "수리가 끝났습니다.");
		}
	}
}

public class Interface04 {

	public static void main(String[] args) {

		Tank t = new Tank();
		Dropship d = new Dropship();
		Marine m = new Marine();
		SCV s1 = new SCV();
		SCV s2 = new SCV();

		
		System.out.print( t + " : ");
		t.move(10, 20);
		System.out.print( d + " : ");
		d.move(20, 30);
		System.out.print( m + " : ");
		m.move(30, 20);
		System.out.print( s1 + " : ");
		s1.move(40, 10);
		
		s1.repair(s2);
		s1.repair(t);
		
		
		// s1.repair(m);  // Repairable을 implements 하지 않은 클래스의 객체

	}

}
