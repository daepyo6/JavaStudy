package days18;

import javax.swing.JOptionPane;

class ThreadE extends Thread{
	private boolean state = true; // run 메서드 내부에서 실행종료를 판단할 변수로 생성
	private boolean countExit = true;
	public void setState(boolean s) {
		state = s;
	}
	public boolean isState() {
		return state;
	}
	public boolean getCountExit() {
		return countExit;
	}

	@Override
	public void run() {
		for(int i = 10; (i > 0) && (state==true) ; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (Exception e) { }
		} 
		if(state==true) {
			System.out.println("입력시간이 지났습니다.");
			countExit = false;
		}
			
	}
}

public class Thread06 {

	public static void main(String[] args) {
		ThreadE e1 = new ThreadE();
		e1.start();		// 카운트 다운을 위한 스레드가 시작됩니다.
		String input = JOptionPane.showInputDialog("정답을 입력하세요."); //정답 입력 대기도 시작됩니다.
		// InputDialog에 입력이 되면 다음 명령이 실행되고 없으면 계속 대기한다.
		// 아래 명령이 실행이 된다는건 입력이 되었다는 뜻
		// 현재위치에서 ThreadE를 멈추게 하는 값에 설정을 실행합니다.
		e1.setState(false);
		if(e1.getCountExit() == true) {
			System.out.println("입력하신 값은 : " + input + "입니다.");
		}
		
		// countExit변수는 카운트 다운 내에 입력이 완료되었을 때 true이고,
		// 카운트다운이 모두 실행되고 끝났을때는 false입니다.
		// getCountExit 메서드로 countExit변수 값을 얻어왔을 때 true이면 입력한 값 출력이 실행되고,
		// false이면 실행되지 않습니다.
		
		// e1.stop()은 사용하지 않습니다.
		
			
	}

}
