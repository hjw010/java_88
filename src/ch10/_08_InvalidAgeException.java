package ch10;

//사용자 정의 Exception
public class _08_InvalidAgeException extends Exception{

	private int wrongAge;
	
	public _08_InvalidAgeException() {
	}
	
	public _08_InvalidAgeException(String message) {
		super(message);
	}

	
	public int getWrongAge() {
		return wrongAge;
	}
	
	public void setWrongAge(int wrongAge) {
		this.wrongAge = wrongAge;
	}
	
	public void showWrongAge() {
		System.out.println("잘못 입력된 나이 : " + wrongAge);
	}
	
	
}
