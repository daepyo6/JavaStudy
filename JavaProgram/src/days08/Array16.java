package days08;

public class Array16 {
	public static void main(String[] args) {
		
		// 1차원 배열의 복사
		int [] a = {1,2,3,4,5};
		int [] b;
		
		b = a;
		
		for (int k : a)
			System.out.print(k + " ");
		System.out.println();
		for (int k : b)
			System.out.print(k + " ");
		System.out.println();
		
		a[2] = 100;
		
		for (int k : a)
			System.out.print(k + " ");
		System.out.println();
		for (int k : b)
			System.out.print(k + " ");
		System.out.println();
		
		/*
		 	레퍼런스 변수간의 값의 복사로는 배열의 복사까지 이루어지지 않습니다.
		 	위의 동작 b=a; a가 갖고있는 참조(주소)값을 b변수에 복사한 것이므로
		 	배열공간은 하나, 그 배열 주소를 저장한 변수는 두개로 설정한 것과 같다
		 	따라서 a[2]의 값 변경은 b[2]의 값 변경과 같다.
		 */
		
		// 1. 배열에 새로운 공간을 만들고, a배열의 내용을 하나하나 다 복사하는 방법
		b = new int[5];
		for (int i = 0; i < a.length; i++) b[i] = a[i];
		a[3] = 200;
		
		for (int k : a)
			System.out.print(k + " ");
		System.out.println();
		for (int k : b)
			System.out.print(k + " ");
		System.out.println();

		// 2. 
		// clone 메소드를 사용한 배열의 복사
		// 해당 배열변수가 레퍼런스하고 있는 장소의 배열을 새로운 공간에 복제
		// c는 a배열이 복제된 배열을 참조하는 변수
		int [] c = a.clone();   // 힙 영역에 배열의 복사본을 새로 만들고 그 주소를 전달
		for (int k : a)
			System.out.print(k + " ");
		System.out.println();
		for (int k : c)
			System.out.print(k + " ");
		System.out.println();
		
		
		// 2차원 배열의 복사
		// 이차원 배열은 clone 메소드를 사용하면
		// 참조변수가 저장된 주소에 있는 1차원 배열까지만 복사 함.
		// 그래서 실제 데이터가 저장될 공간을 별도 생성 후 일일히 다 복사해야됨
		int [][] d = {{1,2,3},{4,5,6}};
		int [][] e = d.clone();
		// clone을 사요아기 보단 직접 메모리 설정을 해서 복사를 합니다.
		int [][] f = new int[d.length][d[0].length];
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				f[i][j] = d[i][j];
			}
		}
	
	}
	
}
