package ch06;

public class _05_VipMember extends _05_Member {

	private String level;

	public _05_VipMember() {
		super();
	}

	public _05_VipMember(String id, String pwd, String name, String level) {
		super(id, pwd, name);
		this.level = level;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.print("레벨 : " + level);
	}
	
	
	
	
	
	
}
