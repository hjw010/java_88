package ch07;

public abstract class _03_Car {
	
	/* 템플릿 메서드
	 * - 메서드 실행순서와 시나리오를 정의하는 것이다.
	 * - 로직 흐름이 이미 정해져 있는 프레임워크에서 많이 사용하는 구현 방법이다.
	 * -final로 선언한 이유는 모든 하위클래스가 공통으로 사용하고, 코드를 변경하면 안되기 때문에 final로 선언함
	 * final 메서드명 : 상송받은 하위 클래스가 부모 메서드를 재정의 할 수 없다.
	 * 
	 * final 
	 * - 변수-> 상수 :변수에 값 대입 불가
	 * - 메서드 ->재정의 불가
	 * - 클레스 ->상속 불가
	 */
	public abstract void drive();
	
	public abstract void stop();
	
	public void turnOn() {
		System.out.println("_03_Car - 시동");
	}
	
	public void turnOff() {
		System.out.println("_03_Car - 시동 끔");
	}
	
	//템플릿 메서드 패턴 
	public final void run() {
		turnOn();
		drive();
		stop();
		turnOff();
	}
}
