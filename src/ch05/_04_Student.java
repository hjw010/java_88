package ch05;

public class _04_Student {

	//멤버 변수
	private String name;
	private int age;
	private String email;
	
	public _04_Student() {
		
	}
	public _04_Student(String name, int age, String email) {
		this.name = name;
		this.age = age;
		this.email = email;
	}

	
	public void printStuInfo() {
		System.out.println(name+" "+age +" "+email);
	}
	
	
	
}
