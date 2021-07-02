package test.test0526;
public class Sawon extends Employee{
	
	private int sudang;
	
	
	public Sawon(String sabun, String name, String deptName, int salary){
		super(sabun, name, deptName, salary);
	}

	public void receiveSudang(){
		if(super.getDeptName().equals("기획실")){
			sudang = (int)(super.getSalary()*0.05); 
		}else if(super.getDeptName().equals("전산실")){
			sudang = (int)(super.getSalary()*0.1); 
		}else if(super.getDeptName().equals("영업부")){
			sudang = (int)(super.getSalary()*0.15);
		}
	}

	public void printInfo(){
		super.printInfo();
		System.out.println(", 수당 : " +sudang);
	}
}