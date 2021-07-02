package test.test0602;

public class InvalidNameException extends Exception {

	private String wrongName;
	
	public InvalidNameException(String message) {
		super(message);
	}

	public String getWrongName() {
		return wrongName;
	}
	public void setWrongName(String wrongName) {
		this.wrongName = wrongName;
	}
	
	public void showWrongName() {
		System.out.println("잘못된 입력된 이름 : " + wrongName);
	}
	
}
