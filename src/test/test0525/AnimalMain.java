package test.test0525;

public class AnimalMain {
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.move(new Tiger());
		animal.move(new Egle());
		animal.move(new Human());
	}
}
