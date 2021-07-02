package ch06;

public class _02_Car {

	private String kind;
	private int speed;
	
	public _02_Car() {}
	public _02_Car(String kind, int speed) {
		super();
		this.kind = kind;
		this.speed = speed;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void carInfo() {
		System.out.println("차종 : " +kind + ", 최대 속력 : " +speed);
	}
	
	
}
