package ch08;

import java.util.HashMap;

public class _01_Main {

	public static void main(String[] args) {
		/*
		    * 모든 클래스의 최상위 클래스 Object
		    * toString() 메서드가 재정의 안되어있다.
		    * 컴파일과정에서 Extends Object가 자동으로 추가되고, Object의 toString() 메서드가 호출되었다.
		    * Object의 toString() : 패키지명.클래스명@해시코드값 => 주소값  예) ch08._01_Book@7852e922
		    * 재정의해서 객체 정보를 문자열로 반환해서 사용해야 원하는 정보를 출력할 수 있다.
		    */
		
		_02_Student stu1 = new _02_Student(1,"임");
		_02_Student stu2 = new _02_Student(1,"임");
		
		if(stu1.equals(stu2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
			
		}
		
		if(stu1==stu2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		
		
		
		
	}
}
	

