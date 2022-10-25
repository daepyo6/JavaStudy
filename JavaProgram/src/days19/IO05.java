package days19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// InputStreamReader = new InputStreamReader(System.in);
		// BufferedReader b = new BufferedReader(a);
		
		String input;
		//BufferedReader 클래스의 객체를 사용하여 String 타입 자료를 읽어 온후 형변환을 시행합니다.
		System.out.print("정수 입력 : ");
		input = br.readLine();
		int num = Integer.parseInt(input);
		System.out.println(num);
		
		System.out.print("실수 입력 : ");
		input = br.readLine();
		double d = Double.parseDouble(input);
		System.out.println(d);
		
		System.out.print("문자 입력 : ");
		char ch = (char)br.read();
		System.out.println(ch);
		br.close();

	}

}
