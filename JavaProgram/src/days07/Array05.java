package days07;

public class Array05 {

	public static void main(String[] args) {
		// 배열 생성
		int [] a = new int[10];
		int [] b = new int[10];
		int [] c = new int[10];
		
		// 배열의 값 대입
		for (int i = 0; i < c.length; i++) {
			a[i] = 3*(i+1);
			b[i] = 5*(i+1);
			c[i] = a[i] + b[i];
		}
		
		// 출력
		System.out.printf("a배열 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.printf(a[i] + "\t");
		}
		System.out.println();
		
		System.out.printf("b배열 : ");
		for (int i = 0; i < b.length; i++) {
			System.out.printf(b[i] + "\t");
		}
		System.out.println();
		
		System.out.printf("c배열 : ");
		for (int i = 0; i < c.length; i++) {
			System.out.printf(c[i] +"\t");
		}
		System.out.println();
		
	}

}
