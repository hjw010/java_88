package ch13;

import java.util.List;

public class _06_Main {

	public static void main(String[] args) {

		
		_06_MemberHashMap memberMap = new _06_MemberHashMap();
		_06_Member[] members = {
								new _06_Member(1001, "한진원", "han@co.kr"),
								new _06_Member(1002, "김가을", "kim@co.kr"),
								new _06_Member(1003, "유봄", "you@co.kr")
		};
		
		memberMap.addMembers(members);
		/*
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
		*/
		
		
		System.out.println("===================스트림을 이용한 방법 =================");
		_06_Member member = new _06_Member(1004, "강하다", "kang@com");
		memberMap.create(member);
		System.out.println();
		memberMap.showAllMembers();
		List<_06_Member> selectList =  memberMap.selectByName("유봄");
		System.out.println(selectList);
		
		System.out.println();
		
		/*
		List<_06_Member> selectList2 =  memberMap.selectById(1001);
		System.out.println(selectList2);
		*/
		_06_Member m = memberMap.selectById(1001);
		System.out.println(m);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
