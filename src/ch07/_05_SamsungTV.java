package ch07;

public class _05_SamsungTV implements _05_Tv{
	@Override
	public void trunOn() {
		System.out.println(_05_Tv.BRAND + "tv를 켜다");
	}
	@Override
	public void trunOff() {
		System.out.println(_05_Tv.BRAND + "tv를 끄다");
	}

	
	
	
}
