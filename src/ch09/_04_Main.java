package ch09;

public class _04_Main {

	public static void main(String[] args) {

		_04_MemberArrayList memberList = new _04_MemberArrayList();
		_04_Member member1 = new _04_Member(1001, "김우찌", "kimwoochi@naver.com");
		memberList.add(member1);
		memberList.add(new _04_Member(1002, "순살치", "leewoochi@naver.com"));
		memberList.add(new _04_Member(1003, "킨너무", "kamwoochi@naver.com"));
		memberList.add(new _04_Member(1004, "좋아무", "pakwoochi@naver.com"));
		memberList.add(new _04_Member(1005, "야무야호", "moowoochi@naver.com"));
		memberList.showAllMembers();
		memberList.removeMember(member1.getMemberId());
		memberList.removeMember(1006);
		System.out.println();
		memberList.showAllMembers();
	}
}
