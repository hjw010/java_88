
package ch01;

public class _06_VariableEx {

	public static void main(String[] args) {
		/*
		 *	형변환 p64
		 *	1. 자동 형변환(확대 형변환, 묵시적 형변환)
		 *	 - 데이터 손실되지 않거나, 손실이 제한적인 범위내에서 묵시적으로 형변환한다.
		 *	   자료형이 다른 변수에 값을 할당하는 경우, 형변환을 생략할 수 있다.
		 *	 
		 *	 - 데이터 큰타입 = 데이터 작은타입; (예: float f = 10; // f에 10.0이 대입) float f = (float)10; <-- 불필요 컴파일러가 알아서 붙임
		 *	 - 자료형이 다른 값을 연산하는 경우 (예 double d = 10.0 + 30;)_ 같은 형으로 변환하여(큰타입으로 변환하여 연산함) 연산_double d = 10.0 + 30.0;
		 *
		 *	2. 강제 형변환(축소 형변환, 명시적 형변환)
		 *	 - 명시적으로 형변환하는 것을 캐스팅(Casting)이라고 한다.
		 *	 - Casting은 생략할 수 없으며, 생략시 컴파일 에러가 발생하기 때문에 반드시 명시적으로 형변환 해야한다.
		 *	 - 강제 형변환이므로 데이터 손실 위험 있다.
		 *	 
		 *	 - 데이터 작은 타입 = (작은 타입)데이터 큰타입;
		 */
		
		
		System.out.println("-----형변환-1 예제----");
		//1. 자동 형변환(확대 형변환, 묵시적 형변환)
		double dVal = 20;
		System.out.println("dVal : " +dVal); //20.0
		float fVal = 20.5f + 10; //같은 형으로 형변환(큰타입으로 변환) 후 연산 - 20.5 + 10.0 
		System.out.println("fVal : "+ fVal);
		
		//2. 강제 형변환(축소 형변환, 명시적 형변환)
		int iVal = (int)10.5; // 10.5 < -- double  float은 f 붙임 ex:10.5f
		System.out.println("iVal : " + iVal); //iVal = 10 _ 데이터 손실
		
		/*
		 * 형변환-2.
		 * 3. int(4바이트)보다작은 자료형은 int형으로 형변환 후 계산
		 * 	ex) byte + short -> int + int 
		 * 
		 * 4. 두개의 피연산자중 표현범위가 큰쪽에 맞춰서 형변환후 계산
		 * */
		System.out.println();
		System.out.println("******형변환-2 예제******");
		
		int iVal2;
		double fVal2;
		
		iVal2 = 5/4; // int = int / int; -> int iVal2 = 1; 5.4 = 1.25 -> 1
		System.out.println(iVal2); // iVal = 1
		
		fVal2 = 5/4; // double = int/ int; -> int fVal2 = 1.0;  5/4 = 1.25 -> 1 -> 1.0
		System.out.println(fVal2); // fVal = 1.0
		
		
		//형변환보다 ()안의 계산이 우선
		iVal2 = (int)(2.5 + 3.3); // int iVal2 = (int)(double+ double); // (int)(5.8) -> 5
		System.out.println("iVal2 : " + iVal2);
		
		//각각 형변환 후 연산 2 + 3 
		iVal2 = (int)2.5 +(int)3.3;
		System.out.println(iVal2);
		
		System.out.println("*************************");
		
		int gg = 1000000;
		int jj = 2000000;
		long ll = 2000000L;
		
		int el = gg * jj;
		System.out.println(el); //-1454759936  int형 값의 범위(-21억 ~ +21억 사이 값)를 넘어섰음
		
		long e2 = gg * jj;
		System.out.println(e2); //-1454759936  long형에 대입되기 전부터 연산결과가 int형 범위를 초과
		
		long e3 = (long)(gg * jj);
		System.out.println(e3); //-1454759936  연산 후 형변환이 되기 때문에 역시 데이터 손실이 일어남.
		
		//형변환 2. 4번
		long e4 = (long)gg * jj;
		System.out.println(e4); //2000000000000 long * int - > 큰 타입으로 변환후 연산 :  long * long
		
		
		long e5 = gg * ll;
		System.out.println(e5); //2000000000000 int * long - > 큰 타입으로 변환후 연산 :  long * long
		
		float e6 = 1000000000L; //1.0E9  0이  9개
		System.out.println(e6);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
