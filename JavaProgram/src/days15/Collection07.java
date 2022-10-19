package days15;

import java.util.ArrayList;

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
}

public class Collection07 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		int target_index = list.indexOf(20);
		System.out.println("20의 위치 : " + target_index);
		//검색할 값이 존재하지 않는 경우 -1이 반환
		target_index = list.indexOf(50);
		System.out.println("50의 위치 : " + target_index);
		System.out.println("20의 저장 유무 : " + list.contains(20));
		System.out.println("50의 저장 유무 : " + list.contains(50));
		
		ArrayList<Point> pList = new ArrayList<Point>();
		Point p = new Point(10, 10);
		pList.add(p);
		pList.add(new Point(20, 20));
		pList.add(new Point(30, 30));
		
		for (Point k : pList) {
			System.out.println(k.toString());
		}
		
		int index = pList.indexOf(new Point(30, 30));
		System.out.println("(30, 30)의 위치 : " + index);
		
	}

}
