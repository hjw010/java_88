package ch09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class _06_MemberHashMap {

	private Map<Integer, _06_Member> map;
	
	public _06_MemberHashMap() {
		map = new HashMap<Integer, _06_Member>();
	}
	
	public void add(_06_Member member) {
		map.put(member.getMemberId(), member);
	}
	
	public void addMembers(_06_Member[] member) {
		for (int i = 0; i < member.length; i++) {
			map.put(member[i].getMemberId(), member[i]);
		}
	}
	
	public boolean removeMember(int memberId) {
		if(map.containsKey(memberId)) {
			map.remove(memberId);
			return true;
		}else {
			System.out.println(memberId + "는 존재하지 않는 아이디 입니다");
			return false;
		}
		
	}
	
	public void showAllMembers() {
		//Set<Integer> keys = map.keySet();
		//Iterator<Integer> itr2 = keys.iterator();
		Iterator<Integer> itr = map.keySet().iterator();
		while(itr.hasNext()) {
			int key = itr.next();
			System.out.println(map.get(key));
		}
	}
	
	public void showAllMembers2() {
		// Iterator<Map.Entry<Integer,_06_Member>> itr = map.entrySet().iterator();
		Set<Map.Entry<Integer, _06_Member>> entries = map.entrySet();
		Iterator<Map.Entry<Integer, _06_Member>> itr = entries.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, _06_Member> entry = itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
	
	
	
	
	
}
