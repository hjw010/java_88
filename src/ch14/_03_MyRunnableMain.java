package ch14;

public class _03_MyRunnableMain {

	public static void main(String[] args) {

		//2개의 스레드 A , B 발생시킴
		
		Thread t1 = new Thread(new _03_MyRunnable("A"));
		Thread t2 = new Thread(new _03_MyRunnable("B"));
		t1.start();
		t2.start();
	}

}
