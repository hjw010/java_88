package test.test0525;

public class Bank {

	
	private String bankName;
	private String accountNumber;
	private double rate;
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public void printInfo() {
		System.out.print(bankName +" "+ accountNumber +" "+ rate+" ");
	}
	
}
