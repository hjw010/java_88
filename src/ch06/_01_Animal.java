package ch06;

public class _01_Animal {

	private String kind;
	private int legs;
	
	public _01_Animal() {}

	public _01_Animal(String kind, int legs) {
		super();
		this.kind = kind;
		this.legs = legs;
	}

	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public void printInfo() {
		System.out.println("종 : " + kind + ", 다리 갯수 : " + legs);
	}
	public void eat() {
		System.out.println("먹다");
	}
	public void sleep() {
		System.out.println("자다");
	}
	public void play() {
		System.out.println("놀다");
	}
	
}
