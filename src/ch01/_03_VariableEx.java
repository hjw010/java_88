package ch01;

public class _03_VariableEx {

	public static void main(String[] args) {
		/*
		 * 메서드 명, 변수명은 소문자/ 클레스는 대문자로 시작 변수 : 프로그래밍에서 값(Data)을 저장하기 위한 공간 데이터의 저장과 참조를
		 * 위해 메모리 공간을 할당받는다. 컴파일러는 변수의 자료형에 맞는 기억공간을 미리 확보 ex)int = 4byte. 선언 : 변수명 ex)
		 * int age; 선언과 동시에 초기화 : 자료형 변수명 = 초기화 ex)int age = 10;
		 * 
		 * [면접 문제] 1.기본 자료형(primitive type)
		 * 정수형 : byte(1바이트) -> short(2바이트)-> int(4바이트) -> long(8byte)
		 * 실수형 : float(4바이트) -> double(8바이트)
		 * 문자형 : char(2바이트) 
		 * 부울형 : boolean(true/false) true = 1 false = 0 (1바이트)
		 * 
		 * 2.참조형(reference type) : 실제 객체를 가리키는 주소값이 저장되는 공간 -> 참조변수의 자료형 - 클래스, 인터페이스,배열
		 *
		 * 
		 * 3.문자열 : String 클래스
		 */

		System.out.println("=======정수형 변수 ========");
//		int num1;  //선언
//		num1 = 10;	//초기화
		int num1 = 10; // 선언과 동시에 초기화
		long num2 = 123333333333L; // long형은 숫자뒤에 L이나 l을 붙임.
		System.out.println(num1);
		System.out.println(num2);

		System.out.println("======실수형=======");
		float fnum1 = 3.14F; // float형은 숫자뒤에 F나 f를 붙임.
		double dnum1 = 3.14; // double형은 기본형이며, 숫자뒤 기호 생략
		System.out.println(fnum1);
		System.out.println(dnum1);

		System.out.println("======char형=======");
		char ch1 = ' '; // char형은 ' '초기화시 공백이 있어야함.
		ch1 = 'A'; // ch1 A로 초기화
		System.out.println(ch1);

		System.out.println("======문자열=======");
		String name = ""; // String형은 "" 초기화시 공백없어도 됨
		name = "감스트"; // String은 클래스이므로 대문자로 시작(자바에서 만든 예약어)
		System.out.println(name);

		System.out.println("======부울형=======");
		boolean isMarried = true; // 참 - 1
		boolean isStudent = false; // 거짓 - 0
		System.out.println(isMarried);
		System.out.println(isStudent);

	}

}
