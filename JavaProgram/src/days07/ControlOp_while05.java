package days07;

import java.util.Random;

public class ControlOp_while05 {

	public static void main(String[] args) {
		// 랜덤한 숫자 발생 = 난수 발생
		
		double r = Math.random();
		System.out.println("최초 발생 난수 : " + r); //가공 전
		
		r = r * 100;
		System.out.println("난수 가공 #1 : " + r); //가공 후 
		
		int a = (int)r;
		System.out.println("난수 가공 #2 : " + a); // 난수 가공 2
		
		
		//
		int i = 1;
		while(i<=10) {
			a = (int)(Math.random()*66);
			System.out.printf("%d ", a);
			i++;
		}
		System.out.println();
		
		Random rd = new Random();
		a = rd.nextInt();
		System.out.println("Random 클래스를 이용한 난수 : "  + a );
		if(a<0) 
			a= a * (-1);
		a= a % 65;
		System.out.println("Random 클래스 가공 후 : "  + a);
		
		i = 1;
		while(i<=10) {
			a = rd.nextInt();
			if(a<0) 
				a= a * (-1);
			a= a % 65;
			System.out.printf("%d ", a);
			i++;
		}
		
	}

}
