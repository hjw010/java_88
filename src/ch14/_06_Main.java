package ch14;

public class _06_Main {

	public static void main(String[] args) {
		//계좌번호 , 이름 , 금액
		
		//스레드생성
		// 계좌이체 5회
		// 잔액합계 3회
		
		/*
		 * 1) 한 계좌의 금액을 다른 계좌로 이체
		 * 2) 공유영역 (아이유 계좌(200만원) + 성시경 계좌(100만원)
		 * 3) 두 계좌의 잔액합계를 출력하는 일을 동시에 한다.
		 */

		
		_06_Account account1 = new _06_Account("11-22","서상현", 2000000);
		_06_Account account2 = new _06_Account("33-44","강창완", 1000000);
		_06_SharedArea sharedArea = new _06_SharedArea(account1,account2);
		/*
		_06_SharedArea sharedArea = new _06_SharedArea();
		sharedArea.account1 =account1;
		sharedArea.account2 =account2;
		*/
		Thread printTotalThread = new _06_PrintTotalThread(sharedArea);
		Thread transferThread = new _06_TransferThread(sharedArea);
		
		printTotalThread.start();
		transferThread.start();
		
		
	}
}
