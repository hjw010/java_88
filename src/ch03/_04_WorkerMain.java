package ch03;

public class _04_WorkerMain {

	//setter getter - > DTO(data transfer object)
	public static void main(String[] args) {

		_04_Worker worker = new _04_Worker();
		worker.setSabun("14-71020890");
		worker.setName("노예");
		worker.setSalary(50000);
		
		worker.printInfo();
		
		
		System.out.print("사번 : " +worker.getSabun());
		System.out.print(", 이름 : "+worker.getName());
		System.out.print(", 사번  : "+worker.getSalary()+"원");
	}
}
