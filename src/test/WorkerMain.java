package test;

public class WorkerMain {

	public static void main(String[] args) {
		
		Worker worker = new Worker("봉식이",85000);
		EltronicShop eShop = new EltronicShop("삼성전자");
		Emart emart = new Emart("게살버거");
		worker.buyNoteBook(eShop);
		worker.buyNoteBook(eShop);
		worker.takeoutStake(emart);
		worker.takeoutStake(emart);
		worker.takeoutStake(emart);
		worker.takeoutStake(emart);
		worker.printWorkerInfo();
		eShop.printShopInfo();
		emart.pirntInfo();
		
		
	}
}
