package ch08;

//379
public class _09_ClassPerson {

	private String name;
	private int age;
	
	
	public _09_ClassPerson() {
		
	}

	public _09_ClassPerson(String name) {
		super();
		this.name = name;
	}

	public _09_ClassPerson(String name, int age) {
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
	
	
	
	
}
