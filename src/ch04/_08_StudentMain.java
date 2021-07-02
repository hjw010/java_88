package ch04;

public class _08_StudentMain {

	public static void main(String[] args) {
		
		_08_Student hong = new _08_Student("홍길이" , 2, 5000);
		_08_Bus bus = new _08_Bus(101);
		_08_Subway subway = new _08_Subway(2);
		hong.takeBus(bus);
		hong.takeBus(bus);
		hong.takeSubway(subway);
	
		_08_Bus bus2 = new _08_Bus(201);
		hong.takeBus(bus2);
		
		bus.showInfo();
		bus2.showInfo();
		subway.showInfo();
		hong.showInfo();
		
		
		System.out.println("-------------------------------------");
		_08_Student park = new _08_Student("박돌이" , 1 ,10000);
		_08_Subway subway2 = new _08_Subway();
		park.takeSubway(subway2);
		park.showInfo();
		subway.showInfo();
		
		
		System.out.println("-------------------------------------");
		_08_Student kim = new _08_Student("킴철수쿤" , 1, 15000);
		_08_taxi taxi = new _08_taxi("1577-8000");
		kim.takeTaxi(taxi);
		kim.showInfo();
		taxi.showInfo();
				
	}

}
