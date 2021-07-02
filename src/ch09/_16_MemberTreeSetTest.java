package ch09;
//432
public class _16_MemberTreeSetTest {
	public static void main(String[] args) {
		
		_16_MemberTreeSet treeSet = new _16_MemberTreeSet();
		
		_16_Member member1 = new _16_Member(1, "기러기");
		_16_Member member2 = new _16_Member(2223, "갈매기");
		_16_Member member3 = new _16_Member(33, "추노");
		_16_Member member4 = new _16_Member(455, "노비");
		_16_Member member5 = new _16_Member(4, "노비");
		treeSet.add(member1);
		treeSet.add(member2);
		treeSet.add(member3);
		treeSet.add(member4);
		treeSet.add(member5);
		treeSet.show();
	}
}
