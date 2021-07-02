package ch06;

public class _06_AnimalMain {

	public static void main(String[] args) {
		_06_AnimalMain main = new _06_AnimalMain();
		main.moveAnimal(new _06_Animal());
		main.moveAnimal(new _06_Human());
		main.moveAnimal(new _06_Egle());
		main.moveAnimal(new _06_Tiger());
 	}
	public void moveAnimal(_06_Animal animal) {
		animal.move();
		if(animal instanceof _06_Human) {
			_06_Human human = (_06_Human)animal;
			human.readBook();
		}else if(animal instanceof _06_Egle) {
			_06_Egle egle = (_06_Egle)animal;
			egle.hunt();
		}else if(animal instanceof _06_Tiger) {
			_06_Tiger tiger = (_06_Tiger)animal;
			tiger.bite();
		}
	}

}
