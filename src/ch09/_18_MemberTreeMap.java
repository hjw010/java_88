package ch09;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

//444
public class _18_MemberTreeMap {

	private Map<Integer,_16_Member> map;
	
	public _18_MemberTreeMap () {
		map = new TreeMap<Integer, _16_Member>();
	}
	
	public void add(_16_Member[] mem) {
		for (int i = 0; i < mem.length; i++) {
			map.put(mem[i].getMemberId(), mem[i]);
		}
	}
	
	public void add(_16_Member mem) {
		map.put(mem.getMemberId(), mem);
	}
	
	public void remove(int key) {
		if(map.containsKey(key)) {
			map.remove(key);
		}else {
			System.out.println("없어");
		}
	}
	
	public void printAll() {
		for(Map.Entry<Integer, _16_Member> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue() +" ");
		}
		
	}
	
	public static void main(String[] args) {
		_18_MemberTreeMap treeMap = new _18_MemberTreeMap();
		_16_Member[] mems = {
						new _16_Member(120, "기러기"),
						new _16_Member(570, "기러기2"),
						new _16_Member(820, "기러기3"),
						new _16_Member(44, "기러기4"),
						new _16_Member(79, "기러기5"),
						new _16_Member(78, "기러기6"),
		};
		
		treeMap.add(mems);
		treeMap.printAll();
	}
	
}
