package ch06;

//부모
public class _07_Animal {

	
	public void move() {
		System.out.println("동물이 움직인다");
	}
	
	
	public void moveAnimal(_07_Animal animal) {
		animal.move();
		if(animal instanceof _07_Human) {
			_07_Human human = (_07_Human)animal;
			human.readBook();
		}else if(animal instanceof _07_Egle) {
			_07_Egle egle = (_07_Egle)animal;
			egle.hunt();
		}else if(animal instanceof _07_Tiger) {
			_07_Tiger tiger = (_07_Tiger)animal;
			tiger.bite();
		}
	}
}
