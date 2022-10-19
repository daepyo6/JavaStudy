package days07;

public class Array03 {

	public static void main(String[] args) {
		/*
		 * 배열 변수의 활용 - 배열과 반복문
		 * 배열은 하나의 변수명을 가지며, 변수명과 인덱스를 조합하여 각 요소에 접근할수 있음
		 * 일반적으로 for 반복문은 기준변수를 사용하여 인덱스를
		 * 제어하는 방식으로 배열의 각 요소에 접근하는 방식이 활용
		 */
		
		int [] a = new int[100];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = i+1;
			System.out.println("a["+ i +"] = " + a[i]);
		}

	}

}
