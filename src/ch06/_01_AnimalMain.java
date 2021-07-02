package ch06;

import java.util.Scanner;

public class _01_AnimalMain {

	public static void main(String[] args) {
		_01_Dog dog = new _01_Dog("믹스",4);
		_01_Cat cat = new _01_Cat("길고양이",4);
		dog.bark();
		dog.eat();
		dog.sleep();
		dog.play();
		dog.printInfo();
		System.out.println();
		cat.cry();
		cat.eat();
		cat.sleep();
		cat.play();
		cat.printInfo();
		
		
		
		
	}
}
