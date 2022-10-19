package days14;

import java.math.BigInteger;

public class BigIntegerClass {

	public static void main(String[] args) {
		//BigInteger 클래스 : int와 long형 자료로 담아 낼수 없이 큰 숫자를 다를 수 있게 만든 클래스
		//BigInteger bi = 1; //에러 : 단순숫자형 자료는 모두 int 형
		//BigInteger bi = (long)1; //에러 : long올 캐스팅해도 입력 불가능
		BigInteger bi = BigInteger.ONE;
		System.out.println(bi);
		
		BigInteger fact = BigInteger.ONE;
		
		for (int n = 1; n <= 40; n++) {
			fact = BigInteger.ONE;
			//BigInteger start = BigInteger.ONE;
			//BigInteger end = BigInteger.valueOf(n);
			for (BigInteger start = BigInteger.ONE ; 
					start.compareTo(BigInteger.valueOf(n)) <= 0; 
					start = start.add(BigInteger.ONE)) { //start(1) 부터 end(n)까지 1씩 늘리며 반복
				fact = fact.multiply(start);
			}
			System.out.println(n + "! = " + fact.toString());
			
		}
		
	}

}
