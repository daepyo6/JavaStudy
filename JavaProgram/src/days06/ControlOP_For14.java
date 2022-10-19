package days06;

public class ControlOP_For14 {
	
	public static void main(String[] args) {
		int i, j;
		
		for (i = 1; i <= 10; i++) {
			for (j = 1; j <= 10; j++) {
				System.out.printf("#");
			}
			System.out.println();
		}
		System.out.println("\n-------------------------------------\n");
		
		for (i = 1; i <= 10; i++) {
			for (j = 1; j <= 5; j++) {
				System.out.printf("#");
			}
			System.out.println();
		}
		System.out.println("\n-------------------------------------\n");
		
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 5; j++) {
				System.out.printf("#");
			}
			System.out.println();
		}
		System.out.println("\n-------------------------------------\n");
		
		for (i = 10; i > 0; i--) {
			for (j = 0; j < i; j++) {
				System.out.printf("#");
			}
			System.out.println();
		}
		System.out.println("\n-------------------------------------\n");
		
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				if(i<=j)
					System.out.printf("#");
				else
					System.out.printf("ㅇ");
			}
			System.out.println();
		}
		System.out.println("\n-------------------------------------\n");
		
		for (i = 1; i <= 10; i++) {
			for (j = 10; j >= 1; j--) {
				if(i<j) System.out.printf("ㅇ");
				else System.out.printf("#");
			}

			System.out.println();
		}
		System.out.println("\n-------------------------------------\n");
		
		for (i = 1; i <=10; i++) {
			for (j = 1; j <= 9+i; j++) {
				if(j>=11-i) System.out.printf("#");
				else System.out.printf(" ");
			}

			System.out.println();
		}
		System.out.println("\n-------------------------------------\n");
		
		
		
		for (i = 1; i <= 10; i++) {
			for (j = 10; j >= 1; j--) {
				if(i<j) System.out.printf(" ");
				else System.out.printf("#");
			}
			for (j = 2; j <= i; j++) {
				System.out.printf("#");
			}

			System.out.println();
		}
		System.out.println("\n-------------------------------------\n");
		
		
	}
}

