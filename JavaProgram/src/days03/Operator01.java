package days03;

public class Operator01 {

	public static void main(String[] args) {
		/*	연산자
		 	대입 연산 : = 
		 	산술~사(오)칙연산자 : +, -, *, /, %
		 	관계연산자 ~ 비교연산자 : >, <, >=, <=, ==, !=
		 	논리 연산자 : &&(and), ||(or), !(not)
		 */
		int n1 = 10, n2 = 7, result1;
		double result2;
		result1 = n1 + n2;
		System.out.println(n1 + " + " + n2 + " = " + result1);
		result1 = n1 - n2;
		System.out.println(n1 + " - " + n2 + " = " + result1);
		result1 = n1 * n2;
		System.out.println(n1 + " * " + n2 + " = " + result1);
		result2 = n1 / (double)n2;
		System.out.println(n1 + " / " + n2 + " = " + result2);
		double result3 = (int)(result2*100)/100.0;
		System.out.println(n1 + " / " + n2 + " = " + result3);
		System.out.println();
		
		// 연산 명령의 형식
		// 연산 결과가 저장될 변수 = 피연산자1 연산기호 피연산자2
		int n = 50;
		System.out.println("n의 값 : " + n);
		// 피연산자로 쓰인 변수와 연산의 결과를 저장변수가 같은 연산
		n = n + 10;  // n+=10;
		// 1. n변수에 저장된 값과 10을 덧셈연산
		// 2. 그 결과를 다시 n 변수에 저장
		// 연산을 하고 나면 n변수에 원래 50은 사라지고, 연산결과인 60이 저장된 채로 남음
		System.out.println("n = n + 10 이후의 값 : " + n);
		
		n = 50;
		System.out.println("n의 값 : " + n);
		n = n - 10;  // n-=10;
		System.out.println("n = n - 10 이후의 값 : " + n);
		
		n = 50;
		System.out.println("n의 값 : " + n);
		n = n * 10;  // n*=10;
		System.out.println("n = n * 10 이후의 값 : " + n);
		
		n = 50;
		System.out.println("n의 값 : " + n);
		n = n / 10;  // n/=10;
		System.out.println("n = n / 10 이후의 값 : " + n);
		
		double d = 50.0;
		System.out.println("d의 값 : " + d);
		d = d / 10;  // n/=10;
		System.out.println("d = d / 10 이후의 값 : " + d);
		
		n = 50;
		System.out.println("n의 값 : " + n);
		n = n % 10;  // n%=10;
		System.out.println("n = n % 10 이후의 값 : " + n);
		
		System.out.println();
		/* n = n + 1	 	n = n - 1
		 * n+=1			n-=1
		 * n++				n--
		 * 특정 변수의 값을 1 증가 시키거나, 감소 시킬 수 있는 연산자
		 * 대입연산자(=)을 사용하지 않고 값을 변경
		 */
		n = 50;
		System.out.println("n의 값 : " + n);
		n++;  // n+=1;
		System.out.println("n++ : " + n);
		++n;  // n+=1;
		System.out.println("++n : " + n);
		// 위와 같은 단항연산일때는 ++나 --를 앞 또는 뒤, 어느곳에 붙여도 똑같이 연산됩니다.
		System.out.println();
		// ++, -- 연산기호가 앞 또는 뒤에 있을 때 차이나는 경우는 다른연산에 섞여 있을 때
		n = 10;
		System.out.println("n의 값 : " + n);
		int k = n++;
		System.out.println("k의 값 : " + k); // 10
		System.out.println("n의 값 : " + n); // 11
		System.out.println();
		
		n = 10;
		System.out.println("n의 값 : " + n);
		k = ++n;
		System.out.println("k의 값 : " + k); // 11
		System.out.println("n의 값 : " + n); // 11
		
	}
	

}
