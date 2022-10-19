package days06;

public class ControlOP_while02 {

	public static void main(String[] args) {
		
		int i = 1;
		while(i<=100) {
			if(i%2==0) 
				System.out.printf("%d ", i);
			i++;
		}
		System.out.println();
		
		i = 2;
		while(i<=100) {
			System.out.printf("%d ", i);
			i+=2;
		}

	}

}
