package ch13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
	
	
	// create() - 새 회원정보 추가
	public int create(_06_Member member){
	
		//Optional : null 처리를 직접하지 않고 Optional 클래스에 위임하기 위해 사용
		//key값으로 조회해서 이미 존재하는 데이터이면
		Optional.ofNullable(map.get(member.getMemberId()))
			.ifPresent(m -> {
				throw new _06_IdDuplicateException(m +"는 이미 존재하는 회원 입니다.");
			});
		
		map.put(member.getMemberId(), member);
		return member.getMemberId();
	}
	
	
	//한명의 회원 조회(이름)
	public List<_06_Member> selectByName(String name){
		return map.values().stream()
				.filter(m -> m.getMemberName()
						.equals(name)).collect(Collectors.toList());
	}
	
	
	//한명의 회원 조회(아이디)
	public _06_Member selectById(int memberId) {
		return map.get(memberId);
	}
	/*
	public List<_06_Member> selectById(int memberId){
		return map.values().stream()
				.filter(m -> m.getMemberId()==memberId)
					.collect(Collectors.toList());
	}
	*/

	
	
	
}
