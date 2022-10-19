package days08;

public class Method06 {
	
	public static void main(String[] args) {
		
		int [] a = { 111,222,333 };
		
		System.out.print("main에서 출력 : ");
		for (int k : a) System.out.printf("%d ", k);
		
		System.out.println();
		
		updateValue(a);
		
		System.out.print("main에서 출력 : ");
		for (int k : a) System.out.printf("%d ", k);
		System.out.println();
		
	}
	
	// 전달인수가 주소라면, 매개변수도 그 주소를 저장할 수있는 변수이여야함.
	// 참조값을 전달인수로 한 메서드 호출시 호출한 곳과 호출당한 곳이 하나의 자료를 공유하여 사용하겠다는 뜻
	private static void updateValue(int[] a) {
		a[0] = 444;
		a[1] = 555;
		a[2] = 666;
		
		System.out.print("updateValue에서 출력 : ");
		for (int k : a) System.out.printf("%d ", k);
		System.out.println();
	}
	// 이와 같이 전달인수로 참조 값을 보내는 호출을 Call by Reference라고 부릅니다. 

}
