package test.test0526;
public class Main{

	public static void main(String[] s){
		printInfo(new Manager("111","한진원","전산실",250));	
		printInfo(new Sawon ("222","강민정","영업부",230));	
	}

	public static void printInfo(Employee emp){
		if(emp instanceof Sawon){
		Sawon sawon = (Sawon)emp;
		sawon.receiveSudang();
		sawon.printInfo();
		}else{
		Manager manager = (Manager)emp;
		manager.receiveBonus();
		manager.printInfo();
		}


	}
}