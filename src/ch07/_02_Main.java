package ch07;

import java.util.Scanner;

public class _02_Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//추상클레스 인스턴스 생성불가 Cannot instantiate the type _02_Calc
		//_02_Calc calc = new _02_Calc();
		//다형성
		_02_Calc calc = new _02_CompleteCalc();
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		//call by value
		//재정의된 자식메서드 호출
		calc.add(num1, num2);
		calc.sub(num1, num2);
		calc.mul(num1, num2);
		calc.div(num1, num2);
		scanner.close();
	}
}
