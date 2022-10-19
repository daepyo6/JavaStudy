package days07;

public class Array02 {

	public static void main(String[] args) {
		/*
		 *  배열의 선언과 저장공간 생성방법 상세
		 *  null : 아무것도 아니고 아무것도 없다는 뜻의 값(value)입니다.
		 *  
		 *  1. null을 이용해서 참조변수값을 초기화  */
		int [] a1 = null;
		int [] b1;
		
		System.out.println(a1);
		// System.out.println(b1);  //에러.
		// 아무것도 초기화하지 않은것과 아무것도 없는 값(null)으로 초기화 한 것은 다릅니다.
		// b1은 아무것도 초기화되지 않았으므로 위 명령이 에러, 연산도 안되고 출력도 안됩니다.
		// a1은 일부 연산의 제약이 있지만 연산도 가능하고, 출력도 가능. null이라고 출력
		
		
		// 2. 배열 참조변수의 선언과 배열 실제공간의 생성을 동시에 new를 이용하여 진행했다면
		int [] a2 = new int[4];
		// 각 변수 a2[i]에는 자동으로 0이 초기화됩니다.
		// new에 의해서 HEAP 메모리에 생성되는 모든 영역은 0 또는 0.0, null값으로 자동 초기화
		a1 = new int[4];
		System.out.println(a1[0]+", "+a1[1]+", "+a1[2]+", "+a1[3]);
		System.out.println(a2[0]+", "+a2[1]+", "+a2[2]+", "+a2[3]);
		// double [] d = new double[4]; // 모두 0.0으로 초기화
		// String [] s = new String[4]; // 모두 null로 초기화
		System.out.println();
		
		
		//3. 배열을 생성과 동시에 값을 초기화 하는 방법
		int [] a3 = new int[] {1, 2, 3, 4};
		System.out.println(a3[0]+", "+a3[1]+", "+a3[2]+", "+a3[3]);
		int [] a4 = {1, 2, 3, 4};
		System.out.println(a4[0]+", "+a4[1]+", "+a4[2]+", "+a4[3]);
		System.out.println();
		
		//4. 배열 변수 a5, a6을 동시에 선언하는 코드
		int [] a5, a6;
		a5 = new int[4];
		a6 = new int[4];
		System.out.println();
		
		// 5. 배열변수 a7,a8 일반 int형 변수 a9을 생성하는 코드
		int a7[], a8[], a9;
		a7 = new int[4];
		a8 = new int[4];
		a9 = 10;
		
		
		
	}

}
