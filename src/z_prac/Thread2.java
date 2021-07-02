package z_prac;

public class Thread2 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i <200; i++) {
			System.out.println("Thread2 - run");
		}
	}
}
