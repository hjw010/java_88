package ch06;

public class _04_Sawon extends _04_Eployee{

	private int sudang;

	public _04_Sawon() {
		System.out.println("자식 디폴트 생성자");
	}
	public _04_Sawon(int sudang) {
		this.sudang =sudang;
		System.out.println("자식 매개변수 생성자");
	}

	public _04_Sawon(String sabun, String name, String deptName, int salary, int sudang) {
		super(sabun , name , deptName , salary);
		this.sudang =sudang;
		System.out.println("자식 매개변수 생성자");
	}

	public int getSudang() {
		return sudang;
	}
	public void setSudang(int sudang) {
		this.sudang = sudang;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("\t 수당 : "+ sudang);
	}
	

}
