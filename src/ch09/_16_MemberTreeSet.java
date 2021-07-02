package ch09;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//431
public class _16_MemberTreeSet {
	private Set<_16_Member> treeSet;
	
	public _16_MemberTreeSet() {
		treeSet = new TreeSet<_16_Member>();
	}
	
	public void add(_16_Member member) {
		treeSet.add(member);
	}
	
	public Set<_16_Member> getTreeSet() {
		return treeSet;
	}

	public void setTreeSet(Set<_16_Member> treeSet) {
		this.treeSet = treeSet;
	}

	public void remove(int memberId) {
		
		Iterator<_16_Member> itr = treeSet.iterator();
		while(itr.hasNext()) {
			_16_Member mem = itr.next();
			if(memberId == mem.getMemberId()) {
				treeSet.remove(mem);
			}else {
				System.out.println("없음");
			}
		}
	}
	
	public void show() {
		for(_16_Member member : treeSet) {
			System.out.println(member + " ");
		}
	}
}
