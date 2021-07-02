package ch08;

public class _06_StringTest1 {
/*
 * 370 p
  // str1, str2는 동적메모리 공간인 힙메모리 주소이다.
   // String, Integer 클래스는 equals(), hashCode()가 미리 재정의되어있다.
 */
	public static void main(String[] args) {
		
		String str ="김동자";
		String str2 ="김동자";
		
		
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str2));
	
		if(str == str2 && str.equals(str2)) {
			System.out.println("true");
		}
		
		String str3 = "옥동자";
		String str4 = "김동기";
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		int i = 35;
		int i2 = 35;
		System.out.println(System.identityHashCode(i));
		System.out.println(System.identityHashCode(i2));
	
		char ch ='a';
		
		char ch2 = 'a';
		
		System.out.println(System.identityHashCode(ch));
		System.out.println(System.identityHashCode(ch2));
		
		
	}
	
}
