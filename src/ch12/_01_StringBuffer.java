package ch12;

public class _01_StringBuffer {

	public static void main(String[] args) {
		
		/*
		 * StringBuffer : 문자열을 추가하거나 변경할 때 주로 사용하는 자료형.
		 * - 추가 : append()
		 * - 삽입 : insert(시작위치, 문자열) : 특정 위치에 원하는 문자열을 삽입.
		 * - subString(시작위치,끝위치) : 시작위치에서 끝위치-1 까지의 문자열 추출(공백 포함)
		 * 								인덱스는 0부터 시작하며, 끝위치보다 작아야한다.
		 * - toString() : 메서드를 이용해서 String으로 변경한다.
		 */
		
		StringBuffer sb = new StringBuffer();
		// - 추가 : append()
		sb.append("즐겁게 ");
		sb.append("춤을 추다가 ");
		sb.append("그대로 ");
		sb.append("멈춰라!");
		
		System.out.println(sb);
		System.out.println(sb.toString());
		
		//- 삽입 : insert(시작위치, 문자열);
		sb.insert(11, "순살치킨");
		System.out.println(sb);
		
		//- subString(시작위치,끝위치) : 시작위치에서 끝위치-1 까지의 문자열 추출(공백 포함)
		String str = sb.substring(4, 8);
		System.out.println(str);
		
	}
}
