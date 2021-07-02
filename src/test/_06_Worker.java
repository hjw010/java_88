package test;
public class _06_Worker{
	
	private int sabun;
	private String name;
	private int age;
	

	public _06_Worker() {}
	
	public _06_Worker(int sabun, String name, int age) {
		this.sabun=sabun;
		this.name = name;
		this.age =age;
	}
	
	public void setSabun(int sabun){
		this.sabun=sabun;
	}
	public void setName(String name){
		this.name =name;
	}
	public void setAge(int age){
		this.age = age;
	}
	
	public void showInfo(){
		System.out.println("사번 : " + sabun + ", 이름 : " + name +", 나이 : " + age);
	}



} 