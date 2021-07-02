package test;

public class Emart {

	private String foodName;
	private int buyer;
	private int money;
	
	public Emart() {
	}
	public Emart(String foodName) {
		this.foodName = foodName;
	}
	
	public void buy(int money) {
		this.money+=money;
		buyer++;
	}
	
	public void pirntInfo() {
		System.out.println("음식 : " +foodName +", 구매자 수 : " +buyer + ", 판매 총액 : " + money);
	}
	
	
	
	
}
