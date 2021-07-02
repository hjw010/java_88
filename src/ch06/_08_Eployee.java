package ch06;

public class _08_Eployee {

	private String sabun;
	private String name;
	private String deptName;
	private int salary;
	
	public _08_Eployee() {
	}
	public _08_Eployee(String sabun, String name, String deptName, int salary) {
		this.sabun = sabun;
		this.name = name;
		this.deptName = deptName;
		this.salary = salary;
	}
	public String getSabun() {
		return sabun;
	}
	public void setSabun(String sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	public void printInfo() {
		System.out.print("사번 : " +  sabun +"\t 이름 : " +name+"\t 부서명 : " +deptName +"\t 샐러리 : " +salary);
	}
	
	
	
	
	
}
