package days19;

import java.io.IOException;
import java.io.InputStreamReader;

public class IO04 {

	public static void main(String[] args) throws IOException {
		// 기본 입력을 문자스트림으로 처리하는 방법
		// 일반적으로 문자스트림은 문자스트림 클래스의 객체를 생성하여 입력을 수행합니다.
		// 기존에 생성된 바이트스트림이 존재한다면, 바이트스트림의 객체를 사용하여 문자 스트림으로 변환 할 수 있습니다.
		// 바이트스트림 객체를 문자스트림으로 변환하는 방법
		// InputStreamReader 클래스를 사용
		// InputStreamReader 클래스는 바이트스트림의 객체를 생성자의 매개변수로 전달받아 
		// 해당 바이트스트림을 문자스트림으로 변환
		InputStreamReader reader = new InputStreamReader(System.in);
		
		// byte형 입력만 가능한 System.in(입력받는 기능)을 InputStreamReader가 장착하고
		// char형 입력이 가능하게 확장된 read()메서드를 사용
		char [] message = new char[30];
		System.out.print("메세지를 입력하세요 : ");
		int size = reader.read(message);
		System.out.println("입력된 메세지는 " + size + "글자 입니다.");
		System.out.println(message);
		for (int i = 0; i < message.length; i++) {
			System.out.print(message[i]);
		}
	}

}








