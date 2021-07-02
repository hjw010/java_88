package ch07;

public class _02_CompleteCalc extends _02_Calc {

	@Override
	public void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	@Override
	public void sub(int num1, int num2) {
		if(num1>=num2) {
			System.out.println(num1-num2);
		}else {
			System.out.println(num2-num1);
		}
	}
	
	@Override
	public void mul(int num1, int num2) {
		System.out.println(num1*num2);
	}
	
	@Override
	public void div(int num1, int num2) {
		if(num1 >= num2) {
			System.out.println(num1/num2);
		}else {
			System.out.println(num2/num1);
		}
	}

	
}
