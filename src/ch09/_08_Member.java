package ch09;

public class _08_Member {

	private int memberId;
	private String memberName;
	private String memberEmail;

	public _08_Member(int memberId, String memberName, String memberEmail) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberEmail = memberEmail;
	}

	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	
	
	@Override
	public String toString() {
		return "아이디 : " + memberId + " 이름 : " + memberName + " 이메일 : " +memberEmail;
	}
	
	
}
