package ch07;

public class _06_Main {

	public static void main(String[] args) {
		
		_06_Mobile mobile = new _06_SmartPhone();
		_06_MP3 mp3 = new _06_SmartPhone();
		_06_PDA pda = new _06_SmartPhone();
		
		mobile.sendSMS();
		mobile.receiveSMS();
		mp3.play();
		mp3.stop();
		System.out.println("x + y = "+pda.calculate(5, 4));
		
		
	}
}
