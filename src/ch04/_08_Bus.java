package ch04;

public class _08_Bus {

	//변수
	int busNumber; //버스 번호
	int passengerCount; //승객 수
	int money; //버스 수입
	//생성자
	public _08_Bus() {
		super();
	}
	public _08_Bus(int busNumber, int passengerCount, int money) {
		super();
		this.busNumber = busNumber;
		this.passengerCount = passengerCount;
		this.money = money;
	}
	
	public _08_Bus(int busNumber) {
		super();
		this.busNumber = busNumber;
	}
	//메서드(버스탐)
	public void take(int money) {
		this.money+=money;
		passengerCount++;//승객 수 증가
	}
	public void showInfo() {
		System.out.println(busNumber +" "+ passengerCount+" "+money);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
