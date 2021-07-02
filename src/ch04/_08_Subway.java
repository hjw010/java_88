package ch04;

public class _08_Subway {
		
		//변수
		int lineNumber; //지하철 노선
		int passengerCount; //승객 수
		int money; //지하철 수입
		//생성자
		public _08_Subway() {
			super();
		}
		public _08_Subway(int lineNumber, int passengerCount, int money) {
			super();
			this.lineNumber = lineNumber;
			this.passengerCount = passengerCount;
			this.money = money;
		}
		
		
		public _08_Subway(int lineNumber) {
			super();
			this.lineNumber = lineNumber;
		}
		
		//메서드(전철탐)
		public void take(int money) {
			this.money+=money;
			passengerCount++;//승객 수 증가
		}
		public void showInfo() {
			System.out.println("전철 넘버 : "+ lineNumber + ", 승객수 : " + passengerCount+", 전철 누적 금액 : "+money);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
