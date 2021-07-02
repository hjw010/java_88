package ch09;

import java.util.Set;
import java.util.TreeSet;

//428
public class _15_TreeSetTest {
/*
 * TreeSet 
 * -자료의 중복을 허용하지 않으면서 출력 결과값을 정렬한다.
 * String 클래스안에 정렬방식이 이미 구현되어 있음
 */
	
	public static void main(String[] args) {
		Set<String> strSet = new TreeSet<String>();
		strSet.add("무야무야호");
		strSet.add("무야무야호2");
		strSet.add("무야무야호3");
		strSet.add("무야무야호4");
		strSet.add("무야무야호5");
		strSet.add("무야무야호5");
		strSet.add("무야무야호5");
		strSet.add("무야무야호5");
		System.out.println(strSet);
	}
}
