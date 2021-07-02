package ch07;

public interface _04_Calc {

	
	//public static final double PI =3.14;
	//public static final 생략 - 컴파일러가 알아서 추가함 
	double PI = 3.14;
	int ERROR = -999999;
	
	//추상메서드
	//public abstract int add(int num1, int num2);
	//public abstract 생략 - 컴파일러가 알아서 추가해줌
	int add(int num1, int num2); 
	int sub(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	//자바 8부터 디폴트메서드, 정적 메서드를 구현할 수 있다.
	//자바 9부터 private 메서드를 구현할 수 있다.
	
	
}
