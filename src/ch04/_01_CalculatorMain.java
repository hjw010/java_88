package ch04;

public class _01_CalculatorMain {

	public static void main(String[] args) {

		double num1 = 10.0;
		double num2 = 5.0;
		_01_Calculator cal = new _01_Calculator();
		
		double addR = cal.add(num1, num2);
		double subR = cal.sub(num1, num2);
		double mulR = cal.mul(num1, num2);
		double divR = cal.div(num1, num2);
		
		System.out.println("num1 + num2 = " + addR);
		System.out.println("num1 - num2 = " + subR);
		System.out.println("num1 * num2 = " + mulR);
		System.out.println("num1 / num2 = " + divR);
	}

}
