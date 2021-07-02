package ch04;

public class _08_taxi {

	public String taxiNumber;
	public int money;
	
	public _08_taxi() {}
	
	public _08_taxi(String taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	public void take(int money) {
		this.money+=money;
	}
	
	public void showInfo() {
		System.out.println("택시 넘버 : " + taxiNumber + ", 택시 요금 누적 : " +money);
	}
	
	
	
}
