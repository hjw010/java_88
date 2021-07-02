package ch14;

public class _02_ThreadMain {

	public static void main(String[] args) {
		/*
		 * [면접] Thread 생성과 실행 
		 * (2) Runnable 인터페이스 구현
		 * 
		 * 1.Runnable 인터페이스 구현하여 클레스를 작성한다. 
		 * 2.추상메서드 run()을 재정의
		 * 3.main() 메서드에서 Thread 객체를 생성하고, 이때 구현한 클레스 객체를 매개변수로 전달
		 * 4.start() 메서드를 호출해서 스레드를 실행한다(run()을 호출하는게 아님). 
		 * 5.run() 메서드가 실행된다.
		 * 
		 */

		_02_MyThread thread = new _02_MyThread();
		Thread t = new Thread(thread);
		t.start();
		
		
	}
}
