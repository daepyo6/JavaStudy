package days15;

import java.util.HashMap;
import java.util.Hashtable;

public class Collection06 {

	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<>();
		HashMap<String, Integer> hm = new HashMap<>();

		ht.put(1, "One");
		ht.put(2, "Two");
		ht.put(3, "Three");
		hm.put("One", 1);
		hm.put("Two", 2);
		hm.put("Three", 3);

		System.out.println("ht.size() : " + ht.size());
		System.out.println("hm.size() : " + hm.size());

		// 두개의 데이터가 같은 키값을 갖고 있을 수는 없습니다.
		// 중복되지 않은 키 값으로 데이터를 추가
		ht.put(4, "Four");
		ht.put(5, "Five");
		hm.put("Four", 4);
		hm.put("Five", 5);

		System.out.println("ht.size() : " + ht.size());
		System.out.println("hm.size() : " + hm.size());

		// Value값이 중복되게 데이터 추가
		ht.put(6, "One");
		ht.put(7, "Two");
		hm.put("Six", 1);
		hm.put("Seven", 2);

		for (Integer k : ht.keySet()) {
			System.out.print("k(" + k + ")=v(" + ht.get(k) + ")  ");
		}
		System.out.println();
		for (String k : hm.keySet()) {
			System.out.print("k(" + k + ")=v(" + hm.get(k) + ")  ");
		}
		System.out.println();
		// 동일한 키값으로 다른 Value가 입력되는 경우 기존의 Value값이 수정됩니다.
		ht.put(6, "Six");
		ht.put(7, "Seven");
		hm.put("Six", 6);
		hm.put("Seven", 7);

		for (Integer k : ht.keySet()) {
			System.out.print("k(" + k + ")=v(" + ht.get(k) + ")  ");
		}
		System.out.println();
		for (String k : hm.keySet()) {
			System.out.print("k(" + k + ")=v(" + hm.get(k) + ")  ");
		}

	}

}
