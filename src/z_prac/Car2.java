package z_prac;

public class Car2 {

 	static Car2 car2 = new Car2();
	static Car c = Car.getInstance();
	
	void print() {
		System.out.println("Car2");
	}
	
	void method() {
		c.print();
	}
	
	static Car2 getInsTane() {
		return car2;
	}
	
}
