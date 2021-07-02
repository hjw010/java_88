package ch09;

//434 comperable 재정의 +정렬(오름 내림)
public class _16_Member implements Comparable<_16_Member> {

	private int memberId;
	private String name;
	
	public _16_Member(int memberId, String name) {
		super();
		this.memberId = memberId;
		this.name = name;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return memberId + " " + name;
	}
	@Override
	public int compareTo(_16_Member member) {
		return this.memberId - member.memberId;
	}
	
}
