package days18;

/* 프로그램의 수행 중 동시에 처리하고자 하는 작업이 생겼을때는 원래 갖고 있는 메인 Thread외에
 * Thread 클래스를 추가 사용하여 실행시킬 수 있습니다.
 * Thread Class : 프로그램 실행의 흐름을 분기할 수 있는 방법을 제공하는 클래스
 * 
 * 구현방법
 * 1. Thread 클래스를 상속받는 방법
 * 		1-1. Thread 클래스를 상속받아 public void run() 메서드를 오버라이딩합니다.
 * 				public void run() : 스레드가 생성되어 수행할 작업을 정의하는 메서드,
 * 		1-2. 해당클래스의 객체를 생성하고, start 메서드를 호출합니다.
 * 				만약 오버라이딩된 run 메서드를 호출려면, 스레드 생성실행이 아니라, 일반 메서드 호출이 되므로
 * 				반드시 start 메서드를 통해 run으로 이어지게 호출합니다.
 * 				start 메서드 : Thread클래스(부모클래스)에 있는 메서드로, 자체적으로 스레드 추가 생성후 run 메서드를
 * 								   재호출 하는 역할을 합니다.(상속된 메서드로 메서드가 표면에 보여지지 않은채 사용)
 * 2. Runnable 인터페이스를 implements(구현)하는 방법
 * 		2-1. Thread클래스를 상속하는 방법과 같고 효과도 거의 같습니다.
 */

class ThreadB1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("ThreadB1 : " + (i+1));
			try {
				//Thread.sleep(300);
				sleep(300);
				// sleep메서드는 Thread클래스에 있는 static 메서드입니다.
				// 사용할때 Thread.sleep()으로 사용해야 되지만 현재 위치는 자기 자신의 클래스
				// 내부이기도 하므로 sleep()으로만 사용해도 됩니다.
				// 또한 프로세서 실행에 관여하는 명령이라서 예외처리가 따라다닙니다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};
}

class ThreadB2 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("ThreadB2 : " + (i+1));
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};
}

public class Thread02 {

	public static void main(String[] args) {
		ThreadB1 t1 = new ThreadB1();
		ThreadB2 t2 = new ThreadB2();
		// t1.run();
		// t2.run();	// run 메서드를 직접 호출하는것은 스레드 생성없이 
							// 단순실행을 시키는 것이므로 앞선 예제와 같은 결과가 나옵니다.
		t1.start();		// 별도의 스레드 생성 & 실행
		t2.start();		// 별도의 스레드 생성 & 실행
		
		
		// 기존에 존재하던 쓰레드로 실행
		for (int i = 0; i < 10; i++) {
			System.out.println("Main : " + (i+1));
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
