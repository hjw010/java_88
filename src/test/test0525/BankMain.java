package test.test0525;

public class BankMain {

	public static void main(String[] args) {
		WooriBank woori = new WooriBank();
		woori.setBankName("우리은행");
		woori.setAccountNumber("2627-1431");
		woori.setRate(3.5);
		woori.setVipMember("gold");
		woori.printInfo();
		System.out.println();
		ShinhanBank shinhan = new ShinhanBank();
		shinhan.setBankName("신한은행");
		shinhan.setAccountNumber("9874-7856");
		shinhan.setRate(3.2);
		shinhan.setEvent("달력증정");
		shinhan.printInfo();
		//2) 오버라이딩 - 상속을 통한 메서드 재구현
		//3) extends 부모 클레스  - 부모의 맴버 변수와 메서드를 상속받아 사용
	}
	

}
