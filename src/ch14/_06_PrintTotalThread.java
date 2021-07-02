package ch14;

// Thread 클레스 상속 - 잔액 합계 스레드
public class _06_PrintTotalThread extends Thread {

	_06_SharedArea sharedArea;

	public _06_PrintTotalThread() {
		super();
	}
	
	public _06_PrintTotalThread(_06_SharedArea sharedArea) {
		super();
		this.sharedArea = sharedArea;
	}

	
	//run() 재정의
	@Override
	public void run() {
		for(int i = 0; i <3; i++) {
			//잔액 합계 구해서 출력
			int sum = sharedArea.getTotal();
			System.out.println("계좌 잔액 합계 : " + sum);
			
			/*
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			*/
			
		}
	}
	
	
	
}
