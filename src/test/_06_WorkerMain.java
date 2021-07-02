package test;
public class _06_WorkerMain {
	
	public static void main(String[] s){
					
		_06_Worker worker = new _06_Worker();
		worker.setSabun(1471020890);
		worker.setName("한진원");
		worker.setAge(31);
		worker.showInfo();

		_06_Worker worker2 = new _06_Worker(1571020890, "김진원", 28);
		worker2.showInfo();
	}
	
}