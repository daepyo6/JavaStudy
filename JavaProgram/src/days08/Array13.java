package days08;

public class Array13 {

	public static void main(String[] args) {
		// 2차원 배열
		// 행과 열의 개념을 사용하는 인덱스가 2개인 배열
		// 2차원 배열의 변수 선언 - 행과 열을 의미하는 []가 2개 사용
		int [][] a;
		
		// 2차원 배열의 공간 생성
		// 변수명 = new 자료형[행의수][열의수];
		// 3행 2열의 2차원 배열 생성
		// 2개의 요소를 가지는 일차원 배열을 3개 생성 = 3행 2열 배열
		a = new int[3][2];
		int [][] a1 = new int[3][2];
		// 1차원 배열과 같이 2차원도 Heap 메모리에 생성, 초기화 값은 0
		
		int [][] b = {{1, 2}, {3, 4}, {5, 6}};
		// int [][] a1 = new int[3][2]; //값이 모두 0으로 초기화
		// 위 두개의 배열 선언은 각 구성요소 값들은 다르지만 행열의 갯수는 같다
		
		// 이차원 배열의 구조
		
		// b[0] : {1, 2}      b[1] : {3, 4}      b[2] : {5, 6}
		
		// b[0][0] : 1      b[0][1] : 2
		// b[1][0] : 3      b[1][1] : 4
		// b[2][0] : 5      b[2][1] : 6
		
		
		// 2차원 배열의 요소 접근 - 2개의 인덱스를 사용
		a[2][1] = 10;
		System.out.println(a[2][1]);
		
		// 이차원 배열을 만들고, 이중반복문을 이용하여 값을 저장 후 이중반복문으로 출력
		int cnt = 1;
		int [][] c = new int[4][6];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 6; j++) {
				c[i][j] = cnt++;
			}
		}
		System.out.println();
		
		//1.
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	
		for (int [] row : c) {  // c참조변수가 저장한 주소에 있는 4개짜리 참조변수들. 
										 // 그 주소들을 한번씩 row에 담으면 반복 실행
			for (int value : row) {
				System.out.print(value + "\t");
			}
			System.out.println();
		}
		
		
		
	}

}
