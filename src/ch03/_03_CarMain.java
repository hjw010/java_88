package ch03;

public class _03_CarMain {

	//main()메서드는 자바가상머신(JVM)이 프로그램을 사용하기 위해 호출하는 함수
	//static - 인ㅅ턴스 생성하지 않고 바로 사용 가능
	public static void main(String[] args) {
		
		_03_Car car1 = new _03_Car();
		
//		car1.company="현대";
//		car1.model="아반떼";
//		car1.speed = 200;
//		car1.color ="black";
		car1.setCompany("현대");
		car1.setModel("그렌저");
		car1.setSpeed(300);
		car1.setColor("white");
		car1.showInfo();

		System.out.println("------------------------------------------------------");
		_03_Car car2 = new _03_Car("기아","k5",250,"black");
		car2.showInfo();
		
		
		
		
	}

}
