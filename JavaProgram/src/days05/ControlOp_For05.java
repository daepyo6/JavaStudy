package days05;

import java.util.Scanner;

public class ControlOp_For05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.printf("첫번째 정수 입력 : ");
		a = sc.nextInt();
		System.out.printf("두번째 정수 입력 : ");
		b = sc.nextInt();
		
		// 입력받은 숫자중 작은 숫자부터 큰 숫자까지 모든 정수를 출력하세요.
		String str = "";
		if(a<b) {
			for (int i = a; i <= b; i++) {
				//System.out.printf("%d ", i);
				str = str + i + " ";
			}
		}else{
			for (int i = b; i <= a; i++) {
				//System.out.printf("%d ", i);
				str = str + i + " ";
			}
		}
	
		System.out.println(str);

	}

}
