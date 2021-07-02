package test.test0527_2;

public interface Car {

	void drive();
	void stop();
	void startCar();
	void turnOff();
	
	default void method(){
		System.out.println("default - method");
	}
	static void method2(){
		System.out.println("static - method");
	}
}
