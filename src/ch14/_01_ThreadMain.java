package ch14;

public class _01_ThreadMain {

	public static void main(String[] args) {
		/*
		 * [면접] Thread 생성과 실행 (1) Thread 클레스를 상속하기
		 * 
		 * 1.Thread 클레스를 상속받아서 클레스를 작성한다. 
		 * 2.run()메서드 재정의한다. 
		 * 3.main() 메서드에서 Thread 객체
		 * 생성한다. 
		 * 4.start() 메서드를 호출해서 스레드를 실행한다(run()을 호출하는게 아님). 
		 * 5.run() 메서드가 실행된다.
		 * 
		 */

		_01_MyThread thread = new _01_MyThread();
		// start() : thread 실행 - > run()호출
		thread.start();
		
	}
}
