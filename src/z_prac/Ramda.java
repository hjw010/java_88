package z_prac;

public interface Ramda {

	void add(int num1 ,int num2);

	public static void main(String[] args) {
		
		Ramda ramda = (int a, int b) -> System.out.println(a+b);
				
			ramda.add(10, 20);
	}
}
