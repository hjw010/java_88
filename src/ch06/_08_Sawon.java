package ch06;

public class _08_Sawon extends _08_Eployee{

	private int sudang;

	public _08_Sawon() {
	}
	public _08_Sawon(int sudang) {
		this.sudang =sudang;
	}

	public _08_Sawon(String sabun, String name, String deptName, int salary, int sudang) {
		super(sabun , name , deptName , salary);
		this.sudang =sudang;
	}

	public int getSudang() {
		return sudang;
	}
	public void setSudang(int sudang) {
		this.sudang = sudang;
	}
	
	
	public void calSudang() {
		//연봉 : salary * 12 + sudang;
		this.printInfo();
		System.out.print("\t 연봉 : "+(super.getSalary() * 12 + sudang));
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.print("\t 수당 : "+ sudang);
	}
	

}
