package ch09;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//437
public class _17_Comparator implements Comparator<_16_Member> {

	@Override
	public int compare(_16_Member mem1, _16_Member mem2) {
		return (mem1.getName().compareTo(mem2.getName())*-1);
	}

	public static void main(String[] args) {
		Set<_16_Member> set = new TreeSet<_16_Member>(new _17_Comparator());
		set.add(new _16_Member (1,"가나다라"));
		set.add(new _16_Member (2,"마나다라"));
		set.add(new _16_Member (2,"다나다라"));
		set.add(new _16_Member (2,"나나다라"));
		set.add(new _16_Member (3,"하나다라"));
		System.out.println(set);
	}
	
}
