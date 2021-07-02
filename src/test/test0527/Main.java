package test.test0527;

public class Main {
	public static void main(String[] args) {
		
		Car car = new AlCar();
		Car car2 = new ManualCar();
		
		car.run();
		System.out.println();
		car2.run();
	}
}
