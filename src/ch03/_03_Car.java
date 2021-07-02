package ch03;

public class _03_Car {
	
	
	//멤버변수
	private String company;
	private String model;
	private int speed;
	private String color;
	
	
	//기본 생성자 _ 생성자가 한개도 없을때는 생략해도됨.. 컴파일러가 자동으로 붙여줌 
	
	public _03_Car(){

	}
	
	//매개변수 초기화
	public _03_Car(String company, String model,int speed, String color) {
		this.company = company;
		this.model  = model;
		this.speed = speed;
		this.color = color;
	}
	
	//setter -값 설정
	// String company = "현대자동차";
	public void setCompany(String company) {//매개변수
		this.company = company;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	//멤버메서드
	public void showInfo() {
		System.out.println(company + ", " +model + ", " +speed + ", " + color);
	}
	
}
