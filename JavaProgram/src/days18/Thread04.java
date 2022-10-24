package days18;

// 2. Runnable 인터페이스를 구현하는 방법
// 2-1. Runnable 인터페이스를 구현하는 클래스 작성
// 2-2. public void run() 오버라이딩 구현
// 2-3. 해당 클래스의 A객체 생성
// 2-4. A객체를 Thread 클래스의 생성자로 전달하여 Thread 객체 생성
// 2-5. 생성시킨 스레드의 start 메서드 호출

class ThreadD1 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 10 ; i++) {
			System.out.println("ThreadD1 : " + (i+1) + ", " + (i+1)*300);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadD2 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 10 ; i++) {
			System.out.println("ThreadD2 : " + (i+1)+ ", " + (i+1)*800);
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Thread04 {

	public static void main(String[] args) {
		
		// 1. Runnable 인터페이스를 구현한 클래스의 객체 생성.
		ThreadD1 d1 = new ThreadD1();
		// 2. 1에서 생성한 객체를 Thread 생성자에 전달인수로 전달해서 Thread객체를 생성
		Thread t1 = new Thread(d1);
		// 3. 2에서 생성한 객체를 start를 호출해 실행합니다.
		t1.start();
		
		// 위 1, 2, 3과정을 한라인으로 작성할 수 도 있습니다.
		new Thread(new ThreadD2()).start();
		
		for (int i = 0; i < 10 ; i++) {
			System.out.println("main : " + (i+1)+ ", " + (i+1)*1000);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
