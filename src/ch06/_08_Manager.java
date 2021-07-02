package ch06;

public class _08_Manager extends _08_Eployee {

	private int bounus;
	
	public _08_Manager() {
		super();
	}
	
	public _08_Manager(String sabun,String name,String deptName ,int salary , int bounus) {
		//super(sabun,name,deptName,salary);
		super.setSabun(sabun);
		super.setName(name);
		super.setDeptName(deptName);
		super.setSalary(salary);
		this.bounus=bounus;
	}
	
	public int getBounus() {
		return bounus;
	}
	
	public void setBounus(int bounus) {
		this.bounus = bounus;
	}

	public void calBouns() {
		//연봉 : salary * 12 + bonus
		this.printInfo();
		System.out.println("\t 연봉 : "+ (super.getSalary()*12+bounus));
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.print("\t 보너스 : " +bounus);
	}
	
	
	
}
