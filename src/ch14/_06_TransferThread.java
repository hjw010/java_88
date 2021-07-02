package ch14;

//계좌이체 스레드
public class _06_TransferThread extends Thread {

	_06_SharedArea sharedArea;

	public _06_TransferThread() {
		super();
	}

	public _06_TransferThread(_06_SharedArea sharedArea) {
		super();
		this.sharedArea = sharedArea;
	}

	@Override
	public void run() {
		//계좌이체 5번.. 이체금액 1000원씩
		for (int i = 0; i < 5; i++) {
			sharedArea.transfer(1000);
		}
		
		/*
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
		
	}
	
}
