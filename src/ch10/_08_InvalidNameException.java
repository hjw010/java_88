package ch10;

public class _08_InvalidNameException extends Exception {

	//private static _08_InvalidNameException iName = new _08_InvalidNameException("아이디는 두글자 이상이여야 합니다.");
	
	private String wrongName;

	public _08_InvalidNameException() {
		super();
	}

	public _08_InvalidNameException(String message) {
		super(message);
	}
	
	public _08_InvalidNameException(String message, String wrongName) {
		super(message);
		this.wrongName = wrongName;
	}
	

	public String getWrongName() {
		return wrongName;
	}

	public void setWrongName(String wrongName) {
		this.wrongName = wrongName;
	}
	
	public void showWrongName() {
		System.out.println("잘못 입력된 이름 : " + wrongName);
	}

	/*
	public static _08_InvalidNameException getInstance() {
		return iName;
	}
	*/
	
	
}
