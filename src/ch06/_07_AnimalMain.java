package ch06;

public class _07_AnimalMain {

	public static void main(String[] args) {
		_07_Animal animal = new _07_Animal();
		animal.move();
		
		_07_Human human =new _07_Human();
		human.move();
		human.readBook();
		
		System.out.println("----------다형성-------------");
		_07_Animal hAnimal = new _07_Human();
		hAnimal.move();
		if(hAnimal instanceof _07_Human) {
			human = (_07_Human)hAnimal;
			human.readBook();
		}
		
		_07_Animal eAnimal = new _07_Egle();
		eAnimal.move();
		if(eAnimal instanceof _07_Egle) {
			 _07_Egle egle = (_07_Egle)eAnimal;
			egle.hunt();
		}
		
		_07_Animal tAnimal = new _07_Tiger();
		tAnimal.move();
		if(tAnimal instanceof _07_Tiger) {
			_07_Tiger tiger = (_07_Tiger)tAnimal;
			tiger.bite();
		}
		
		
		
 	}
	

}
