package ch06;

public class _05_Member {

	private String id;
	private String pwd;
	private String name;
	
	public _05_Member() {
	}
	public _05_Member(String id, String pwd, String name) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	
	public void printInfo() {
		System.out.print("아이디 : " + id + "\t 비밀번호 : " +pwd +"\t 이름 : " +name+"\t");
	}
	
	
	
}
