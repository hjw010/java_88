package ch08;

public class _07_StringTest2 {

	/*
	 * // value 변수 : private final char[] value => final이므로 한번 생성된 문자열은 변경되지 않는다. //
	 * 따라서 값이 변경되거나 추가시 새로운 문자열이 생성된다.
	 */	
	public static void main(String[] args) {
	
		String str1 ="Java";
		String str2 ="Android";
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));

		System.out.println();
		System.out.println();

		str1 = str1.concat(str2);
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));

		System.out.println();
		System.out.println();
		
		String str3 = new String("C++");
		String str4 = new String("Oracle");
		System.out.println(str3);
		System.out.println(System.identityHashCode(str3));

		System.out.println();
		System.out.println();

		str3 = str3.concat(str4);
		System.out.println(str3);
		System.out.println(System.identityHashCode(str3));
		
		
		
	}
}
