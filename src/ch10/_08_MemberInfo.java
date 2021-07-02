package ch10;

public class _08_MemberInfo {

	private String name;
	private int age;
	
	public _08_MemberInfo() {
		super();
	}
	public _08_MemberInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void showMemberInfo() {
		System.out.println("이름 : " + name + " 나이 : " +age );
	}
	
	
	
}
