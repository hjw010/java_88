package ch14;

//2) Runnable interface 구현
public class _03_MyRunnable implements Runnable {

	private String threadName;
	
	public _03_MyRunnable() {
		super();
	}

	public _03_MyRunnable(String threadName) {
		super();
		this.threadName = threadName;
	}

	@Override
	public void run() {
		
		for (int i = 10; i > 0; i--) {
			System.out.print(threadName + i +" ");
		}
	}

	
}
