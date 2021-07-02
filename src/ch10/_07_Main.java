package ch10;

public class _07_Main {

	public String userId;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) throws _07_IdFormatException {
		if(userId == null) {
			throw new _07_IdFormatException("아이다는 null일 수 없습니다.");
		}else if(userId.length() < 8 || userId.length() > 20 ) {
			throw new _07_IdFormatException("아이디는 8~20글자 사이로 입력하세요");
		}else {
			this.userId = userId;
			System.out.println("아이디 : " + userId);
		}
	}

	public static void main(String[] args) {
		_07_Main main = new _07_Main();
		
		try {
			main.setUserId(null);
		} catch (_07_IdFormatException e) {
			System.out.println(e.getMessage());
			System.out.println("아이디 : " + main.userId);
		}
		
		System.out.println("========================");
		
		try {
			main.setUserId("aaaaaaaaaa");
		} catch (_07_IdFormatException e) {
			System.out.println(e.getMessage());
			System.out.println("잘못된 아이디 : " + main.userId);
		}
	
		
		
	}
	
}
