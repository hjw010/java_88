package ch14;

//2) Runnable 인터페이스르 구현하는 방법
public class _02_MyThread implements Runnable{

	
	
	@Override
	public void run() {
		int sum=0;
		for (int i = 1; i < 11; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

	
}
