package ch09;

import java.util.ArrayList;
import java.util.List;

public class _02_ArrayList {
	public static void main(String[] args) {
		/*
		 * 8. 검색 : list.indexOf(검색할 값); // 중요 리스트에서 검색할 값과 똑같은 값을 갖는 첫번째 데이터를 찾아서 그 위치의
		 * 인덱스를 리턴한다. 검색할 값과 일치한 데이터가 없으면 -1을 리턴한다.
		 *
		 * 검색 : list.LastindexOf(검색할 값); // 중요 리스트에서 검색할 값과 똑같은 값을 갖는 마지막번째 데이터를 찾아서 그
		 * 위치의 인덱스를 리턴한다. 검색할 값과 일치한 데이터가 없으면 -1을 리턴한다.
		 *
		 *
		 */
		List<String> list = new ArrayList<String>();
		list.add("H");// 0
		list.add("A");
		list.add("N");
		list.add("J");
		list.add("I");
		list.add("N");
		list.add("W");
		list.add("O");
		list.add("N");
		list.add("G");
		list.add("G");// 10

		// 일치하는 데이터를 찾아서 그 위치의 인덱스를 리턴한다.
		System.out.println("G문자의 인덱스 : " + list.indexOf("G"));
		System.out.println("G문자의 마지막 인덱스 : " + list.lastIndexOf("G"));
		System.out.println("N문자의 첫번째 인덱스 : " + list.indexOf("N"));
		System.out.println("N문자의 마지막 인덱스 : " + list.lastIndexOf("N"));
		// 일치하는 값이 없으면 -1 리턴
		System.out.println("Z문자의 첫번째 인덱스 : " + list.indexOf("Z"));

		for (String str : list) {
			System.out.print(str + " ");
		}
		
		System.out.println();
		System.out.println(list);
		list.clear();
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
