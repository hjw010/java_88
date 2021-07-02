package test.test0527_2;

public class ManualCar implements Car {

	@Override
	public void drive() {
		System.out.println("ManualCar - drive");
	}

	@Override
	public void stop() {
		System.out.println("ManualCar - stop");
	}

	@Override
	public void startCar() {
		System.out.println("ManualCar - startCar");
	}
	
	@Override
	public void turnOff() {
		System.out.println("ManualCar - turnOff");
	}
	
}
