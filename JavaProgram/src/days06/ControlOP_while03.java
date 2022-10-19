package days06;

import java.util.Scanner;

public class ControlOP_while03 {

	public static void main(String[] args) {
		int num = 0, i = 1, fact = 1; 
		Scanner sc =new Scanner(System.in); 
		System.out.printf("정수를 입력하세요 : "); 
		num = sc.nextInt();
		
		System.out.printf("%d! = ", num);
		while(i<=num) {
			fact = fact * i;
			if(i!=num) System.out.printf("%d x ", i);
			else System.out.printf("%d", i);
			i++;
		}
		System.out.println(" = " + fact);
		
	}

}
