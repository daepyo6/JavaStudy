package days05;

public class ControlOp_For03 {
	public static void main(String[] args) {
		// 1~100의 합
		
		int i, sum=0;
		
		for (i = 1; i <= 100; i++) {
			sum+=i;
			System.out.println("1부터 "+ i +"까지의 합 : "+ sum);
		}
		
	}
}
