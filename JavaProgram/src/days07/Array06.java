package days07;

public class Array06 {

	public static void main(String[] args) {
		// 배열에 있는 값들 중 최대값과 최소값을 찾아서 출력하세요
		
		int [] a = {56, 87, 96, 87, 45, 89, 69, 36, 13, 98, 100, 12};
		int max = a[0], min = a[0];
		
		// max에 저장된 값과 배열에 저장된 값을 하나씩 차례로 비교
		for (int i = 1; i < a.length; i++) {
			if(max <= a[i]) max = a[i];
			if(min >= a[i]) min = a[i];
		}
		System.out.println("max : " + max +", min : "+ min);
		
	}

}
