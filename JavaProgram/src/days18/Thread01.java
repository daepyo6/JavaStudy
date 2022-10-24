package days18;

//	Thread : 프로그램의 명령을 실행하게끔 해주는 실행주체.
// 개발자가 별도의 Thread를 생성하지 않는다면,
// 한 프로그램에 하나의 Thread가 존재하여 해당 명령을 차례차례 순서대로 실행시킴.

class ThreadA1 { 
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("ThreadA1 : i  -> " + (i+1));
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadA2 { 
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("ThreadA2 : i  -> " + (i+1));
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Thread01 {

	public static void main(String[] args) {
		ThreadA1 t1 = new ThreadA1();
		ThreadA2 t2 = new ThreadA2();
		t1.run();
		t2.run();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main : i  -> " + (i+1));
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
