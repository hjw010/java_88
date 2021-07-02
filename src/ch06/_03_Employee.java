package ch06;

public class _03_Employee {

	private String sabun;
	private String name;
	private String deptName;
	private int salary;
	
	public _03_Employee() {
	}
	public _03_Employee(String sabun, String name, String deptName, int salary) {
		super();
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
		System.out.print("사번 : " + sabun + ", 이름 : " + name 
						+", 부서 : " + deptName + ", 임금 : " + salary+", ");
		
	}
	
	
	
}
