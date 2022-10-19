package days03;

public class PrintEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, plusResult, minusResult, mutiplyResult;
		double divideResult;
		char c;
		
		a=16;
		b=52;
		c='+';
		plusResult = a+b; 
		System.out.printf("%d %c %d = %d\n", a, c , b, plusResult);
		c='-';
		minusResult = a-b;
		System.out.printf("%d %c %d = %d\n", a, c , b, minusResult);
		c='x';
		mutiplyResult = a*b;
		System.out.printf("%d %c %d = %d\n", a, c , b, mutiplyResult);
		c='÷';
		divideResult = a/(double)b;  // 정수와 정수의 연산은 결과가 정수
		System.out.printf("%d %c %d = %f\n", a, c , b, divideResult);
		
		System.out.println();
		
		c='+';
		/* char변수는 int변수와 호환성이 존재 ex) 15 + 'A' = 80
		 	'A'의 이진수 코드값이 정수로 변해서 다른 정수와 산술덧셈이 된다는 뜻입니다.
		 	다른 형식의 자료들이 산술 연산되지 않고 이어붙이기가 될라면 피연산자중 반드시 하나는 String이어야 함
		 	그건 "" " " 상관없이 적용 됩니다.
		 */
		System.out.println(a +" "+ c +" "+ b+ " = " + plusResult);
		c='-';
		System.out.println(a +" "+ c +" "+ b+ " = " + minusResult);
		c='x';
		System.out.println(a +" "+ c +" "+ b + " = " + mutiplyResult);
		c='÷';
		System.out.println(a +" "+ c +" "+ b + " = " + divideResult);
		
		
		System.out.println();
		char ch = 'A';
		//int와 char 사이에는 자료형 간 호환성이 존재합니다.
		 
		
		System.out.printf("ch 변수의 값 : %c(%d)\n", ch, (int)ch);
		System.out.printf("ch 변수의 값 다음 글자 : %c(%d)\n", ch+1, (int)ch+1);
		System.out.printf("알파벳 A : %d\n",(int)'A');
		System.out.printf("알파벳 Z : %d\n",(int)'Z');
		System.out.printf("알파벳 a : %d\n",(int)'a');
		System.out.printf("알파벳 z : %d\n",(int)'z');
		System.out.printf("연산기호 + : %d\n",(int)'+');
		System.out.printf("연산기호 - : %d\n",(int)'-');
		System.out.printf("연산기호 * : %d\n",(int)'*');
		System.out.printf("연산기호 ÷ : %d\n",(int)'÷');
		// 이 숫자들을 아스키코드라고 부름
		System.out.printf("아스키코드 65 : %c\n", 65);
		System.out.printf("아스키코드 90 : %c\n", 90);
		System.out.printf("아스키코드 97 : %c\n", 97);
		System.out.printf("아스키코드 122 : %c\n", 122);
		
		ch = 122;
		int d = 'a';
		
		System.out.println("char ch 변수 : " + ch + "   int d 변수 값 : " + d );
		System.out.println();
		
		int thisYear = 2022; // 변수 값은 변수 생성(선언)과 동시에 초기화(대입) 할 수 있습니다.
		int myYear = 1994;
		
		System.out.printf("현재는 %d년입니다. ", thisYear);
		System.out.printf("저의 출생년도는 %d년입니다.\n", myYear);
		System.out.printf("한국 나이는 %d세입니다. ", thisYear-myYear+1);
		System.out.printf("만 나이는 생일이 지났으므로 만 %d세입니다.\n\n", thisYear-myYear-1);
		
		System.out.println("현재는 " + thisYear + "년입니다.");
		System.out.println("저의 출생년도는 " + myYear + "년입니다.");
		System.out.println("한국 나이는 " + (thisYear-myYear+1) + "세입니다.");
		System.out.println("만 나이는 생일이 지났으므로 만 " + (thisYear-myYear-1) + "세입니다.");
		
		int kor, eng, mat;
		System.out.printf("\t\t      ###성적표###\n");
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("번 호\t 성 명\t\t국 어\t영 어\t수 학\t총 점\t평 균\n");
		System.out.printf("-----------------------------------------------\n");
		kor = 89; eng = 78; mat = 65;
		System.out.printf("%3d\t%3s\t\t%3d\t%3d\t%3d\t%3d\t%5.2f\n",
				1,"홍길동", kor, eng, mat,(kor+eng+mat),(kor+eng+mat)/3.0);
		kor = 100; eng = 99; mat = 75;
		System.out.printf("%3d\t%3s\t\t%3d\t%3d\t%3d\t%3d\t%5.2f\n",
				2,"홍길서", kor, eng, mat,(kor+eng+mat),(kor+eng+mat)/3.0);
		System.out.printf("-----------------------------------------------\n");
		kor = 89; eng = 78; mat = 65;
		System.out.println("  1\t홍길동\t\t"+kor+"\t"+eng+"\t"+mat+"\t"
				+ (kor+eng+mat)+"\t"+ (int)((kor+eng+mat)/3.0*100)/100.0);
		kor = 100; eng = 99; mat = 75;
		System.out.println("  2\t홍길서\t\t"+kor+"\t"+eng+"\t"+mat+"\t"
				+ (kor+eng+mat)+"\t"+ (int)((kor+eng+mat)/3.0*100)/100.0);
		System.out.printf("-----------------------------------------------\n");
	}

}
