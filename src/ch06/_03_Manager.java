package ch06;

public class _03_Manager extends _03_Employee{

	int bonus;
	public _03_Manager() {
	}
	public _03_Manager(int bonus) {
		super();
		this.bonus = bonus;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("보너스 : " + bonus);
		
	}
	
}
