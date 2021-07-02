package z_prac;

public class Thread1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <200; i++) {
			System.out.println("Thread1 - run");
		}
	}
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread1();
		Thread t2 = new Thread2();
		t1.start();
		t2.start();
		
	}
}
