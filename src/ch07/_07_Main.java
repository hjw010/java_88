package ch07;

public class _07_Main {

	public static void main(String[] args) {
		_07_AppCDInfo appCDInfo = new _07_AppCDInfo("1","노인과 바다","","");
		appCDInfo.checkOut("홍길동","2020-11-26");
		appCDInfo.checkOut("홍길동","2020-11-27");
		appCDInfo.checkIn();
		appCDInfo.checkIn();
	}
}
