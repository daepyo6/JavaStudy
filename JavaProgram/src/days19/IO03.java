package days19;

import java.io.IOException;
import java.util.Iterator;

public class IO03 {

	public static void main(String[] args) throws IOException {
		// System.in 객체를 사용하여 더하기 연산을 수행하는 프로그램을 작성합니다.
		
		byte [] firstNumber = new byte[10];
		byte [] secondNumber = new byte[10];
		// 자료형이 바이트라는건 한칸에 -128 ~ 127까지 입력이 가능하다는 말
		// 우리는 System.in.read()로 읽어낸 내용을 저장할 예정이므로, 한칸 들어가는 값은 입력받은 문자의
		// 아스키코드들이 될 예정입니다.
		
		System.out.print("첫번째 정수 : ");
		int size1 = System.in.read(firstNumber);
		System.out.print("두번째 정수 : ");
		int size2 = System.in.read(secondNumber);
		
		/*
		System.out.println("size1 : " + size1);
		for (int i = 0; i < size1; i++) 
			System.out.print((char)firstNumber[i]);
		
		System.out.println("size2 : " + size2);
		for (int i = 0; i < size2; i++) 
			System.out.print((char)secondNumber[i]);
		*/
		
		// |6|7|5|1|2| : 입력된 글자
		// |0|1|2|3|4| : 배열의 인덱스
		
		int i, m;		// i : 반복 실행 제어 & 배열의 인덱스 사용, m : 각자리에 곱해질 10의 자승으로 사용
		// 반복실행문은 0부터 실행되지 않고 입력자료의 마지막 자리수부터 시작
		// 다섯글자 입려되었을 때, 사이즈가 7이고, 반복은 4부터 시작해야 하므로 i의 시작값은 사이즈-3입니다.
		int n1 = 0;
		for (i = size1-3, m = 1; i >= 0; i--, m*=10) {
			n1 = n1 + ((firstNumber[i]-'0') * m);
			// firstNumber[i]-'0' -> 입력된 문자의 아스키코드값에서 
			// '0'의 아스키 코드값을 뺄셈해줘야 정수로서의 숫자s가 됩니다.
			System.out.print("firstNumber["+ i +"] : " + (firstNumber[i]-'0')+" ");
			System.out.print((firstNumber[i]-'0')+"x"+m+"="+(firstNumber[i]-'0')*m+" ");
			System.out.println(n1);
		}
		
		int n2 = 0;
		for (i = size2-3, m = 1; i >= 0; i--, m*=10) {
			n2 = n2 + ((secondNumber[i]-'0') * m);
			// firstNumber[i]-'0' -> 입력된 문자의 아스키코드값에서 
			// '0'의 아스키 코드값을 뺄셈해줘야 정수로서의 숫자s가 됩니다.
			System.out.print("secondNumber["+ i +"] : " + (secondNumber[i]-'0')+" ");
			System.out.print((secondNumber[i]-'0')+"x"+m+"="+(secondNumber[i]-'0')*m+" ");
			System.out.println(n2);
		}
		
		System.out.println(n1 +"+"+n2+"="+(n1+n2));
		
	}

}










