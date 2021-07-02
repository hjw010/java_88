package ch06;

public class _02_CarMain {

	public static void main(String[] args) {

		_02_FireCar fire = new _02_FireCar();
		fire.setKind("소방차");
		fire.setSpeed(200);
		fire.water();
		fire.carInfo();
		System.out.println();

		_02_PoliceCar police = new _02_PoliceCar();
		//police.kind="삐용삐용차";
		//police.speed=350;
		police.siren();
		police.carInfo();
		
		
	}

}
