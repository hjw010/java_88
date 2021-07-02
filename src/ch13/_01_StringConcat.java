package ch13;

// p465
// @FunctionalInterface 함수형 인터페이스의 의미
// -> 하나의 메서드만 선언가능(익명함수를 구현해야하기때문에)하므로 실수로 하나 이상 선언시 컴파일러에게 오류를 발생시키도록한다.
@FunctionalInterface  
public interface _01_StringConcat {

	void makeString(String s1 , String s2,String s3);
	
}
