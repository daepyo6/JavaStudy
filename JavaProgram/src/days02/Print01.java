package days02;

public class Print01 {
	
	public static void main(String[] args) {
		/* printf는 출력하고자 하는 내용을 "" 안에 자유롭게 구성하여 출력할 수 있게 해줍니다.
			숫자와 문자가 조합된 출력도 가능
			키보드가 허락하는 한 어떤 내용이든 구성하면 출력할 수 있습니다. */
		 System.out.printf(" 56 x 69 = 1234\n");
		 
		 /* 컴퓨터 내부에서 사용되어지는 자료(data)는 크게 수치자료와 문자자료로 구분됩니다.
		  * 흔히 문자자료는 " " 나 ' ' 사이에 넣어서 표현하고, 숫자는 별도 표시 없이 순수한 숫자로만 표시
		  * "abcd"-String, 'a'-char, 123-정수, 123.12-실수
		  * 잘못된 자료의 사용 : 123as, as456 따옴표도 없는 문자와 숫자가 섞인경우
		  */
		 
		 /* 이스케이프 문자 - % : 아직 출력의 내용으로 결정되지 않은 데이터의 출력 자리를 마련하는 문자입니다.
		  * 출력될 내용의 자료형에 따라 %d : 정수, %f : 실수, %s : 문자열 등으로 표기합니다. 
		  	 그리고 그 자리에 출력될 내용은 ""가 끝난 뒤에 컴마로 구분하고 써줍니다. */
		 System.out.printf(" 56 x 69 = %d\n" , 1234);
		 // 간단한 연산을 컴퓨터에게 시키고 그결과를 표함한 내용을 출력할 수 있습니다.
		 System.out.printf(" 56 x 69 = %d\n" , 56*69);
		 System.out.printf(" 56.3 x 69.3 = %f\n" , 56.3*69.3);
		 System.out.printf(" 56 x 69 = %s\n" , "삼천팔백육십사");
		 
		 // % 이스케이프 문자는 갯수에 상관없이 필요한 만큼 구성하여 사용이 가능
		 System.out.printf(" %d x %d = %d\n" ,56, 69, 56*69);
		 // " "안의 % 갯수와 순서대로 출력 될 데이터를 (,)컴마로 구분하여 나열하면 순서대로 매칭 출력됩니다.
		 
		 
		 // System.out.printf(" %d\n" , 12.23); 에러
		 // System.out.printf(" %f\n" , 12); 에러
		 System.out.printf(" %s\n" , 12.23);
		 System.out.printf(" %s\n" , 12);
		 
		 // 소수점이 있는 나눗셈의 결과출력
		 System.out.printf(" %f ÷ %f = %f\n" , 15.5, 4.7, 15.5/4.7);
		 // ÷ : 출력되기 위한 연산기호, 실제와는 무관
		 // / : 실제 연산을 위한 나눗셈 연산기호
		 // +, - , *, /
		 
		 // 소수점을 조절하여 출력하려면 아래와 같이 씁니다. : %.2f
		 System.out.printf(" %.2f ÷ %.2f = %.2f\n" , 15.5, 4.7, 15.5/4.7);
		 // 소수점 조절에 의해 자리수가 조절되고, 없어지는 곳은 반올림 됩니다. 위는 소수점 셋째자리에서 반올림
		 
		 // % 연산 - 나눗셈의 나머지 계산연산자
		 System.out.printf(" %d %% %d = %d\n" , 19, 5, 19%5);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
