package days19;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO07 {

	public static void main(String[] args) throws IOException {
		// 자바의 입출력 클래스들은 다른 스트림 객체를 생성자의 매개변수로 전달받아 
		// 해당 스트림객체에 기능을 추가할 수 있습니다.
		// : 데코레이션 패턴 (객체에 다른 클래스의 기능을 추가하여 사용)
		// 기보드로부터 데이터를 읽어올 수 있는 InputStream 객체를 문자를 읽을 수 있게 변경한 후,
		// 버퍼를 사용하여 데이터를 읽어올 수 있도록 변환합니다.
		// 버퍼 : 프로그램의 입출력 성능을 향상 시키기 위해서 사용되는 중간 저장 메모리
		// 버퍼를 사용하여 READ/WRITE 성능을 향상 시킬 수 있음
		
		InputStreamReader reader = new InputStreamReader(System.in);
		
		//BufferReader 문자스트림 클래스의 하나로 버퍼를 사용하여 데이터를 읽어들일 수 있는 클래스
		BufferedReader br = new BufferedReader(reader);
		// System.in > InputStreamReader > BufferedReader
		
		//BufferReader를 사용함으로써 readLine()사용이 가능하고 String 자료 사용이 가능해집니다.
		System.out.print("메세지를 입력하세요 : ");
		String message = br.readLine();	// 최초 입력변수로 String 사용
		System.out.println("입력된 메세지는 " + message.length() + " 글자 입니다.");
		System.out.println(message);
		
		// 스트림은 메모리 누수현상을 방지하기 위해서 반드시 close 메소드를 호출하여 종료해야됨
		// 하나의 스트림에 여러개의 스트림 클래스가 적용되는 경우 
		// 가장 마지막에 생성된 객체(가장 바깥쪽의 객체)만 close합니다.
		br.close();
		
		

	}

}
