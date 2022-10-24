package days18;

import javax.swing.JOptionPane;

class ThreadC1 extends Thread{
	
	@Override
	public void run() {
		String input = JOptionPane.showInputDialog("정답을 입력하세요.");
		System.out.println("입력하신 값은 " + input + "입니다.");
	}
	
}

class ThreadC2 extends Thread{

	@Override
	public void run() {
		for (int i = 10; i > 0 ; i--) {
			System.out.println(i + "초 남았습니다.");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("입력시간이 지났습니다.");
	}
	
}

public class Thread03 {

	public static void main(String[] args) {
		ThreadC1 c1 = new ThreadC1();
		ThreadC2 c2 = new ThreadC2();
		c1.start();
		c2.start();
		
		// c1의 상태를 보고 종료시 c2도 종료되게 하면 될듯 합니다.
		// 다만 종료명령이 다소 복잡합니다.
		// 기존에 사용되던 c1.stop(); 이 있지만 Thread의 stop() 메서드는 사용중이었던
		// 자원(변수, 메모리 등)의 불안정을 초래하기 때문에 지금은 사용하지 않습니다.

	}

}
