package ch07;

public class _06_SmartPhone extends _06_PDA implements _06_Mobile,_06_MP3 {

	@Override
	public void play() {
		System.out.println("_06_MP3 - play");
	}
	
	@Override
	public void stop() {
		System.out.println("_06_MP3 - stop");
	}
	
	@Override
	public void sendSMS() {
		System.out.println("_06_Mobile - sendSMS");
	}
	
	@Override
	public void receiveSMS() {
		System.out.println("_06_Mobile - receiveSMS");
	}

}
