package days09;

public class Method17 {

	public static void main(String[] args) {
		sort("asc", 77, 25, 56, 32, 45, 78, 98); // 오름차순
		System.out.println();
		sort("dasc", 87, 75, 23, 65, 45, 8, 56, 98, 78, 12); // 내림차순

	}

	private static void sort(String str, int ... a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if(str.equals("asc")) {
					if(a[i]>a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}else {
					if(a[i]<a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			
			System.out.print(a[i] + " ");
		}
		
	}

}
