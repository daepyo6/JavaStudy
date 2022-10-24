package days18;

// 익명 클래스 : 클래스 이름없이 상속 또는 구현을 위해서 만드는 클래스

// new Thread().start();
// 익명 클래스를 활용한 스레드 생성
// 익명 클래스 : 메서드를 오버라이딩하면서 객체를 생성하는 방법

public class Thread05 {

	public static void main(String[] args) {
		
		// Thread 클래스를 상속한듯 하지만 상속의 구문은 없는 형태
		// 상속 받은 클래스가 익명클래스이고 그 안의 run 메서드가 오버라이딩 된 상태입니다.
		// 그리고 만들어진 객체에 바로 .start()를 붙여서 실행합니다.
		// 스레드를 실행하는 세번째 방법
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 10 ; i++) {
					System.out.println("익명클래스 : " + (i+1) );
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		
		for (int i = 0; i < 10 ; i++) {
			System.out.println("메인 : " + (i+1) );
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
