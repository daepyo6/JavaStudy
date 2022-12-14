package days19;

import java.io.IOException;
import java.util.Scanner;

// 입출력
// 자바에서 입출력은 스트림의 개념을 사용합니다.
// 스트림 : 단방향 통신
// 입력과 출력에 관한 스트림이 각각 클래스로 제공됩니다.
// 모든 입출력 클래스는 java.io 패키지에 정의되어 있습니다.

// 입출력 클래스
// 1. 바이트 타입
// 	- 이진테이터(눈으로 읽을 수 없는 데이터) : 이미지, 실행파일, 엑셀파일등
// 	- InputStream(입력의 최상위 부모클래스), 	- OutputStream(출력의 최상위 부모클래스)
// 2. 문자 타입
// 	- 텍스트 데이터 : txt 파일과 같은 내용을 처리할 수 있는 클래스
// - Reader(입력의 최상위 부모클래스), - Writer(출력의 최상위 부모클래스)

public class IO01 {
	
	public static void main(String[] args) throws IOException {
		// Scanner sc = new Scanner(System.in);
		// Scanner 없이 System.in 객체를 사용하여 기본입력을 처리할 수 있습니다.
		// 자바의 모든 입출력 작업은 명시적으로 예외 처리를 선언해야 합니다.
		// IOException타입은 예외가 발생함 : System.in.read()
		
		/*
		System.out.print("글자나 숫자 하나를 입력하세요 : ");
		// 1바이트(한 글자) 읽어서 아스키코드 값으로 최종 입력되는 예
		int num = System.in.read();
		System.out.println(num);
		*/
		
		// 위와 같은 바이트 입출력 클래스는 스트림으로부터 1바이트씩 읽거나 쓸수 있습니다.
		// 기본입력을 제공하는 System.in 객체는 키보드와 연결된 기본입력 스트림으로부터
		// 1바이트씩 읽어 올수 있으며, 읽어들이는 값은 문자의 코드(아스키 코드)값입니다.
		// 따라서 num변수에는 입력한 글자의 아스키코드값이 저장됩니다.
		// A : 65, 0 : 48
		
		// new Scanner(System.in) 그동안 사용해오던 Scanner도 위의 System.in의 객체를
		// 모체로 하고있습니다. 입력의 시작은 System.in 객체가 됩니다.
		
		// 입력스트림의 동작방식
		// 입력스트림의 경우 데이터를 입력받을 버프를 검새하여 해당버퍼에 내용이 존재하지 않는 경우
		// 버퍼에 데이터가 쌓일 때까지 대기함(키보드 입력의 경우 사용자가 데이터를 입력하고 엔터키를 입력할때까지)
		// 연결된 버퍼에 데이터가 존재하는 경우, 해당 버퍼에서 바이트 스트림은 1바이트 데이터를 읽어오고,
		// 문자스트림의 경우 2바이트 데이터를 읽어옵니다. 기본 입력은 1바이트 읽기 실행
		System.in.read();
		System.in.read();		
		// 숫자나 문자를 입력하고 엔터를 치면 첫번째 명령이 숫자나 문자고, 두번째 명령이 엔터를 가져감 
		System.out.println("키보드 입력을 실행하세요 : ");
		int input = System.in.read();	
		// 그리고 입력버퍼에 남아있는 엔터뒤에 입력의 끝을 표시하는 문자하나가 더 입력됩니다.
		System.out.println("입력된 값 : "+input);
		System.out.println("입력된 문자 : " +(char)input);
		
		
	}
	
}









