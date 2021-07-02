package ch08;

/*
 * 마커 인터페이스 : 구현할 메서드가 없는 인터페이스
 * Cloneable  : 객체를 복제할때 사용하는 인터페이스
 */
public class _05_Circle implements Cloneable {

	private _05_Point point;
	private int radius;
	
	
	public _05_Circle(int x, int y ,int radius) {
		point = new _05_Point(x,y);
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "원점 " + point +" 이고" + " 반지름은 : " + radius + " 입니다";
	}
	
	/*
	 * 복제 메서드
	 * CloneNotSupportedException : 클래스의 clone() 메서드가 지원되지 않았을 경우의 예외 클레스
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException { 
		return super.clone();
	}
	

}
