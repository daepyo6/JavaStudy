package days06;


public class ControlOP_For13 {

	public static void main(String[] args) {
		int i, j;
		
		for (i = 1; i < 10; i++) {
			for (j = 2; j < 6; j++) {
				System.out.printf("%d*%d=%d\t",j ,i ,i*j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (i = 1; i < 10; i++) {
			for (j = 6; j < 10; j++) {
				System.out.printf("%d*%d=%d\t",j ,i ,i*j);
			}
			System.out.println();
		}
	}

}
