package days16;

import java.util.ArrayList;
import java.util.HashMap;

class Point{
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x:"+x+", y:"+y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Point))
			return false;
		Point point = (Point)obj;
		return (this.x == point.x) && (this.y == point.y) ;
	}
	
	@Override
	public int hashCode() {
		System.out.println("Rect 클래스의 hashCode 실행");
		return this.x + this.y;
	}
	// hashCode 메서드의 오버라이딩은 정말 특별한 경우를 제외하고는 권장하지 않습니다.
	
	// 이미 중복값이 발생하지 않도록 철저히 준비된 연산을 다른 연산으로 바꿔서 실행하는 것 자체가
	// 자바의 코딩규칙을 무너뜨릴 가능성이 있기 때문입니다.
	// 다만 오버라이딩은 불가능한 동작이 아니므로 가능은 하다고 이해하면 됩니다.
}


public class Collection08 {

	public static void main(String[] args) {
		
		ArrayList<Point> pList = new ArrayList<>();
		pList.add( new Point(20, 20) );
		
		// Key : Point, Value : Integer인 HashMap을 생성
		HashMap<Point, Integer> map = new HashMap<>();
		map.put(new Point(10, 10), 1);
		map.put(new Point(20, 20), 2);
		map.put(new Point(30, 30), 3);
		
		for (Point p : map.keySet()) { // HashMap의 키 값을 이용해서 키값마다 1회 반복을 진행하는 구조
			// 반복에 적용할 list는 HashMap의 키값들, 그 것들중 하나를 저장할 변수는 Point형 참조 변수
			// 현재의 HashMap에서 new Point(10, 10) 키값으로 벨류를 찾는 방법 : map.get(new Point(10, 10));
			System.out.println(p+" -> "+map.get(p)+"  ");
		}
		System.out.println("\n(30, 30)의 유무 : "+map.containsKey(new Point(30, 30)));
	}

}
