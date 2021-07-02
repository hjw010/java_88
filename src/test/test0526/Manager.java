package test.test0526;
public class Manager extends Employee{
	private int bonus;
	
	public Manager(String sabun, String name, String deptName, int salary){
		super(sabun, name, deptName, salary);
	}

	public void receiveBonus(){
		if(super.getDeptName().equals("기획실")){
			bonus = (int)(super.getSalary()*0.05); 
		}else if(super.getDeptName().equals("전산실")){
			bonus = (int)(super.getSalary()*0.1); 
		}else if(super.getDeptName().equals("영업부")){
			bonus = (int)(super.getSalary()*0.15);
		}
	}

	public void printInfo(){
		super.printInfo();
		System.out.println(", 보너스 : " +bonus);
	}
}