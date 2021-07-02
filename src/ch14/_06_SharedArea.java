package ch14;

public class _06_SharedArea {

	/*
	 * [synchronized] -> 동기화.
	 * ex) A,B,C 세사람이 문서출력 출력순서는 달라질 수 있으나(시분할), 문서는 섞이면 안된다.
	 * 
	 * 동기화란 공유된 자원중에서 동시에 사용하면 안되는 자원에 대해 잠금(lock)을 수행하여 보호하는 도구이다.
	 * 즉 메서드를 호출할 때 객체에 잠금을 하고, 메서드 수행이 끝나면 잠금을 해제한다.
	 * 이때 Vector라는 자료구조가 사용되고, 메서드가 호출될때마다 잠금과 해제가 일어나므려 ArrayList보다 수행속도가 느리다.
	 * 
	 * <임계영역(critical section)의 동기화>
	 * - 한 사용자가 자원을 사용하고 있으면, 다른 사용자는 사용이 끝날때까지 기다려야 한다.
    *   이러한 영역을 임계영역이라고 한다.
    *   
    * - 동기화 메서드를 만들기 위해서는   synchronized 키워드를 메서드 선언에 붙이면 된다.
    * - synchronized 키워드를 사용하면, 어떠한 순간에는 하나의 스레드만이 임계영역 안에서 실행하는 것이 보장된다.
    * - synchronized 키워드가 붙어있으면, 하나의 스레드가 공뮤메서드를 실행하는 동안에, 다른 스레드는 공유메서드를 실행할 수 없다.
    * 
    * - wait() 메서드는 어떤 일이 일어나기를 기다릴 때 사용하는 메서드이다.
    * - notify() 메서드는 반대로 어떤 일이 일어났을 때 이를 알려주는 메서드이다
	 * 
	 * 
	 * -critical sectio이 문제를 일으키지 안흐열면 그부분이 실행되는 동안
	 * 다른 스레드가 공유 데이터를 사용할 수 없도록 만드는것을 말한다.
 	 */
	
	_06_Account account1; 
	_06_Account account2;
	
	
	
	public _06_SharedArea() {
		super();
	}

	public _06_SharedArea(_06_Account account1, _06_Account account2) {
		super();
		this.account1 = account1;
		this.account2 = account2;
	}

	//synchronized
	//계좌이체
	public synchronized void transfer(int amount) {
		//인출 메서드 호출
		account1.Withdraw(amount);
		System.out.println("상현이 계좌 : " + amount +"원 인출");
		//입금 메서드 호출
		account2.deposit(amount);
		System.out.println("창완이 계좌 : " + amount +"원 입금");
		
	}

	//synchronized
	//잔액 합계 구하기
	public synchronized int getTotal() {
		return account1.getBalance() + account2.getBalance();
	}
	
	
	
	
	
}
