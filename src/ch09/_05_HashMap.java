package ch09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class _05_HashMap {
	public static void main(String[] args) {
		/*
		 * p439 해싱(hashing) : 키를 이용해서 해시테이블로 부터 데이터를 가져오는 과정
		 * 
		 * hashMap 1) 특징 -데이터의 순서를 보장하지 않는다. -key와 value 쌍으로 저장한다. -key는 중복될 수 없다. -key를
		 * 이용해서 value를 가져올 수 있다. -List 와 달리 index가 없다. -Map이라는 인터페이스를 구현한 클래스이다.
		 * 
		 * 2) 선언 -HashMap<key 타입, value 타입> map = HashMap<key 타입, value 타입>(); -Map<key
		 * 타입, value 타입> map = HashMap<key 타입, value 타입>();
		 * 
		 * 3) 메서드 - 데이터 추가 : put(key,value); - 데이터 가져오기 : get(key); - 데이터 삭제 :
		 * remove(key); - 데이터 비어있는지 여부 : isEmpty(); - 해당 키가 있는지 여부 : containsKey(key); -
		 * 해당 값이 있는지 여부 : containsValue(value); - 해당 갯수 : size();
		 * 
		 * 
		 */

		//map 생성
		//Syntax error, insert "Dimensions" to complete TypeArgument
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		//데이터 추카
		String[] str = {
					"한진원",
					"한가을",
					"한봄",
					"한여름",
					"한겨울"
		};
		for (int i = 0; i < str.length; i++) {
			map.put(i, str[i]);
		}
		
		for (int i = 0; i < map.size(); i++) {
			System.out.print(map.get(i)+" ");
		}
		
		//System.out.println(map.get(2));
		System.out.println();
		System.out.println(map.size());
		map.remove(0);// 삭제후 키, 값 존재 x 그래도 널을 출력하는것을보면 인덱스에 키와 값을 삭제후 널을 대입하는걸로 추측
		System.out.println("=====삭제후======");
		System.out.println(map.size());
		
		for (int i = 0; i < map.size()+1; i++) {
			System.out.print(map.get(i)+" ");
			//데이터 삭제시 해당 데이터를 null로 대체하고 사이즈를 -n개 만큼 줄임  데이터손실이 일어남
		}
	
		System.out.println();
		System.out.println(map.isEmpty());
		
		System.out.println();
		System.out.println("인덱스 0번 : " + map.containsKey(0));
		
		System.out.println();
		System.out.println(map.containsValue("한겨울"));
		System.out.println();
		
		System.out.println("set=====================");
		Set<Integer> set = map.keySet();
		System.out.println(set.size());
		System.out.println(set);

		
		Iterator iterator = map.keySet().iterator();
		while(iterator.hasNext()) {
			int key = (int)iterator.next();
			String str2 = map.get(key);
			System.out.print(str2+" ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(map);
		
		
		
		
		
	}
}
