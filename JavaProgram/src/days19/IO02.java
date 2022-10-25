package days19;

import java.io.IOException;
import java.util.Iterator;

public class IO02 {
	
	public static void main(String[] args) throws IOException {
		
		// InputStream 클래스의 read 메소드
		// read() : 입력스트림으로부터 가장 앞에 위치한 1바이트를 읽어옵니다.
		// read(byte[]) : 입력스트림의 가장 앞부터 매개변수로 전달된 배열의 크기까지의 바이트를 읽어옴
		// read(byte[], int startIndex, int size) : 입력 스트림의 가장 앞부터 size의 크기만큼 데이터를 읽어옵니다.
		// 저장은 매개변수로 전달된 배열의 startIndex 위치부터 저장
		
		byte [] input = new byte[20];
		System.out.print("키보드 입력을 실행하세요 : ");
		int size = System.in.read(input);	
		// 입력한 내용은 input 배열에 저장. 입력한 크기 또는 글자수는 size에 저장
		System.out.println("읽어온 바이트의 크기 : " + size);
		for (int i = 0; i < input.length; i++) {
			System.out.print((char)input[i] + " ");
		}
		
		// 입력 : ABCDEFG
		// 출력 
		// 읽어온 바이트의 크기는 9입니다.
		// A B C D E F G
		// 그리고 이상한 글자들....
		
		// 바이트수 : 입력한 글자들 + 2
		// 마지막 이상한 글자들은 new byte에 의해 초기화된 0이 char로 형변환 되어 출력된 내용

	}
	
}
