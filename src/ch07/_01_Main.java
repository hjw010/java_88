package ch07;

public class _01_Main {
	/*
     * 추상이란?
     * - 여러가지 사물이나 개념으로부터 공통이 되는 특성을 파악하는 것을 말한다.
     * 
     * [면접]
     * 1. 추상클래스 => 작업명세서
     * - 하나 이상의 추상메서드를 가지고 있는 클래스를 의미한다.
     * - abstract 키워드를 이용하여 구현되지 않는 추상메서드를 기술할 수 있다.
     * - 자식클래스에게 구현을 위임하고자 할 때 사용되며, 프로그램의 확장성을 취해 많이 사용하는 설계방법이다.
     * - 추상클래스는 일반메서드, 추상메서드 모두 올 수 있다.
     * - 전제조건은 반드시 상속을 해야 한다.
     * - 다형성 적용 가능하다.
     * 
     * - 문법 : public abstract class 클래스명 {
     *             public abstract 반환형 메서드명();  // 추상메서드
     *       }
     * 
     * 2. 추상메서드
     * - 하위클래스가 어떤 클래스냐에 따라 구현코드가 달라지며, 하위클래스에 구현을 위임하는 것이다.
     * - 미완성되어있는 메서드이며, 몸체가 없는 메서드로서 항상 세미콜론(;)으로 종료되어야 한다.
     * 
     *  3. 추상클래스의 상속
     *  - 추상클래스를 상속받은 자식클래스는 추상메서드를 반드시 재정의(Override) 해야 하며,
     *    재정의하지 않으면 컴파일 오류가 발생한다.
     *  - 자식클래스에게 강제성과 통일성을 줄 수 있다.(협업시 작업명세서)  
     *       
     * 4. 추상클래스의 객체 생성
     * - 추상클래스는 객체를 생성할 수 없으며(추상 메서드 때문), 상속 계층에서
     *   추상적인 개념을 나타내기 위한 용도로 사용한다.
     * - 상속을 통하여 자식클래스에서 추상메서드를 구현하고, 자식클래스 객체를 생성하여 메서드를 접근할 수 있다.  
     * 
     */

	public static void main(String[] args) {
		_01_Computer computer = new _01_DeskTop();
		//구현 클레스에서 재정의한 메서드 호출
		computer.disPlay();
		computer.typing();
		computer.turnOn();
		computer.turnOff();
		System.out.println("```````````````````````````");
		
		_01_Computer computer2 = new _01_MyNoteBook();
		computer2.disPlay();
		computer2.typing();
		computer2.turnOn();
		computer2.turnOff();
		
		// 추상클레스는 인스턴스 생성 불가
		//_01_Computer computer =new _01_Computer();
		
		// ↓이런식으로 매소드를 재정의해주면서 객체를생성하면됨
		/*
		_01_Computer computer =new _01_Computer() {
			@Override
			public void typing() {
				System.out.println("타이핑");
			}
			@Override
			public void disPlay() {
				System.out.println("디스플레이");
			}
		};
		computer.typing();
		computer.disPlay();
		*/
	}

}
