package days20;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

// server : 통신망에 연결되어서 자신에게 접속되어지는 클라이언트들에게 정보를 제공해주는 컴퓨터
// client : server로 부터 정보를 제공받는 컴퓨터
public class TcpipServer01 {

	public static void main(String[] args) {

		// Server와 Client의 연결을 가능하게 해주는 클래스
		ServerSocket ss = null; // ServerSocket의 참조변수 생성
		// Client에게 보낼 현재시각의 양식
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");

		try {
			ss = new ServerSocket(7777);
			// 서버소켓의 객체 생성
			// 위 문장이 실행되면 서버가 클라이언트에 연결요청을 기다리며, 수락할 준비가 완료됩니다.
			// 7777 : 클라이언트가 접속 요청하는 포트번호
			// 포트번호는 반드시 7777이 아니어도 되고 자유롭게 설정가능하며,
			// 포트번호를 알고있는 클라이언트만 접속가능하게도 할 수 있습니다.
			System.out.println(f.format(new Date()) + " 서버가 준비되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		// 서버소켓은 준비완료 이후 클라이언트의 연결요청이 올때까지 실행을 잠시 멈추고 계속 기다립니다.
		while (true) {
			System.out.println(f.format(new Date()) + " 연결요청을 기다립니다.");
			try {
				Socket s = ss.accept(); // 서버소켓이 연결을 기다리다가 요청을 감지하면 accept가 실행됩니다.
				// 클라이언트의 연결요청이 오면 클라이언트 소켓과 통신할 새로운 통신용 소켓(s)를 연결정보와 함께 생성하고,
				// 소켓이 요청받은 클라이언트 연결정보를 전달합니다.
				System.out.println(f.format(new Date()) + s.getInetAddress() + "로 부터 연결요청이 들어왔습니다.");

				OutputStream out = s.getOutputStream();
				// 정보전달을 위한 OutputStream 객체를 새엉하되 이는 연결된 통신소켓에서 얻어냅니다.
				DataOutputStream dos = new DataOutputStream(out); // 최종 통신 출력도구 : dos
				dos.writeUTF("[공지] 연결성공! 204호 00번 서버에 접속되셨습니다. ");

				System.out.println(f.format(new Date()) + " 메세지를 전송했습니다.");
				dos.close();
				s.close();
				// ss.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
