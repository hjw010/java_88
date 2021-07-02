package test;

public class Bank{

	private static Bank bank = new Bank();
	private String name;
	private int balance;
	private String accountNumber;

	private Bank(){}

	//setter	
	public void setName(String name){
		this.name = name;
	}
	public void setDeposit(int balance){
		this.balance = balance;	
	}
	public void setAccountNumber(String accountNumber){
		this.accountNumber = accountNumber;
	} 
	
	//getter
	public String getName(){
		return name;
	}
	public int getDeposit(){
		return balance;
	}
	public String getAccountNumbe(){
		return accountNumber;	
	}

	public static Bank getInstance(){
		return bank;
	}

	public void printBankInfo(){
		System.out.println("이름 : " + name + ", 보증금 : " + balance +", 계좌번호 : " + accountNumber);
	}
	
}

