package days08;

public class Array12 {

	public static void main(String[] args) {
		// 반복실행문을 이용한 배열의 조회 및 출력
		
		int []a = {98,78,56,45,78};
		double []b = {45.6,23.4,69.54,56.3,87.0};
		String [] c = {"Korea","USA","Japan","China","Canada"};
		
		for (int i = 0; i < a.length; i++) 
			System.out.print(a[i] + " ");
		System.out.println();
		
		for (int i = 0; i < b.length; i++) 
			System.out.print(b[i] + " ");
		System.out.println();
		
		for (int i = 0; i < c.length; i++) 
			System.out.print(c[i] + " ");
		System.out.println();
		
		for (int k : a) {  // a : 배열이름, k : 배열의 요소중 하나를 저장할 수 있는 변수
			System.out.print(k + " ");
		}  // 배열의 요소들이 하나씩 k로 복사되면서 반복이 실행. 배열의 요소의 갯수만큼 반복
		System.out.println();
		
		for (double k : b) { 
			System.out.print(k + " ");
		} 
		System.out.println();
		System.out.println();
		
		for (String k : c) { 
			System.out.print(k + " ");
		} 
		System.out.println();
		
		
		// 배열 c를 오름차순 정렬
		for (int i = 0; i < c.length; i++) {
			for (int j = i+1; j < c.length; j++) {
				if(c[i].compareTo(c[j])>0) {
					String temp = c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		
		for (String k : c) { 
			System.out.print(k + " ");
		} 
		
	}

}
