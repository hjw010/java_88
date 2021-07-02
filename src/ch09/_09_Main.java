package ch09;

public class _09_Main {

	/*
	 * [면접]
	 * 제네릭 : 여러 참조 자료형이 쓰일 수 있는 곳에 특정한 자료형을 지정하지않고
	 * 			제네릭 클레스의 인스턴스 생성시점에 어떤 자료형을 사용할 것인지 지정하는 방식
	 * 			T의 자료형이 결정되는 시점보다 빨리 생성되는 static맴버에서는 사용 못함.
	 * 			T : type
	 * 			E : element
	 * 			K : key
	 * 			V : value
	 * 
	 *  - 제네릭으로 구현하면 형변환을 하지 않아도됨(매개변수 다형성, 다운캐스팅을 안해도 된다.)
	 *  -> 제네릭 클래스를 사용하면 컴파일러는 일단 대입된 자료형이 잘 쓰였는지 확인.
	 *  	class 파일을 생성할때 T를 사용한 곳에 지정된 자료형에 따라 컴파일하므로
	 */
	
	public static void main(String[] args) {
		
		_09_GenericPrinter<_09_Powder> powderPrinter = new _09_GenericPrinter<_09_Powder>();
		powderPrinter.setMeterial(new _09_Powder());
		_09_Powder powder = powderPrinter.getMeterial();
		powder.doPrinting();
		System.out.println(powderPrinter);
		
		System.out.println();
		System.out.println();

		_09_GenericPrinter<_09_Plastic> plasticPrinter = new _09_GenericPrinter<_09_Plastic>();
		plasticPrinter.setMeterial(new _09_Plastic());
		_09_Plastic plastic = plasticPrinter.getMeterial();
		plastic.doPrinting();
		System.out.println(plasticPrinter);
		
	}
}
