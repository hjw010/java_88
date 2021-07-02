package ch06;

public class _01_Dog extends _01_Animal{

	public _01_Dog() {
		super();
	}

	public _01_Dog(String kind, int legs) {
		super(kind, legs);
	}

	public void bark() {
		System.out.println("멍멍멍");
	}
	
}
