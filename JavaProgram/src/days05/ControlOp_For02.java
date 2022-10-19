package days05;

public class ControlOp_For02 {

	public static void main(String[] args) {
		int i;
		for(i=1;i<=100;i++) {
			System.out.printf("%d\t" ,i);
		}
		System.out.println();
		
		//짝수 출력 1
		System.out.println("-------------------짝수----------------------");
		for(i=1;i<=100;i++) {
			if(i%2==0)
				System.out.printf("%d\t" ,i);
		}
		//짝수 출력 2
		System.out.println();
		for(i=2;i<=100;i+=2) {
			System.out.printf("%d\t" ,i);
		}
		System.out.println();
		
		//홀수 출력 1
		System.out.println("-------------------홀수----------------------");
		for(i=1;i<=100;i++) {
			if(i%2==1)
				System.out.printf("%d\t" ,i);
		}
		//홀수 출력 2
		System.out.println();
		for(i=1;i<=100;i+=2)
			System.out.printf("%d\t" ,i);
		

	}

}
