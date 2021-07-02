package ch09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//423
public class _13_HashSetTest {
	
	public static void main(String[] args) {
		MemberHashSet hashSet = new MemberHashSet();
		Member mem1 = new Member(1, "기러기");
		Member mem2 = new Member(2, "갈매기");
		Member mem3 = new Member(3, "코뿔소");
		Member mem4 = new Member(4, "이상해씨");
		Member mem5 = new Member(4, "마구리");
		hashSet.add(mem1);
		hashSet.add(mem2);
		hashSet.add(mem3);
		hashSet.add(mem4);
		hashSet.add(mem5);
		hashSet.printAll();
	}
}

class Member{
	
	private int memberId;
	private String memberName;
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public Member(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	
	@Override
	public String toString() {
		return memberId + " " + memberName + ", ";
	}
	//해쉬만 건드려서 같은 주소로 만들면 일안함. equals도 같이 재정의 해야함 
	//아마도 해쉬셋이 들어온 변수타입을 들어온 변수타입의 equals 메소드를 호출해서 값을 비교후 반복제거 구조인듯함(추측)
	//hashCode도 건드리나봄 /////// ....모르겠음 그냥 쓰겠음.......
	
	@Override
	public int hashCode() {
		return memberId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member mem = (Member)obj;
			if(this.memberId == mem.getMemberId()) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
}

class MemberHashSet{
	
	private Set<Member> memberHashSet;

	public MemberHashSet() {
		super();
		memberHashSet = new HashSet<Member>();
	}
	
	public void add(Member mem) {
		memberHashSet.add(mem);
	}
	
	public void remove(int memberId) {
		Iterator<Member> itr = memberHashSet.iterator();
		while(itr.hasNext()) {
			Member mem = itr.next();
			if(memberId == mem.getMemberId()) {
				memberHashSet.remove(mem);
			}
		}
	}
	
	public void printAll() {
		for(Member mem : memberHashSet) {
			System.out.print(mem + " ");
		}
	}
}
