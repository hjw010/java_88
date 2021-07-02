package ch06;

public class _05_GoldMember extends _05_VipMember{

	private String event;

	
	public _05_GoldMember() {
		super();
	}
	
	public _05_GoldMember(String id, String pwd, String name,String level, String event) {
		super(id,pwd,name,level);
		this.event = event;
	}
	
	
	public void printInfo() {
		super.printInfo();
		System.out.print("\t이벤트 : " + event);
	}
	
}
