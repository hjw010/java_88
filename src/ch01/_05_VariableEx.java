package ch01;

public class _05_VariableEx {

	public static void main(String[] args) {

		/*
		 * 상수 : 프로그램이 실행되는 동안, 값이 변하지 않는 수 또는 변경 불가능한 수 final 키워드는 변수에 값이 대입되고 나면, 변수 값이
		 * 더이상 변경되지 않는다. 주로 대문자를 사용 만일 값변경시 상수를 선언한 부분의 값만 변경
		 * 
		 * final
		 * 1_ 변수(상수) : 변수에 값 대입불가
		 * 2_ 메서드: 재정의 불가
		 * 3_ 클레스: 상속 불가
		 */

		final double PI = 3.14; // 상수 선언 및 초기화
		double value = 0.5;

		double result = PI * value;

		System.out.println(result);

		//PI = 3.5; 오류 : 상수는 final로 선언하며, 변경불가
		
		final String MY_NAME = "한진원";
		final int MY_AGE = 31;
		System.out.println("이름 : " + MY_NAME +", 나이 : " + MY_AGE);
	}
}
