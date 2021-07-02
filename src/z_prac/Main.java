package z_prac;


public class Main {

	public void method() {
		
		System.out.println(Outter.i);
		
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		m.method();
		
	}
}
