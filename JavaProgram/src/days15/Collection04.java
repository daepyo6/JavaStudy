package days15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Set(HashSet) 클래스
// 데이터의 중복을 허용하지 않고 저장하는 클래스
// - 검색을 위하여 사용되는 클래스
// 		(저장할때 hash연산의 결과로 저장하니, 검색할떄도 hash 연산 결과로 검색하여 빠른 검색이 가능)
// - hash연산 : 클래스내에서 유일한 값을 얻어낼수 있는 고유 알고리즘 연산
// - 중복된 값을 제거하면서 데이터를 저장하기 위해 사용

public class Collection04 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);  a.add(2);  a.add(2);
		System.out.println(a.size());		// 중복을 허용하기 때문에 3이 변환
		
		HashSet<Integer> b = new HashSet<>();
		b.add(1);  b.add(2);  b.add(2);
		System.out.println(b.size());	// 중복을 허용하지 않기 때문에 2이 변환
		
		// 로또 발생기
		HashSet<Integer> lotto = new HashSet<>();
		while(lotto.size() < 6) {
			lotto.add((int)(Math.random() * 45) + 1);
		}
		for (Integer integer : lotto) {
			System.out.print(integer + " ");
		}System.out.println();
		
		// HashSet에는 정렬메서드가 없습니다.
		// 따라서 링크드 리스트의 부모클래스인 List클래스에 전해주고 리스트로 변환해서,
		// Colletion의 스태틱 메서드로 정렬합니다.
		List<Integer> list = new LinkedList<>(lotto);
		Collections.sort(list);
		
		System.out.println(list); // 한번에 출력
		for (Integer i : list) {
			System.out.print(i + " ");
		}System.out.println("\n");
		
		// 리스트나 해쉬세트로 내부값을 순회하는 방법
		// 1. Iterator 객체를 사용하는 방법
		// - Iterator 객체는 걸렉션 내부의 데이터를 순회 할 수 있는 객체
		Iterator<Integer> iter = lotto.iterator();
		Iterator<Integer> iter2 = list.iterator();
		// lotto 및 list에 값들에 접근할 수 있는 권한을 Iterator 객체에 저장합니다.
		
		while(iter.hasNext())	 // iter.hasNext() : 다음 데이터가 있으면 true리턴
			System.out.print(iter.next() + " ");
		System.out.println();
		while(iter2.hasNext()) // iter2.hasNext() : 다음 데이터가 있으면 true리턴
			System.out.print(iter2.next() + " ");
		// 제어권을 넘겨받아서 위와 같이 리스트를 모두 순회하면 iter = lotto.iterator();를 통해서
		// 다시 방문이 필요할 때 제어권을 다시 얻어내야합니다.
		System.out.println();
		
		
	}
	

}
