package test.test0527_2;

public class AlCar implements Car{

	@Override
	public void drive() {
		System.out.println("AlCar - drive");
	}

	@Override
	public void stop() {
		System.out.println("AlCar - stop");
	}

	@Override
	public void startCar() {
		System.out.println("AlCar - startCar");
	}
	
	@Override
	public void turnOff() {
		System.out.println("AlCar - turnOff");
	}

	@Override
	public void method() {
		System.out.println("AlCar -method");
	}
	
	
	
}
