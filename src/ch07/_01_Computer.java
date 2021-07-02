package ch07;
// - 추상클레스
public abstract class _01_Computer {
	
	//추성메서드
	public abstract void disPlay();
	public abstract void typing();
	//일반메서드
	public void turnOn() {
		System.out.println("Computer - turnOn()");
	}
	public void turnOff() {
		System.out.println("Computer - turnOff()");
	}
	
}
