package test.test0526;
public class Employee{

	private String sabun;
	private String name;
	private String deptName;
	private int salary;

	public Employee(){}

	public Employee(String sabun,String name,String deptName, int salary){
		this.sabun = sabun;
		this.name = name;
		this.deptName = deptName;
		this.salary = salary;
	}
	
	public void setSabun(String sabun){
		this.sabun =sabun;
	}
	public void setName(String name){
		this.name =name;
	}
	public void setDeptName(String deptName){
		this.deptName =deptName;
	}
	public void setSalary(int salary){
		this.salary = salary;
	}

	public String getSabun(){
		return sabun;
	}
	public String getName(){
		return name;
	}
	public String getDeptName(){
		return deptName;
	}
	public int getSalary(){
		return salary;
	}

	public void printInfo(){
		System.out.print("사번 : " + sabun + ", 이름 : " +name +", 부서명 : " +deptName + ", 월급 : " + salary);
	}



}