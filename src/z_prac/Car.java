package z_prac;

public class Car {
	
	static Car car = new Car();
	static Car2 car2 =Car2.getInsTane();

	void print() {
		System.out.println("Car - print");
	}
	void method() {
		car2.print();
	}
	
	static Car getInstance() {
		return car;
	}
}
