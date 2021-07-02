package ch09;

public class _06_Main {

	public static void main(String[] args) {

		
		_06_MemberHashMap memberMap = new _06_MemberHashMap();
		_06_Member[] members = {
								new _06_Member(1001, "한진원", "han@co.kr"),
								new _06_Member(1002, "김가을", "kim@co.kr"),
								new _06_Member(1003, "유봄", "you@co.kr")
		};
		
		memberMap.addMembers(members);
		memberMap.showAllMembers();
		System.out.println();
		memberMap.removeMember(members[1].getMemberId());
		memberMap.showAllMembers();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		memberMap.showAllMembers2();
		
		
		
		
	}

}
