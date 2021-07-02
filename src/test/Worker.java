package test;

public class Worker {

	private String workerName;
	private int money;
	
	public Worker(){
	}
	
	public Worker(String workerName, int money) {
		this.workerName = workerName;
		this.money = money;
	}
	
	public void buyNoteBook(EltronicShop eShop) {
		eShop.buy(10000);
		money-=10000;
	}
	
	public void takeoutStake(Emart emart) {
		emart.buy(5000);
		money-=5000;
	}
	public void printWorkerInfo() {
		System.out.println("이름 : " + workerName +", 남은돈 : " + money + "원");
	}
 	
	
}
