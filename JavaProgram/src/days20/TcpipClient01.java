package days20;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpipClient01 {

	public static void main(String[] args) {
		
		String serverIp = "192.168.0.101";
		
		try {
			Socket s = new Socket(serverIp, 7777);
			// Socket : 클라이언트가 연결을 요청할 소프트웨어
			// serverIp : 클라이언트가 요청할 연결의 목적지 주소
			// 7777 : 서버에서 관리할 연결의 그룹번호
			// 객체가 만들어지는 순간 써놓은 아이피와 포트번호로 연결을 요청합니다
			
			//연결이 성공하면 아래문장을 실행. 실패하면 catch구문을 실행
			InputStream in = s.getInputStream();	// 소켓에서 입출력 스트림을 전달 받아 입출력도구로 사용
			// InputStream의 단순 아스키 코드 입출력을 생성자에 넣은 서버 클라이언트 통신에 사용가능한 스트림을 생성
			DataInputStream dis = new DataInputStream(in);
			
			// 연결된 서버로부터 전달된 메세지를 저장합니다.
			String m = dis.readUTF();
			
			// 소켓으로부터 전달받은 데이터를 출력
			System.out.println("받은 메세지 : " + m);
			System.out.println("연결을 종료합니다.");
			// 스트림과 소켓을 닫습니다.
			dis.close();
			s.close();
			System.out.println("연결이 종료되었습니다.");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
