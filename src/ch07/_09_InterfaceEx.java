package ch07;

public class _09_InterfaceEx {

	public static void main(String[] args) {
		A09 a09 = new A09();
		I09 i09 = new B09();
		a09.autoPlay(i09);
	}
}

class A09{
	public void autoPlay(I09 i09) {
		i09.play();
	}
}

interface I09{
	void play();
}

class B09 implements I09{
	@Override
	public void play() {
		System.out.println("B09-play()");
	}
}
