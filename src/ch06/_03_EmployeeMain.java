package ch06;

public class _03_EmployeeMain {

	public static void main(String[] args) {

		
		_03_Sawon sawon = new _03_Sawon(5);
		sawon.setSabun("11-22");
		sawon.setName("동구");
		sawon.setDeptName("영업부");
		sawon.setSalary(250);
		sawon.printInfo();
		_03_Manager manager = new _03_Manager();
		manager.printInfo();
	}
}
