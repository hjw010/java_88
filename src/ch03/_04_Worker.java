package ch03;

public class _04_Worker {

	//멤버 변수 - 속성
	private String sabun;
	private String name;
	private int salary;
	
	//setter
	//멤버메서드  메인에서 값을 받아 멤버변수에 설정
	//1. main에서 값 전달 -> 2.매개변수 - > 멤버변수
	public void setSabun(String sabun) {
		this.sabun =sabun;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	//getter -멤버변수의 값을 반환
	public String getSabun() {
		return sabun;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	
	//메서드 - 출력
	public void printInfo() {
		System.out.println("사번 : " + getSabun() +", 이름 : " +getName()
		 					+", 월급 : " + getSalary() +"원");
	}
	
	
}
