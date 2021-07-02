package ch06;

public class _04_Manager extends _04_Eployee {

	private int bounus;
	
	public _04_Manager() {
		super();
	}
	
	public _04_Manager(String sabun,String name,String deptName ,int salary , int bounus) {
		//super(sabun,name,deptName,salary);
		super.setSabun(sabun);
		super.setName(name);
		super.setDeptName(deptName);
		super.setSalary(salary);
		this.bounus=bounus;
		System.out.println("보너스의 매개변수 생성자");
	}
	
	public int getBounus() {
		return bounus;
	}
	
	public void setBounus(int bounus) {
		this.bounus = bounus;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("\t 보너스 : " +bounus);
	}
	
	
	
}
