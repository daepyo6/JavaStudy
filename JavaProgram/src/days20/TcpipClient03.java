package days20;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpipClient03 {

	public static void main(String[] args) {
		String serverIp = "192.168.0.101";
		
		try {
			Socket s = new Socket(serverIp, 7777);
			System.out.println("서버에 연결되었습니다.");
			
			Sender sender = new Sender(s);
			Receiver receiver = new Receiver(s);
			sender.start();
			receiver.start();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
