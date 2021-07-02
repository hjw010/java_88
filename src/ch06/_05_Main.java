package ch06;

public class _05_Main {

	public static void main(String[] args) {
		
		
		_05_VipMember vipMember = new _05_VipMember("신동엽분신","1234","조태식","VIP");
		_05_GoldMember goldMember = new _05_GoldMember("패드립황제","3456","고봉식","GOLD","등급상승 이벤트");
		vipMember.printInfo();
		System.out.println();
		goldMember.printInfo();
		
		
	}
}
