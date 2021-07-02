package test.test0525;

public class Animal {
	
	public void move(Animal animal) {
		if(animal instanceof Human) {
			 Human human = (Human)animal;
			 human.thinking();
		}else if(animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;
			tiger.hunting();
		}else {
			Egle egle = (Egle)animal;
			egle.flying();
		}
	}
	
}
