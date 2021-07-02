package ch07;

import java.util.Scanner;

public class _04_Main {

	public static void main(String[] args) {

		
		_04_Calc calc = new _04_CompleteCalc();
		int result;
		result = calc.add(10, 20);
		System.out.println(result);
		result = calc.sub(30, 10);
		System.out.println(result);
		result = calc.divide(30, 15);
		System.out.println(result);
		result = calc.times(7, 4);
		System.out.println(result);
		
		if(calc instanceof _04_CompleteCalc) {
			_04_CompleteCalc completeCalc = (_04_CompleteCalc)calc;
			completeCalc.showInfo();
		}
		
		
		
	}

}
