package ch03;

public class _02_MemberMain {

	public static void main(String[] args) {

		_02_Member han = new _02_Member();
		han.name="한진원";
		han.birthDay="03-22";
		han.age=31;
		han.address="서울";
		
		han.showInfo();
		
		System.out.println("********************************");
		_02_Member han2 = new _02_Member();
		han2.showInfo();
		
		
	}

}
