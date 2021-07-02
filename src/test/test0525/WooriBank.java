package test.test0525;

public class WooriBank extends Bank{

	private String vipMember;
	
	public String getVipMember() {
		return vipMember;
	}
	public void setVipMember(String vipMember) {
		this.vipMember = vipMember;
	}





	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(vipMember);
	}
}

