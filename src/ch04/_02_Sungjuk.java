package ch04;

public class _02_Sungjuk {

	private int korScore;
	private int engScore;
	private int mathScore;
	
	/*
	 * 기본생성자 p 153
	 * 생성자는 클래스를 생성할 때만 호출
	 * 생성자 이름은 클래스 이름과 같고, 생성자는 반환값이 없다
	 * 기본생성자는 컴파일할때 컴파일러가 자동으로 생성자를 만든다.
	 * 하지만 매개변수 생성자가 존재하면 컴파일러가 기본생성자를 자동으로 만들지 않는다.
	 */
	
	public _02_Sungjuk() {}
	public _02_Sungjuk(int korScore, int enghScore, int mathScore) {
		this.korScore = korScore;
		this.engScore = enghScore;
		this.mathScore = mathScore;
	}
	
	//setter로 값 설정

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	public void setEnghScore(int enghScore) {
		this.engScore = enghScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	//getTotal() 3과목 합계
	public int getTotal() {
		return korScore + engScore + mathScore;
	}
	
	//getAvg() 3과목 평균
	public int getAvg() {
		return getTotal()/3;
	}
	
	
	
	
	
	
	
	
	
	
}
