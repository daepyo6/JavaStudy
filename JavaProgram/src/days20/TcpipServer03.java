package days20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class Sender extends Thread{
	Socket socket;
	DataOutputStream dos;		// 메세지 전송용 출력 스트림
	String name;
	
	public Sender(Socket s) {
		this.socket = s; // 메인에서 전달된 socket 참조값을 현재클래스의 socket 멤버변수에 저장해서 사용
		// 현재 클래스에서 socket을 이용한 전송은 메인의 socket을 이용한 전송과 같은 동작이 됩니다.
		OutputStream os;
		try {
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			name = "[" + socket.getInetAddress() + ":" + socket.getPort() + "]";
			// 메세지를 전송하려는 주체의 아이피와 포트를 대화명으로 저장
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);

		while(dos != null) {	// 접속된 소켓이 살아있어서 전송할 대상이 계속 존재한다면
			try {
				String message = sc.nextLine();
				dos.writeUTF(name + message);	// 전송주체의 이름과 전송할 메세지를 전송
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
		
	}
	
}

class Receiver extends Thread{
	Socket socket;
	DataInputStream dis;
	
	public Receiver(Socket s) {
		this.socket = s;
		try {
			dis = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		String message;
		
		while(dis!=null) {
			try {
				message = dis.readUTF();
				System.out.println(message);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class TcpipServer03 {

	public static void main(String[] args) {
		ServerSocket sS = null;
		Socket s = null;
		try {
			sS = new ServerSocket(7777);
			System.out.println("서버가 준비되었습니다.");
			s = sS.accept();
			
			// 앞선 예제에서는 DataOutputStream에 s를 사용하여 출력
			// 또는 DataInputStream에 s를 활용하여 입력
			// 그러나 본 예제는 s를 Sender와 Receiver의 생성자 전달인수로 보내서
			// 현재 연결을 이용한 입출력을 양방향 자유롭게 가능하게 제작합니다.
			// 각 클래스는 Thread를 상속받아, 동시실행이 가능하게 합니다.
			Sender sender = new Sender(s);
			Receiver receiver = new Receiver(s);
			sender.start();
			receiver.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
