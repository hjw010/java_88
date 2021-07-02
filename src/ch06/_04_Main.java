package ch06;

public class _04_Main {

	public static void main(String[] args) {
		
		System.out.println("사원------------------------------------------");
		_04_Sawon sawon = new _04_Sawon();
		_04_Sawon sawon2 = new _04_Sawon(10000);
		_04_Sawon sawon3 = new _04_Sawon("111-2","한진원","영업부",2000000,50000);
		sawon2.printInfo();
		sawon3.printInfo();
		
		System.out.println();
		System.out.println("매니저------------------------------------------");
		_04_Manager manager = new _04_Manager("333-4","한가을","기술부",2800000,280000);
		manager.printInfo();
	
		
	}
}
