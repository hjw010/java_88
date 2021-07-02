package ch09;

import java.util.ArrayList;
import java.util.List;

public class _04_MemberArrayList {

	List<_04_Member> list;

	public _04_MemberArrayList() {
		list = new ArrayList<_04_Member>();
	}
	
	public void add(_04_Member member) {
		list.add(member);
	}
	
	public boolean removeMember(int memberId) {
		for (int i = 0; i < list.size(); i++) {
			_04_Member member = list.get(i);
			if(member.getMemberId() == memberId) {
				list.remove(i);
				return true;
			}
		}
		System.out.println(memberId + "는 존재 하지 않습니다.");
		return false;
	}
	
	public void showAllMembers() {
		for (_04_Member member : list) {
			System.out.println(member + " ");
		}
	}
	
	
	
	
}
