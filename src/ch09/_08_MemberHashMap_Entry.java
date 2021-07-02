package ch09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class _08_MemberHashMap_Entry {

	public static void main(String[] args) {
		
		/*
		 *	[시험] 
		 */
		Map<String, _08_Member> map = new HashMap<String, _08_Member>();
		
		map.put("mem001", new _08_Member(1,"한진원","han@co.kr"));
		map.put("mem002", new _08_Member(2,"유봄","you@co.kr"));
		map.put("mem003", new _08_Member(3,"김가을","kim@co.kr"));
		
		System.out.println(map);
		map.remove("mem002");
		System.out.println(map);
		
		map.put("mem003", new _08_Member(3,"김지유","kim@co.kr")); //값을 덮어버림
		map.put("mem004", new _08_Member(4,"이승민","lee@co.kr"));
		
		System.out.println(map);
		
		System.out.println();
		// Map.Entry<String, _09_Member> -> getKey(), getValue();
		//map.entrySet()매핑정보(키와 값)를 돌려줌
		
		
		Set<Map.Entry<String, _08_Member>> entries = map.entrySet();
		Iterator<Map.Entry<String, _08_Member>> itr = entries.iterator();
		while(itr.hasNext()) {
			Map.Entry<String, _08_Member> entry =  itr.next();
			System.out.println(entry.getKey() +" " +entry.getValue());
		}
		
		/*
		for(Map.Entry<String, _09_Member> entry : entries) {
			System.out.println(entry.getKey() +" "+ entry.getValue());
		}
		*/
		
		/*
		for(Map.Entry<String, _09_Member> entry : map.entrySet()){
			String key = entry.getKey();
			_09_Member member = entry.getValue();
			System.out.println("key : " +key + ", value : " + member);
		}
		*/
		
		/*
		for(Map.Entry str : map.entrySet()){
			String key = (String)str.getKey();
			_09_Member member = (_09_Member)str.getValue();
			System.out.println("key : " +key + ", value : " + member);
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
