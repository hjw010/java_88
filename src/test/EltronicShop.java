package test;

public class EltronicShop {

	private String brandName;
	private int buyer;
	private int money;
	
	
	public EltronicShop() {
	}
	public EltronicShop(String brandname) {
		this.brandName = brandname;
	}
	
	public void buy(int money) {
		this.money+=money;
		buyer++;
	}
	
	public void printShopInfo() {
		System.out.println("브랜드명 : " + brandName + ", 고객수 : " + buyer + ", 판매 총액 : " + money);
	}
	
	
	
}
