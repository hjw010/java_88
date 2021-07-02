package ch14;

public class _04_Thread {

	public static void main(String[] args) {
		
		System.out.println("현재 수행되고 있는 스레드 이름 : " 
							+ Thread.currentThread().getName());	
		System.out.println("스레드의 최소 우선순위 값 : " + Thread.MIN_PRIORITY);
		System.out.println("스레드의 최대 우선순위 값 : " + Thread.MAX_PRIORITY);
		System.out.println("스레드의 최대 우선순위 값 : " + Thread.NORM_PRIORITY);
		
		System.out.println("현재 수행되고 있는 스레드 우선순위 : " 
							+Thread.currentThread().getPriority());
		
		
	}
}
