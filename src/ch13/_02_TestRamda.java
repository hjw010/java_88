package ch13;
//470


interface _02_PrintString{
	void showString(String str);
}

public class _02_TestRamda {
	public static void main(String[] args) {

		_02_PrintString lamdaStr = s -> System.out.println(s);
		lamdaStr.showString("hello ramda1");
		
		
		showPrintString(lamdaStr); //메서드의 매개변수로 람다식을 대입한 변수(lamdaStr)전달
		
	}
	
	public static void showPrintString(_02_PrintString p) {
		p.showString("hello ramda2");
	}
	
}
