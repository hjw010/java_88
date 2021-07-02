package ch06;

public class _03_Sawon extends _03_Employee {

	private int sudang;
	/*
	 * super : 부모의 참조변수
	 * - 하위클래스에서 상위클래스로 접근할 때 사용
	 * 하위클래스는 
	 */
	public _03_Sawon() {
	}
	
	public _03_Sawon(int sudang) {
		this.sudang = sudang;
	}

	public int getSudang() {
		return sudang;
	}
	public void setSudang(int sudang) {
		this.sudang = sudang;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("수당 : " + sudang);
		System.out.println("\n 줄바꿈" +"ㅁㅁㅁ" + "\t 탭" +"ㅁㅁㅁㅁ");
	}
	/*
	 * p250 [면접] 오버로드 vs 오버라이드
	 * @Override 어노테이션 : 컴파일러에게 재정의된 메서드임을 알려주는 역할을함.
	 * 오버라이딩(재정의)
	 * -자식클레스에서 부모클래스의 메서드를 재정의한다.
	 * -상속에서 부모클래스의 메서드를 변경하고자 할때 사용한다.
	 * -메서드 이름, 매개변수, 반환타입까지 모두 동일해야함.
	 * -호출시 오버라이딩한 자식메서드가 호출됨.
	 * 	
	 * 	 */
	
}
