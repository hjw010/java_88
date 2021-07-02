package test;

public class BankMain {

	public static void main(String[] args) {

		Bank wooriBank = Bank.getInstance();
		wooriBank.setName("한진원");
		wooriBank.setDeposit(1800000);
		wooriBank.setAccountNumber("111-222");
		wooriBank.printBankInfo();
		Bank shinhanBank = Bank.getInstance();
		shinhanBank.setName("이민지");
		shinhanBank.setDeposit(2300000);
		shinhanBank.setAccountNumber("333-444");
		shinhanBank.printBankInfo();
		
	}
}
