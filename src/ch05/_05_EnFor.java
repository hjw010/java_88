package ch05;

public class _05_EnFor {

	public static void main(String[] args) {
		
		
		/*
		 * p 218 
		 * 향상된 for문 - > 중요
		 * 
		 * 배열의 처음부터 끝까지 모든 요소를 참조할 때 사용 하는 반복문
		 * 배열 요소값을 순서대로 하나씩 가져와서 변수에 대입한다.
		 * 따로 초기화와 종료조건이 없기 때문에, 모든 배열의 시작요소부터 끝요소깢 ㅣ실행한다.
		 * for (배열의 형 변수 : 배열) {
		 * 		실행문1
		 * }
		 * */
		
		//enhaced for
		String[] strArray = {"자바","C","파이썬","아두이노","안드로이드"};
		
		for (String str : strArray) {
			System.out.println(str);
		}
		
	}
}
