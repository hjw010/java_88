package ch14;

//계좌정보
public class _06_Account {

	private String accountNo; //계좌번호
	private String ownerName; // 예금주 이름
	private int balance; //잔액

	public _06_Account() {
		super();
	}
	
	public _06_Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	//입금
	public void deposit(int amount) { 
		balance += amount;
	}
	
	//인출
	public int Withdraw(int amount) {
		if(balance < amount) {
			return 0;
		}else {
			balance -= amount;
			return balance;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
