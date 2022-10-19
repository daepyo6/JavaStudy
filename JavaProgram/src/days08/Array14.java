package days08;

public class Array14 {

	public static void main(String[] args) {
		// 자바의 2차원 배열은 각 행에 있는 열의 갯수가 서로 다를 수 있습니다.
		
		int [][] a; // 참조변수 선언
		
		a = new int [3][]; // 주소를 저장할 수 있는 참조변수 3개짜리 배열이 생성 및 할당
		
		// 3개의 참조변수에 정수들을 저장 할 수 있는 1차원 배열공간을 생성해서 할당, 모두 갯수를 다르게 생성
		a[0] = new int[3]; // a[0][0], a[0][1], a[0][2]
		a[1] = new int[4]; // a[1][0], a[1][1], a[1][2], a[1][3]
		a[2] = new int[5]; // a[2][0], a[2][1], a[2][2], a[2][3], a[2][4]
		
		// 생성된 배열에 행과 열의 순서대로 1부터 1씩 늘어나는 값을 저장
		int cnt = 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = cnt++;
			}
		}
		
		// 저장된 값을 행과 열에 맞춰 출력
		for (int[] row : a) {
			for (int value : row) {
				System.out.print(value + "\t");
			}
			System.out.println();
		}

	}

}
